package com.ricettadem.components;

import com.ricettadem.helper.AuthorizationHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.File;

@Component
public class SOAPClientComponent {

    @Value("${ws.credentials.file-path}")
    private String credentialsFilePath;

    @Value("${ws.uri.dpcminvio-ricetta}")
    private String uriInvioRicettaDpcm;

    @Value("${dpcm.ricetta.response.ok.file-path}")
    private String ricettaResponseFilePath;

    @Value("${dpcm.ricetta.response.ko.file-path}")
    private String ricettaErrorResponseFilePath;

    public void sendInvioRicettaDpcm(String fileName, File file) throws Exception{

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

        String authorization = AuthorizationHelper.createCredentials(credentialsFilePath);
        MimeHeaders hd = soapMessage.getMimeHeaders();
        hd.addHeader("Authorization", "Basic " + authorization);

        AttachmentPart attachment = soapMessage.createAttachmentPart();
        attachment.setContent(file, "application/zip");
        attachment.setContentId(fileName);
        soapMessage.addAttachmentPart(attachment);


        soapMessage.saveChanges();

    }

}
