package com.ricettadem.components;

import com.ricettadem.core.BinaryDataSource;
import com.ricettadem.helper.AuthorizationHelper;
import com.ricettadem.services.dpcm.RicettaMirService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

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

    public void sendInvioRicettaDpcm(String fileName, File file) throws Exception{

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
        logger.info("Soap message successfully sent");

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

}
