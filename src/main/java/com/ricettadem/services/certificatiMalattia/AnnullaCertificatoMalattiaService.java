package com.ricettadem.services.certificatiMalattia;

import com.ricettadem.components.SOAPSpringClientComponent;
import com.ricettadem.helper.CsvHelper;
import com.ricettadem.model.certificatiMalattia.CertificatoMalattia;
import com.ricettadem.soap.certificatiMalattia.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AnnullaCertificatoMalattiaService {

    private static Logger logger = LoggerFactory.getLogger(AnnullaCertificatoMalattiaService.class);

    private static final String ESITO_OK = "0000";

    @Value("${csv.delimiter}")
    private String delimiter;

    @Value("${certificati-malattia.num-campi}")
    private Integer certificatoMalattiaNumCampi;

    @Value("${certificati-malattia.inizio-lettura}")
    private Integer certificatoMalattiaInizioLettura;

    @Value("${ws.uri.certificati-malattia}")
    private String uriInvioCertificatoMalattia;

    @Value("${certificati-malattia.request.file-path}")
    private String certificatoMalattiaFilePath;

    @Value("${certificati-malattia.response.ok.file-path}")
    private String certificatoMalattiaResponseFilePath;

    @Value("${certificati-malattia.response.ko.file-path}")
    private String certificatoMalattiaErrorResponseFilePath;

    @Autowired
    private SOAPSpringClientComponent soapSpringClientComponent;

    @Autowired
    WebServiceTemplate webServiceTemplateCertificatiMalattia;

    @Autowired
    HttpComponentsMessageSender httpComponentsMessageSender2;


    public void invia() throws Exception{
        logger.info("ANNULLA CERTIFICATO MALATTIA");
        logger.info("Parsing the file...");
        CertificatoMalattia certificatoMalattia = CsvHelper.readCertificatoMalattiaCsv(certificatoMalattiaFilePath, delimiter, certificatoMalattiaNumCampi, certificatoMalattiaInizioLettura);
        logger.info("Certificato malattia retrieved from file: " + certificatoMalattia.toString());

        logger.info("Creating the soap request...");
        InvioMalattiaRequest request = soapSpringClientComponent.createCertificatoMalattiaRichiesta(certificatoMalattia);
        logger.info("Soap request successfully created");

        InvioMalattiaResponse response = null;
        logger.info("Performing the soap request...");
        webServiceTemplateCertificatiMalattia.setDefaultUri(uriInvioCertificatoMalattia);
        response = (InvioMalattiaResponse)webServiceTemplateCertificatiMalattia.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

        logger.info("Creating the response file...");

        RicevutaNonOk ricevutaNonOk = response.getRicevutaNonOk();
        RicevutaOkInvioMalattia ricevutaOkInvioMalattia = response.getRicevutaOkInvioMalattia();
        if(ricevutaNonOk != null){
            logger.error("Response KO");

            List<Errore> errori = ricevutaNonOk.getErrore();

            try{
                BufferedWriter bw = null;
                try{
                    File responseFile = new  File(certificatoMalattiaErrorResponseFilePath);
                    if(responseFile != null && responseFile.exists()){
                        responseFile.delete();
                    }
                    FileWriter fw = new FileWriter(responseFile, true);
                    bw = new BufferedWriter(fw);

                    for(Errore errore: errori){
                        logger.error("Tipo errore: " + errore.getTipoErrore());
                        logger.error("Sezione errata: " + errore.getSezioneErrata());
                        logger.error("Descrizione: " + errore.getDescrizione());

                        bw.write("Tipo errore: " + errore.getTipoErrore());
                        bw.newLine();
                        bw.write("Sezione errata: " + errore.getSezioneErrata());
                        bw.newLine();
                        bw.write("Descrizione: " + errore.getDescrizione());
                        bw.newLine();
                    }
                }finally{
                    bw.close();
                }

            } catch(Exception e){
                logger.error("Error creating response file", e);
                throw e;
            }

        } else if(ricevutaOkInvioMalattia != null){
            logger.info("Response OK");

            String idCertificato = ricevutaOkInvioMalattia.getIdCertificato();
            Date date = ricevutaOkInvioMalattia.getDataRicezione().toGregorianCalendar().getTime();
            String formattedDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);

            logger.info("Id certificato: "+idCertificato);
            logger.info("Data ricezione: "+formattedDate);

            try{
                BufferedWriter bw = null;
                try{
                    File responseFile = new  File(certificatoMalattiaResponseFilePath);
                    if(responseFile != null && responseFile.exists()){
                        responseFile.delete();
                    }
                    FileWriter fw = new FileWriter(responseFile, true);
                    bw = new BufferedWriter(fw);

                    bw.write("Id certificato: " + idCertificato);
                    bw.newLine();
                    bw.write("Data ricezione: " + formattedDate);
                    bw.newLine();
                }finally{
                    bw.close();
                }

            } catch(Exception e){
                logger.error("Error creating response file", e);
                throw e;
            }
        }

        logger.info("Response file successfully created");
    }

}
