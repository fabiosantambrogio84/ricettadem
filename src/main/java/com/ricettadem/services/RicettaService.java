package com.ricettadem.services;

import com.ricettadem.helper.CsvHelper;
import com.ricettadem.helper.RequestHelper;
import com.ricettadem.model.Ricetta;
import com.ricettadem.soap.*;
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

    @Value("${ricetta.response.folder-path}")
    private String ricettaResponseFolderPath;

    @Value("${ricetta.response.file-name}")
    private String ricettaResponseFileName;

    @Autowired
    private RequestHelper requestHelper;

    @Autowired
    WebServiceTemplate webServiceTemplate;


    public void invia() throws Exception{
        logger.info("INVIO RICETTA DEMATERIALIZZATA");
        logger.info("Parsing the file...");
        Ricetta ricetta = CsvHelper.readRicettaCsv(ricettaFilePath, delimiter, ricettaNumCampi, ricettaPrescrizioneNumCampi);
        logger.info("Ricetta retrieved from file: " + ricetta.toString());

        logger.info("Creating the soap request...");
        InvioPrescrittoRichiesta request = requestHelper.createInvioPrescrittoRichiesta(ricetta);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        webServiceTemplate.setDefaultUri(uriInvioRicetta);
        InvioPrescrittoRicevuta response = (InvioPrescrittoRicevuta)webServiceTemplate.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

        logger.info("Creating the response file...");
        File responseFile = new  File(ricettaResponseFolderPath + "/" + ricettaResponseFileName);
        if(responseFile != null && responseFile.exists()){
            responseFile.delete();
        }
        FileWriter fw = new FileWriter(responseFile, true);
        BufferedWriter bw = new BufferedWriter(fw);

        String nreOutput = "NRE: " + response.getNre();
        String codiceAutenticazioneOutput = "Codice Autenticazione: " + response.getCodAutenticazione();
        String dataInserimentoOutput = "Data Inserimento: " + response.getDataInserimento();
        String codiceEsitoInserimentoOutput = "Codice Esito Inserimento: " + response.getCodEsitoInserimento();
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
        bw.close();

        logger.info("Response file successfully created");
    }
}
