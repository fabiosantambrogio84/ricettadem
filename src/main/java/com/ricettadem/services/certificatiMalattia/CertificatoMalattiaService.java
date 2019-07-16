package com.ricettadem.services.certificatiMalattia;

import com.ricettadem.components.SOAPSpringClientComponent;
import com.ricettadem.helper.CsvHelper;
import com.ricettadem.model.Ricetta;
import com.ricettadem.model.certificatiMalattia.CertificatoMalattia;
import com.ricettadem.soap.certificatiMalattia.InvioMalattiaRequest;
import com.ricettadem.soap.certificatiMalattia.InvioMalattiaResponse;
import com.ricettadem.soap.invioPrescritto.*;
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
import java.util.List;

@Service
public class CertificatoMalattiaService {

    private static Logger logger = LoggerFactory.getLogger(CertificatoMalattiaService.class);

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
        logger.info("INVIO CERTIFICATO MALATTIA");
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

        /*

        logger.info("Creating the response file...");

        String nreOutput = "NRE: " + response.getNre();
        String codiceAutenticazioneOutput = "Codice Autenticazione: " + response.getCodAutenticazione();
        String dataInserimentoOutput = "Data Inserimento: " + response.getDataInserimento();
        String codiceEsitoInserimentoOutput = "Codice Esito Inserimento: " + response.getCodEsitoInserimento();

        logger.info("Esito operazione: " + response.getCodEsitoInserimento());

        try{
            if(response.getCodEsitoInserimento() != null){
                if(response.getCodEsitoInserimento().equals(ESITO_OK)){
                    logger.info("Creating the response file...");
                    createRicevutaFile(nreOutput, codiceAutenticazioneOutput, dataInserimentoOutput, codiceEsitoInserimentoOutput);
                    logger.info("Response file successfully created");
                } else{
                    logger.info("Creating the response file...");
                    createRicevutaFile(nreOutput, codiceAutenticazioneOutput, dataInserimentoOutput, codiceEsitoInserimentoOutput);
                    logger.info("Response file successfully created");

                    logger.info("Creating the error response file...");
                    createRicevutaErrorFile(nreOutput, codiceAutenticazioneOutput, dataInserimentoOutput, codiceEsitoInserimentoOutput, response);
                    logger.info("Error response file successfully created");
                }
            }

        } catch(Exception e){
            logger.error("Error creating response file", e);
            throw e;
        }

        logger.info("Response file successfully created");
        */
    }

    /*
    private void createRicevutaFile(String nreOutput, String codiceAutenticazioneOutput, String dataInserimentoOutput, String codiceEsitoInserimentoOutput) throws Exception{
        BufferedWriter bw = null;
        try{
            File responseFile = new  File(ricettaResponseFilePath);
            if(responseFile != null && responseFile.exists()){
                responseFile.delete();
            }
            FileWriter fw = new FileWriter(responseFile, true);
            bw = new BufferedWriter(fw);

            bw.write(nreOutput);
            bw.newLine();
            bw.write(codiceAutenticazioneOutput);
            bw.newLine();
            bw.write(dataInserimentoOutput);
            bw.newLine();
            bw.write(codiceEsitoInserimentoOutput);
            bw.newLine();
        }finally{
            bw.close();
        }
    }

    private void createRicevutaErrorFile(String nreOutput, String codiceAutenticazioneOutput, String dataInserimentoOutput, String codiceEsitoInserimentoOutput, InvioPrescrittoRicevuta response) throws Exception {
        BufferedWriter bw = null;
        try{
            File errorResponseFile = new  File(ricettaErrorResponseFilePath);
            if(errorResponseFile != null && errorResponseFile.exists()){
                errorResponseFile.delete();
            }
            FileWriter fw = new FileWriter(errorResponseFile, true);
            bw = new BufferedWriter(fw);

            bw.write(nreOutput);
            bw.newLine();
            bw.write(codiceAutenticazioneOutput);
            bw.newLine();
            bw.write(dataInserimentoOutput);
            bw.newLine();
            bw.write(codiceEsitoInserimentoOutput);
            bw.newLine();

            // Errori
            ElencoErroriRicetteType elencoErroriRicetteType = response.getElencoErroriRicette();
            if(elencoErroriRicetteType != null){
                List<ErroreRicettaType> erroriRicettaType = elencoErroriRicetteType.getErroreRicetta();
                if(erroriRicettaType != null && !erroriRicettaType.isEmpty()){
                    bw.newLine();
                    bw.write("Elenco Errori:");
                    bw.newLine();
                    for(ErroreRicettaType erroreRicettaType: erroriRicettaType){
                        bw.write("Errore:");
                        bw.newLine();
                        bw.write("Codice Esito: " + erroreRicettaType.getCodEsito());
                        bw.newLine();
                        bw.write("Esito: " + erroreRicettaType.getEsito());
                        bw.newLine();
                        bw.write("Progr. Presc.: " + erroreRicettaType.getProgPresc());
                        bw.newLine();
                        bw.write("Tipo Errore: " + erroreRicettaType.getTipoErrore());
                        bw.newLine();
                    }
                }
            }
            // Comunicazioni
            ElencoComunicazioniType elencoComunicazioniType = response.getElencoComunicazioni();
            if(elencoComunicazioniType != null){
                List<ComunicazioneType> comunicazioneTypes = elencoComunicazioniType.getComunicazione();
                if(comunicazioneTypes != null && !comunicazioneTypes.isEmpty()){
                    bw.newLine();
                    bw.write("Elenco Comunicazioni:");
                    bw.newLine();
                    for(ComunicazioneType comunicazioneType : comunicazioneTypes){
                        bw.write("Comunicazione:");
                        bw.newLine();
                        bw.write("Codice: " + comunicazioneType.getCodice());
                        bw.newLine();
                        bw.write("Messaggio: " + comunicazioneType.getMessaggio());
                        bw.newLine();
                    }
                }
            }
        } finally{
            bw.close();
        }
    }
    */
}
