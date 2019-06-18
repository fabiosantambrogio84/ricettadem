package com.ricettadem.services;

import com.ricettadem.helper.CsvHelper;
import com.ricettadem.components.SOAPSpringClientComponent;
import com.ricettadem.model.Ricetta;
import com.ricettadem.soap.invioPrescritto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

@Service
public class RicettaService {

    private static Logger logger = LoggerFactory.getLogger(RicettaService.class);

    private static final String ESITO_OK = "0000";

    private static final String ESITO_KO_BLOCCANTE = "9999";

    @Value("${csv.delimiter}")
    private String delimiter;

    @Value("${ricetta.num-campi}")
    private Integer ricettaNumCampi;

    @Value("${ricetta.prescrizione-num-campi}")
    private Integer ricettaPrescrizioneNumCampi;

    @Value("${ws.uri.invio-ricetta}")
    private String uriInvioRicetta;

    @Value("${ricetta.request.file-path}")
    private String ricettaFilePath;

    @Value("${ricetta.response.ok.file-path}")
    private String ricettaResponseFilePath;

    @Value("${ricetta.response.ko.file-path}")
    private String ricettaErrorResponseFilePath;

    @Autowired
    private SOAPSpringClientComponent soapSpringClientComponent;

    @Autowired
    WebServiceTemplate webServiceTemplateInvioPrescritto;


    public void invia(String region) throws Exception{
        logger.info("INVIO RICETTA DEMATERIALIZZATA");
        logger.info("Parsing the file...");
        Ricetta ricetta = CsvHelper.readRicettaCsv(ricettaFilePath, delimiter, ricettaNumCampi, ricettaPrescrizioneNumCampi, region);
        logger.info("RicettaDpcm retrieved from file: " + ricetta.toString());

        logger.info("Creating the soap request...");
        InvioPrescrittoRichiesta request = soapSpringClientComponent.createInvioPrescrittoRichiesta(ricetta);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        webServiceTemplateInvioPrescritto.setDefaultUri(uriInvioRicetta);
        InvioPrescrittoRicevuta response = (InvioPrescrittoRicevuta)webServiceTemplateInvioPrescritto.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

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
    }

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
}
