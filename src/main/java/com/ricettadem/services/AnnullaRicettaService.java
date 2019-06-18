package com.ricettadem.services;

import com.ricettadem.helper.CsvHelper;
import com.ricettadem.components.SOAPSpringClientComponent;
import com.ricettadem.model.AnnullaRicetta;
import com.ricettadem.soap.annullaPrescritto.*;

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
public class AnnullaRicettaService {

    private static Logger logger = LoggerFactory.getLogger(AnnullaRicettaService.class);

    private static final String ESITO_OK = "0000";

    @Value("${csv.delimiter}")
    private String delimiter;

    @Value("${annulla-ricetta.num-campi}")
    private Integer annullaRicettaNumCampi;

    @Value("${ws.uri.annulla-ricetta}")
    private String uriAnnullaRicetta;

    @Value("${annulla-ricetta.request.file-path}")
    private String annullaRicettaFilePath;

    @Value("${annulla-ricetta.response.ok.file-path}")
    private String annullaRicettaResponseFilePath;

    @Value("${annulla-ricetta.response.ok.file-path}")
    private String annullaRicettaErrorResponseFilePath;

    @Autowired
    private SOAPSpringClientComponent soapSpringClientComponent;

    @Autowired
    WebServiceTemplate webServiceTemplateAnnullaPrescritto;


    public void invia() throws Exception{
        logger.info("INVIO ANNULLA RICETTA");
        logger.info("Parsing the file...");
        AnnullaRicetta annullaRicetta = CsvHelper.readAnnullaRicettaCsv(annullaRicettaFilePath, delimiter, annullaRicettaNumCampi);
        logger.info("Richiesta lotti nre retrieved from file: " + annullaRicetta.toString());

        logger.info("Creating the soap request...");
        AnnullaPrescrittoRichiesta request = soapSpringClientComponent.createAnnullaRicettaRichiesta(annullaRicetta);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        webServiceTemplateAnnullaPrescritto.setDefaultUri(uriAnnullaRicetta);
        AnnullaPrescrittoRicevuta response = (AnnullaPrescrittoRicevuta)webServiceTemplateAnnullaPrescritto.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

        logger.info("Creating the response file...");

        String codEsitoAnnullamentoOutput = "Codice Annullamento: " + response.getCodEsitoAnnullamento();
        String nreOutput = "NRE: " + response.getNre();

        BufferedWriter bw = null;
        try{
            if(response.getCodEsitoAnnullamento() != null && response.getCodEsitoAnnullamento().equals(ESITO_OK)){
                File responseFile = new  File(annullaRicettaResponseFilePath);
                if(responseFile != null && responseFile.exists()){
                    responseFile.delete();
                }
                FileWriter fw = new FileWriter(responseFile, true);
                bw = new BufferedWriter(fw);

                bw.write(nreOutput);
                bw.newLine();
                bw.write(codEsitoAnnullamentoOutput);
                bw.newLine();

            } else{
                logger.info("Creating the error response file...");

                File errorResponseFile = new  File(annullaRicettaErrorResponseFilePath);
                if(errorResponseFile != null && errorResponseFile.exists()){
                    errorResponseFile.delete();
                }
                FileWriter fw = new FileWriter(errorResponseFile, true);
                bw = new BufferedWriter(fw);

                bw.write(nreOutput);
                bw.newLine();
                bw.write(codEsitoAnnullamentoOutput);
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
            }

        } catch(Exception e){
            bw.close();
            logger.error("Error creating response file", e);
            throw e;
        } finally{
            bw.close();
        }

        logger.info("Response file successfully created");
    }
}
