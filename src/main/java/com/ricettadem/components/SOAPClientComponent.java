package com.ricettadem.components;

import com.ricettadem.helper.AuthorizationHelper;
import com.ricettadem.model.dpcm.RicettaDpcmInvioResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.net.ssl.*;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.Iterator;

@Component
public class SOAPClientComponent {

    private static Logger logger = LoggerFactory.getLogger(SOAPClientComponent.class);

    @Value("${ws.credentials.file-path}")
    private String credentialsFilePath;

    @Value("${ws.uri.dpcm.invio-ricetta}")
    private String uriInvioRicettaDpcm;

    @Value("${dpcm.ricetta.response.ok.file-path}")
    private String ricettaResponseFilePath;

    @Value("${dpcm.ricetta.response.ko.file-path}")
    private String ricettaErrorResponseFilePath;

    public RicettaDpcmInvioResponse sendInvioRicettaDpcm(String fileName, File file) throws Exception{

        // Create SSL context and trust all certificates
        SSLContext sslContext = SSLContext.getInstance("SSL");
        TrustManager[] trustAll = new TrustManager[] {new TrustAllCertificates()};
        sslContext.init(null, trustAll, new java.security.SecureRandom());
        // Set trust all certificates context to HttpsURLConnection
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

        URL url = new URL(uriInvioRicettaDpcm);
        HttpsURLConnection httpsConnection = (HttpsURLConnection) url.openConnection();
        // Trust all hosts
        httpsConnection.setHostnameVerifier(new TrustAllHosts());
        // Connect
        httpsConnection.connect();

        RicettaDpcmInvioResponse ricettaDpcmInvioResponse = null;

        SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();

        SOAPConnection soapConnection = factory.createConnection();

        logger.info("Creating the soap message...");

        // Create SOAP Message
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();

        SOAPBody soapBody = soapMessage.getSOAPBody();
        soapEnvelope.getHeader().detachNode();

        QName bodyName = new QName("urn:attachment.ws.it", "inputBean", "urn");
        SOAPBodyElement bodyElement = soapBody.addBodyElement(bodyName);

        QName nomeFileAllegatoQN = new QName("nomeFileAllegato");
        SOAPElement nomeFileAllegato = bodyElement.addChildElement(nomeFileAllegatoQN);
        nomeFileAllegato.addTextNode(fileName);

        bodyElement.addChildElement(new QName("telematico1"));
        bodyElement.addChildElement(new QName("telematico2"));
        bodyElement.addChildElement(new QName("telematico3"));

        logger.info("Adding authorization header...");

        String authorization = AuthorizationHelper.createCredentials(credentialsFilePath);
        MimeHeaders hd = soapMessage.getMimeHeaders();
        hd.addHeader("Authorization", "Basic " + authorization);
        hd.addHeader("Content-Type", "multipart/related; type=\"text/xml\";");
        hd.addHeader("Accept-Encoding", "gzip,deflate");

        logger.info("Authorization header successfully added: 'Basic " + authorization + "'");

        logger.info("Adding attachment part...");
        DataHandler dh = new DataHandler(new FileDataSource(file));
        AttachmentPart attachment = soapMessage.createAttachmentPart(dh);
        soapMessage.addAttachmentPart(attachment);

        logger.info("Attachment part successfully added");

        soapMessage.saveChanges();

        logger.info("Soap message successfully created. " + getPrintableSoapMessage(soapMessage));

        logger.info("Sending the soap message...");
        SOAPMessage response = soapConnection.call(soapMessage, uriInvioRicettaDpcm);
        if(response != null){
            ricettaDpcmInvioResponse = new RicettaDpcmInvioResponse();

            SOAPBody responseBody = response.getSOAPBody();
            SOAPElement ricevutaElem = (SOAPElement)responseBody.getFirstChild();
            Iterator<SOAPElement> childElements = ricevutaElem.getChildElements();
            while(childElements.hasNext()){
                SOAPElement element = childElements.next();
                String localName = element.getElementName().getLocalName();
                switch (localName) {
                    case "protocolloSAC":
                        ricettaDpcmInvioResponse.setProtocolloSAC(element.getValue());
                        break;
                    case "dataAccoglienza":
                        ricettaDpcmInvioResponse.setDataAccoglienza(element.getValue());
                        break;
                    case "nomeFileAllegato":
                        ricettaDpcmInvioResponse.setNomeFileAllegato(element.getValue());
                        break;
                    case "dimensioneFileAllegato":
                        ricettaDpcmInvioResponse.setDimensioneFileAllegato(element.getValue());
                        break;
                    case "codiceEsito":
                        ricettaDpcmInvioResponse.setCodiceEsito(element.getValue());
                        break;
                    default:
                        ricettaDpcmInvioResponse.setDescrizioneEsito(element.getValue());
                }

            }
        }
        logger.info("Soap message successfully sent");

        if(ricettaDpcmInvioResponse != null){
            logger.info("Response is: " + ricettaDpcmInvioResponse.toString());
        }

        httpsConnection.disconnect();

        return ricettaDpcmInvioResponse;
    }

    private String getPrintableSoapMessage(SOAPMessage soapMessage){
        String result = "";
        ByteArrayOutputStream out = null;
        try{
            out = new ByteArrayOutputStream();
            soapMessage.writeTo(out);
            return new String(out.toByteArray());
        }catch(Exception e){
            return soapMessage.toString();
        } finally{
            try{
                out.close();
            } catch(Exception e){

            }
        }
    }

    public static class TrustAllCertificates implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] certs, String authType) {
        }

        public void checkServerTrusted(X509Certificate[] certs, String authType) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    private static class TrustAllHosts implements HostnameVerifier {
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }

}
