package com.ricettadem.services.dpcm;

import com.ricettadem.helper.CsvHelper;
import com.ricettadem.helper.RequestHelper;
import com.ricettadem.model.Ricetta;
import com.ricettadem.model.dpcm.RicettaMir;
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
public class RicettaMirService {

    private static Logger logger = LoggerFactory.getLogger(RicettaMirService.class);

    private static final String ESITO_OK = "0000";

    @Value("${csv.delimiter}")
    private String delimiter;

    @Value("${dpcm.ricetta.num-campi}")
    private Integer ricettaDpcmNumCampi;

    @Value("${dpcm.ricetta.testata-num-campi}")
    private Integer ricettaDpcmTestataNumCampi;

    @Value("${dpcm.ricetta.prescrizione-num-campi}")
    private Integer ricettaDpcmPrescrizioneNumCampi;

    @Value("${ws.uri.dpcm.invio-ricetta}")
    private String uriInvioRicettaDpcm;

    @Value("${dpcm.ricetta.request.file-path}")
    private String ricettaDpcmFilePath;

    @Value("${dpcm.ricetta.response.ok.file-path}")
    private String ricettaDpcmResponseFilePath;

    @Value("${dpcm.ricetta.response.ko.file-path}")
    private String ricettaDpcmErrorResponseFilePath;

    @Value("${dpcm.ricetta.tmp-folder-path}")
    private String ricettaDpcmTmpFolderPath;

    @Value("${dpcm.ricetta.tmp-folder-delete}")
    private String ricettaDpcmDeleteTmpFolder;

    @Autowired
    private RequestHelper requestHelper;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    public void invia() throws Exception{
        logger.info("INVIO RICETTA DPCM DEMATERIALIZZATA");
        logger.info("Parsing the file...");
        RicettaMir ricettaMir = CsvHelper.readRicettaDpcmCsv(ricettaDpcmFilePath, delimiter, ricettaDpcmTestataNumCampi, ricettaDpcmNumCampi, ricettaDpcmPrescrizioneNumCampi);
        logger.info("Ricetta DPCM retrieved from file: " + ricettaMir.toString());

        logger.info("Creating the xml file...");
        // TODO: encrypt values
        logger.info("File xml successfully created");

        logger.info("Creating the zip file...");

        logger.info("File zip successfully created");

        logger.info("Creating the soap request...");
        //InvioPrescrittoRichiesta request = requestHelper.createInvioPrescrittoRichiesta(ricetta);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        //webServiceTemplate.setDefaultUri(uriInvioRicetta);
        //InvioPrescrittoRicevuta response = (InvioPrescrittoRicevuta)webServiceTemplate.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

        logger.info("Creating the response file...");

        /*
        String nreOutput = "NRE: " + response.getNre();
        String codiceAutenticazioneOutput = "Codice Autenticazione: " + response.getCodAutenticazione();
        String dataInserimentoOutput = "Data Inserimento: " + response.getDataInserimento();
        String codiceEsitoInserimentoOutput = "Codice Esito Inserimento: " + response.getCodEsitoInserimento();

        BufferedWriter bw = null;
        try{
            if(response.getCodEsitoInserimento() != null && response.getCodEsitoInserimento().equals(ESITO_OK)){
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

            } else{
                logger.info("Creating the error response file...");

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
            }

        } catch(Exception e){
            bw.close();
            logger.error("Error creating response file", e);
            throw e;
        } finally{
            bw.close();
        }
        */
        logger.info("Response file successfully created");
    }
}
