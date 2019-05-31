package com.ricettadem.services;

import com.ricettadem.helper.CsvHelper;
import com.ricettadem.helper.RequestHelper;
import com.ricettadem.model.RichiestaLottiNre;
import com.ricettadem.soap.richiestaLottiNre.LottoRicevutaNRE;
import com.ricettadem.soap.richiestaLottiNre.LottoRichiestaNRE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class RichiestaLottiNreService {

    private static Logger logger = LoggerFactory.getLogger(RichiestaLottiNreService.class);

    private static final String ESITO_OK = "00";

    @Value("${csv.delimiter}")
    private String delimiter;

    @Value("${richiesta-lotti-nre.num-campi}")
    private Integer richiestaLottiNreNumCampi;

    @Value("${ws.uri.richiesta-lotti-nre}")
    private String uriRichiestaLottiNre;

    @Value("${richiesta-lotti-nre.request.file-path}")
    private String richiestaLottiNreFilePath;

    @Value("${richiesta-lotti-nre.response.ok.file-path}")
    private String richiestaLottiNreResponseFilePath;

    @Value("${richiesta-lotti-nre.response.ko.file-path}")
    private String richiestaLottiNreErrorResponseFilePath;

    @Autowired
    private RequestHelper requestHelper;

    @Autowired
    WebServiceTemplate webServiceTemplate;


    public void invia() throws Exception{
        logger.info("INVIO RICHISTA LOTTI NRE");
        logger.info("Parsing the file...");
        RichiestaLottiNre richiestaLottiNre = CsvHelper.readRichiestaLottiNreCsv(richiestaLottiNreFilePath, delimiter, richiestaLottiNreNumCampi);
        logger.info("Richiesta lotti nre retrieved from file: " + richiestaLottiNre.toString());

        logger.info("Creating the soap request...");
        LottoRichiestaNRE request = requestHelper.createRichiestaLottiNreRichiesta(richiestaLottiNre);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        webServiceTemplate.setDefaultUri(uriRichiestaLottiNre);
        LottoRicevutaNRE response = (LottoRicevutaNRE)webServiceTemplate.marshalSendAndReceive(request);
        logger.info("Soap request successfully performed");

        logger.info("Creating the response file...");

//        String codRegioneOutput = "Codice Regione: " + response.get;
//        String codiceAutenticazioneOutput = "Codice Autenticazione: " + response.getCodAutenticazione();
//        String dataInserimentoOutput = "Data Inserimento: " + response.getDataInserimento();
//        String codiceEsitoInserimentoOutput = "Codice Esito Inserimento: " + response.getCodEsitoInserimento();
//
//        BufferedWriter bw = null;
//        try{
//            if(codiceEsitoInserimentoOutput != null && codiceEsitoInserimentoOutput.equals(ESITO_OK)){
//                File responseFile = new  File(ricettaResponseFolderPath + "/" + ricettaResponseFileName);
//                if(responseFile != null && responseFile.exists()){
//                    responseFile.delete();
//                }
//                FileWriter fw = new FileWriter(responseFile, true);
//                bw = new BufferedWriter(fw);
//
//                bw.write(nreOutput);
//                bw.newLine();
//                bw.write(codiceAutenticazioneOutput);
//                bw.newLine();
//                bw.write(dataInserimentoOutput);
//                bw.newLine();
//                bw.write(codiceEsitoInserimentoOutput);
//
//            } else{
//                logger.info("Creating the error response file...");
//
//                File errorResponseFile = new  File(ricettaResponseFolderPath + "/" + ricettaErrorResponseFileName);
//                if(errorResponseFile != null && errorResponseFile.exists()){
//                    errorResponseFile.delete();
//                }
//                FileWriter fw = new FileWriter(errorResponseFile, true);
//                bw = new BufferedWriter(fw);
//
//                bw.write(nreOutput);
//                bw.newLine();
//                bw.write(codiceAutenticazioneOutput);
//                bw.newLine();
//                bw.write(dataInserimentoOutput);
//                bw.newLine();
//                bw.write(codiceEsitoInserimentoOutput);
//                bw.newLine();
//
//                // Errori
//                ElencoErroriRicetteType elencoErroriRicetteType = response.getElencoErroriRicette();
//                if(elencoErroriRicetteType != null){
//                    List<ErroreRicettaType> erroriRicettaType = elencoErroriRicetteType.getErroreRicetta();
//                    if(erroriRicettaType != null && !erroriRicettaType.isEmpty()){
//                        bw.newLine();
//                        bw.write("Elenco Errori:");
//                        bw.newLine();
//                        for(ErroreRicettaType erroreRicettaType: erroriRicettaType){
//                            bw.write("Errore:");
//                            bw.newLine();
//                            bw.write("Codice Esito: " + erroreRicettaType.getCodEsito());
//                            bw.newLine();
//                            bw.write("Esito: " + erroreRicettaType.getEsito());
//                            bw.newLine();
//                            bw.write("Progr. Presc.: " + erroreRicettaType.getProgPresc());
//                            bw.newLine();
//                            bw.write("Tipo Errore: " + erroreRicettaType.getTipoErrore());
//                            bw.newLine();
//                        }
//                    }
//                }
//                // Comunicazioni
//                ElencoComunicazioniType elencoComunicazioniType = response.getElencoComunicazioni();
//                if(elencoComunicazioniType != null){
//                    List<ComunicazioneType> comunicazioneTypes = elencoComunicazioniType.getComunicazione();
//                    if(comunicazioneTypes != null && !comunicazioneTypes.isEmpty()){
//                        bw.newLine();
//                        bw.write("Elenco Comunicazioni:");
//                        bw.newLine();
//                        for(ComunicazioneType comunicazioneType : comunicazioneTypes){
//                            bw.write("Comunicazione:");
//                            bw.newLine();
//                            bw.write("Codice: " + comunicazioneType.getCodice());
//                            bw.newLine();
//                            bw.write("Messaggio: " + comunicazioneType.getMessaggio());
//                            bw.newLine();
//                        }
//                    }
//                }
//            }
//
//        } catch(Exception e){
//            bw.close();
//            logger.error("Error creating response file", e);
//            throw e;
//        } finally{
//            bw.close();
//        }

        logger.info("Response file successfully created");
    }
}
