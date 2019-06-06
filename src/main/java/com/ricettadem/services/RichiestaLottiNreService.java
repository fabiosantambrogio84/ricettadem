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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

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

        String codRegioneOutput = "Codice Regione: " + response.getCodRegione();
        String codRaggruppamentoLottoOutput = "Codice Raggruppamento Lotto: " + response.getCodRagLotto();
        String idLottoOutput = "Identificativo Lotto: " + response.getIdentificativoLotto();
        String codLottoOutput = "Codice Lotto: " + response.getCodLotto();
        String codEsitoRichiestaOutput = "Codice Esito Richiesta: " + response.getCodEsito();
        String esitoRichiestaOutput = "Esito Richiesta: " + response.getEsito();

        BufferedWriter bw = null;
        try{
            File responseFile = null;
            if(response.getCodEsito() != null && response.getCodEsito().equals(ESITO_OK)) {
                responseFile = new File(richiestaLottiNreResponseFilePath);
            } else{
                logger.info("Creating the error response file...");
                responseFile = new File(richiestaLottiNreErrorResponseFilePath);
            }
            if(responseFile != null && responseFile.exists()){
                responseFile.delete();
            }
            FileWriter fw = new FileWriter(responseFile, true);
            bw = new BufferedWriter(fw);

            bw.write(codRegioneOutput);
            bw.newLine();
            bw.write(codRaggruppamentoLottoOutput);
            bw.newLine();
            bw.write(idLottoOutput);
            bw.newLine();
            bw.write(codLottoOutput);
            bw.newLine();
            bw.write(codEsitoRichiestaOutput);
            bw.newLine();
            bw.write(esitoRichiestaOutput);

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
