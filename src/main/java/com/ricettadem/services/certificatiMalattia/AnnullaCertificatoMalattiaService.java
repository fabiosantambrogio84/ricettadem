package com.ricettadem.services.certificatiMalattia;

import com.ricettadem.components.SOAPSpringClientComponent;
import com.ricettadem.helper.CsvHelper;
import com.ricettadem.model.certificatiMalattia.AnnullaCertificatoMalattia;
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

    @Value("${annulla-certificati-malattia.num-campi}")
    private Integer annullaCertificatoMalattiaNumCampi;

    @Value("${ws.uri.annulla-certificati-malattia}")
    private String uriAnnullaCertificatoMalattia;

    @Value("${annulla-certificati-malattia.request.file-path}")
    private String annullaCertificatoMalattiaFilePath;

    @Value("${annulla-certificati-malattia.response.ok.file-path}")
    private String annullaCertificatoMalattiaResponseFilePath;

    @Value("${annulla-certificati-malattia.response.ko.file-path}")
    private String annullaCertificatoMalattiaErrorResponseFilePath;

    @Autowired
    private SOAPSpringClientComponent soapSpringClientComponent;

    @Autowired
    WebServiceTemplate webServiceTemplateCertificatiMalattia;

    @Autowired
    HttpComponentsMessageSender httpComponentsMessageSender2;


    public void invia() throws Exception{
        logger.info("ANNULLA CERTIFICATO MALATTIA");
        logger.info("Parsing the file...");
        AnnullaCertificatoMalattia annullaCertificatoMalattia = CsvHelper.readAnnullaCertificatoMalattiaCsv(annullaCertificatoMalattiaFilePath, delimiter, annullaCertificatoMalattiaNumCampi);
        logger.info("Annulla certificato malattia retrieved from file: " + annullaCertificatoMalattia.toString());

        logger.info("Creating the soap request...");
        AnnullamentoMalattiaRequest request = soapSpringClientComponent.createAnnullaCertificatoMalattiaRichiesta(annullaCertificatoMalattia);
        logger.info("Soap request successfully created");

        AnnullamentoMalattiaResponse response = null;
        logger.info("Performing the soap request...");
        webServiceTemplateCertificatiMalattia.setDefaultUri(uriAnnullaCertificatoMalattia);
        response = (AnnullamentoMalattiaResponse)webServiceTemplateCertificatiMalattia.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

        logger.info("Creating the response file...");

        RicevutaNonOk ricevutaNonOk = response.getRicevutaNonOk();
        RicevutaOkAnnullamento ricevutaOkAnnullaMalattia = response.getRicevutaOkAnnullamentoMalattia();
        if(ricevutaNonOk != null){
            logger.error("Response KO");

            List<Errore> errori = ricevutaNonOk.getErrore();

            try{
                BufferedWriter bw = null;
                try{
                    File responseFile = new  File(annullaCertificatoMalattiaErrorResponseFilePath);
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

        } else if(ricevutaOkAnnullaMalattia != null){
            logger.info("Response OK");

            String idAnnullamento = ricevutaOkAnnullaMalattia.getIdAnnullamento();
            Date date = ricevutaOkAnnullaMalattia.getDataRicezione().toGregorianCalendar().getTime();
            String formattedDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);

            logger.info("Id annullamento: "+idAnnullamento);
            logger.info("Data ricezione: "+formattedDate);

            try{
                BufferedWriter bw = null;
                try{
                    File responseFile = new  File(annullaCertificatoMalattiaResponseFilePath);
                    if(responseFile != null && responseFile.exists()){
                        responseFile.delete();
                    }
                    FileWriter fw = new FileWriter(responseFile, true);
                    bw = new BufferedWriter(fw);

                    bw.write("Id annullamento: " + idAnnullamento);
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
