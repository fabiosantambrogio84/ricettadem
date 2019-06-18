package com.ricettadem.helper;

import com.ricettadem.model.AnnullaRicetta;
import com.ricettadem.model.DettaglioPrescrizione;
import com.ricettadem.model.Ricetta;
import com.ricettadem.model.RichiestaLottiNre;
import com.ricettadem.model.dpcm.Prescrizione;
import com.ricettadem.model.dpcm.RicettaDpcm;
import com.ricettadem.model.dpcm.RicettaMir;
import com.ricettadem.model.dpcm.Testata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvHelper {

    private static Logger logger = LoggerFactory.getLogger(CsvHelper.class);

    private static final String REGIONE_SICILIA = "sicilia";

    public static Ricetta readRicettaCsv(String filePath, String delimiter, Integer ricettaNumCampi, Integer ricettaPrescrizioneNumCampi, String region) throws Exception{
        Ricetta ricetta = null;

//        Path path = Paths.get(filePath);
        File path = new File(filePath);

        logger.info("Processing file '" + filePath + "'");

        List<List<String>> allValues = new ArrayList<>();

        if(path.exists()) {
            String line = "";
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(delimiter, -1);
                    allValues.add(Arrays.asList(values));
                }

            } catch (IOException e) {
                logger.error("Error reading file", e);
                throw e;
            }
        }
        if(!allValues.isEmpty()){
            List<String> values = allValues.get(0);
            if(!values.isEmpty()){
                logger.info("The file contains " + values.size() + " elements");
                if(values.size() < ricettaNumCampi){
                    throw new RuntimeException("Il file in ingresso non contiene tutti i campi necessari per creare la ricetta");
                } else{
                    // Creo la ricetta
                    ricetta = new Ricetta();
                    ricetta.setPincode(values.get(0));
                    ricetta.setCodiceFiscaleMedico(values.get(1));
                    ricetta.setCodiceFiscaleMedico2(values.get(2));
                    ricetta.setCodiceRegione(values.get(3));
                    ricetta.setCodiceAsl(values.get(4));
                    ricetta.setCodiceStruttura(values.get(5));
                    ricetta.setSpecializzazioneMedico(values.get(6));
                    ricetta.setInformazioniAggiuntive(values.get(7));
                    ricetta.setInformazioniAggiuntive2(values.get(8));
                    ricetta.setNre(values.get(9));
                    ricetta.setTipoRicetta(values.get(10));
                    ricetta.setCodiceAssistito(values.get(11));
                    ricetta.setCognomeAssistito(values.get(12));
                    ricetta.setIndirizzoAssistito(values.get(13));
                    ricetta.setOscuramentoDati(values.get(14));
                    ricetta.setNumeroTesseraSanitaria(values.get(15));
                    ricetta.setSocietaNavigazione(values.get(16));
                    ricetta.setTipoPrescrizione(values.get(17));
                    ricetta.setRicettaInterna(values.get(18));
                    ricetta.setCodiceEsenzione(values.get(19));
                    ricetta.setNonEsente(values.get(20));
                    ricetta.setReddito(values.get(21));
                    ricetta.setCodiceDiagnosi(values.get(22));
                    ricetta.setDescrizioneDiagnosi(values.get(23));
                    ricetta.setDataCompilazione(values.get(24));
                    ricetta.setTipoVisita(values.get(25));
                    ricetta.setDisposizioniRegionali(values.get(26));
                    ricetta.setProvinciaAssistito(values.get(27));
                    ricetta.setAslAssistito(values.get(28));
                    ricetta.setIndicazionePrescrizione(values.get(29));
                    ricetta.setAltro(values.get(30));
                    ricetta.setClassePriorita(values.get(31));
                    ricetta.setStatoEstero(values.get(32));
                    ricetta.setIstituzioneCompetente(values.get(33));
                    ricetta.setNumeroIdentificazionePersonale(values.get(34));
                    ricetta.setNumeroIdentificazioneTessera(values.get(35));
                    ricetta.setDataNascitaEstero(values.get(36));
                    ricetta.setDataScadenzaTessera(values.get(37));

                    logger.info("Start creating Dettagli Prescrizione...");

                    List<DettaglioPrescrizione> dettagliPrescrizione = new ArrayList<>();
                    Integer startIndex = ricettaNumCampi;

                    while(startIndex < values.size()){
                        DettaglioPrescrizione dettaglioPrescrizione = new DettaglioPrescrizione();
                        for(int i=startIndex; i<(startIndex + ricettaPrescrizioneNumCampi + 1);i++){
//                            logger.info("-> "+startIndex);
                            dettaglioPrescrizione.setCodiceProdotto(values.get(startIndex));
                            dettaglioPrescrizione.setDescrizioneProdotto(values.get(startIndex + 1));
                            dettaglioPrescrizione.setCodiceGruppoEquivalenza(values.get(startIndex + 2));
                            dettaglioPrescrizione.setDescrizioneGruppoEquivalenza(values.get(startIndex + 3));
                            dettaglioPrescrizione.setTestoLibero(values.get(startIndex + 4));
                            dettaglioPrescrizione.setDescrizioneTestoLibero(values.get(startIndex + 5));
                            dettaglioPrescrizione.setNonSostituito(values.get(startIndex + 6));
                            dettaglioPrescrizione.setNoteMotivazioni(values.get(startIndex + 7));
                            dettaglioPrescrizione.setCodiceMotivazione(values.get(startIndex + 8));
                            dettaglioPrescrizione.setNotaProdotto(values.get(startIndex + 9));
                            dettaglioPrescrizione.setQuantita(values.get(startIndex + 10));
                            dettaglioPrescrizione.setInformazioniPrescrizione(values.get(startIndex + 11));
                            dettaglioPrescrizione.setInformazioniPrescrizione2(values.get(startIndex + 12));

                            // se il file non è relativo alla regione Sicilia, proseguo con la lettura dei campi
                            if(region == null || (region != null && !region.equalsIgnoreCase(REGIONE_SICILIA))){
                                dettaglioPrescrizione.setCodiceCatalogoPrescrizione(values.get(startIndex + 13));
                                dettaglioPrescrizione.setTipoAccesso1(values.get(startIndex + 14));
                                dettaglioPrescrizione.setNumeroNota(values.get(startIndex + 15));
                                dettaglioPrescrizione.setCondizioneErogabilita(values.get(startIndex + 16));
                                dettaglioPrescrizione.setAppropriatezzaPrescrittiva(values.get(startIndex + 17));
                                dettaglioPrescrizione.setPatologia(values.get(startIndex + 18));
                            }
                        }
                        dettagliPrescrizione.add(dettaglioPrescrizione);
                        startIndex = startIndex + ricettaPrescrizioneNumCampi + 1;
                    }
                    logger.info("End creating Dettagli Prescrizione");

                    ricetta.setDettagliPrescrizione(dettagliPrescrizione);
                    logger.info("RicettaDpcm successfully created: " + ricetta.toString());
                }
            } else{
                throw new RuntimeException("Il file in ingresso è vuoto");
            }
        } else{
            throw new RuntimeException("Il file in ingresso è vuoto");
        }

        return ricetta;
    }

    public static RichiestaLottiNre readRichiestaLottiNreCsv(String filePath, String delimiter, Integer richiestaLottiNreNumCampi) throws Exception {
        RichiestaLottiNre richiestaLottiNre = null;

        Path path = Paths.get(filePath);

        logger.info("Processing file '" + filePath + "'");

        List<List<String>> allValues = new ArrayList<>();

        if (Files.exists(path)) {
            String line = "";
            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {

                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] values = line.split(delimiter);

                    allValues.add(Arrays.asList(values));
                }

            } catch (IOException e) {
                logger.error("Error reading file", e);
                throw e;
            }
        }
        if (!allValues.isEmpty()) {
            List<String> values = allValues.get(0);
            if (!values.isEmpty()) {
                logger.info("The file contains " + values.size() + " elements");
                if (values.size() < richiestaLottiNreNumCampi) {
                    throw new RuntimeException("Il file in ingresso non contiene tutti i campi necessari per creare la richiesta di lotti nre");
                } else {
                    // Creo la richiesta di lotti nre
                    richiestaLottiNre = new RichiestaLottiNre();
                    richiestaLottiNre.setCodiceRegione(values.get(0));
                    richiestaLottiNre.setParamDimensioneLotto(values.get(1));
                    richiestaLottiNre.setCodiceFiscale(values.get(2));

                    logger.info("Richiesta lotti nre successfully created: " + richiestaLottiNre.toString());
                }
            } else {
                throw new RuntimeException("Il file in ingresso è vuoto");
            }
        } else {
            throw new RuntimeException("Il file in ingresso è vuoto");
        }

        return richiestaLottiNre;
    }

    public static AnnullaRicetta readAnnullaRicettaCsv(String filePath, String delimiter, Integer annullaRicettaNumCampi) throws Exception {
        AnnullaRicetta annullaRicetta = null;

        Path path = Paths.get(filePath);

        logger.info("Processing file '" + filePath + "'");

        List<List<String>> allValues = new ArrayList<>();

        if (Files.exists(path)) {
            String line = "";
            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {

                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] values = line.split(delimiter);

                    allValues.add(Arrays.asList(values));
                }

            } catch (IOException e) {
                logger.error("Error reading file", e);
                throw e;
            }
        }
        if (!allValues.isEmpty()) {
            List<String> values = allValues.get(0);
            if (!values.isEmpty()) {
                logger.info("The file contains " + values.size() + " elements");
                if (values.size() < annullaRicettaNumCampi) {
                    throw new RuntimeException("Il file in ingresso non contiene tutti i campi necessari per creare l'annullamento di una ricetta");
                } else {
                    // Creo l'annulla ricetta
                    annullaRicetta = new AnnullaRicetta();
                    annullaRicetta.setPinCode(values.get(0));
                    annullaRicetta.setCodiceFiscale(values.get(1));
                    annullaRicetta.setNre(values.get(2));

                    logger.info("Richiesta lotti nre successfully created: " + annullaRicetta.toString());
                }
            } else {
                throw new RuntimeException("Il file in ingresso è vuoto");
            }
        } else {
            throw new RuntimeException("Il file in ingresso è vuoto");
        }

        return annullaRicetta;
    }

    public static RicettaMir readRicettaDpcmCsv(String filePath, String delimiter, Integer testataNumCampi, Integer ricettaNumCampi, Integer ricettaPrescrizioneNumCampi) throws Exception{
        RicettaMir ricettaDpcm = null;

        Path path = Paths.get(filePath);

        logger.info("Processing file '" + filePath + "'");

        List<List<String>> allValues = new ArrayList<>();

        if(Files.exists(path)) {
            String line = "";
            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {

                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] values = line.split(delimiter, -1);

                    allValues.add(Arrays.asList(values));
                }

            } catch (IOException e) {
                logger.error("Error reading file", e);
                throw e;
            }
        }
        if(!allValues.isEmpty()){
            List<String> values = allValues.get(0);
            if(!values.isEmpty()){
                logger.info("The file contains " + values.size() + " elements");
                if(values.size() < (testataNumCampi + ricettaNumCampi)){
                    throw new RuntimeException("Il file in ingresso non contiene tutti i campi necessari per creare la ricetta DPCM");
                } else{
                    // Creo la ricetta MIR
                    ricettaDpcm = new RicettaMir();

                    // Creo la testata
                    Testata testata = new Testata();
                    testata.setPinCode(values.get(0));
                    testata.setTipoInvio(values.get(1));
                    testata.setTestata1(values.get(2));
                    testata.setTestata2(values.get(3));
                    ricettaDpcm.setTestata(testata);

                    // Creo la ricetta
                    RicettaDpcm ricetta = new RicettaDpcm();
                    ricetta.setProtocolloSAC(values.get(4));
                    ricetta.setBar1(values.get(5));
                    ricetta.setBar2(values.get(6));
                    ricetta.setAltro(values.get(7));
                    ricetta.setNoteInvio(values.get(8));
                    ricetta.setCodAssistito(values.get(9));
                    ricetta.setTipoPrescrizione(values.get(10));
                    ricetta.setCodEsenzione(values.get(11));
                    ricetta.setNonEsente(values.get(12));
                    ricetta.setReddito(values.get(13));
                    ricetta.setCodDiagnosi(values.get(14));
                    ricetta.setDescrDiagnosi(values.get(15));
                    ricetta.setTotPezzi(values.get(16));
                    ricetta.setTipoRic(values.get(17));
                    ricetta.setDataCompilazione(values.get(18));
                    ricetta.setTipoVisita(values.get(19));
                    ricetta.setDispReg(values.get(20));
                    ricetta.setProvAssistito(values.get(21));
                    ricetta.setAslAssistito(values.get(22));
                    ricetta.setIndicazionePrescrizione(values.get(23));
                    ricetta.setClassePriorita(values.get(24));
                    ricetta.setStatoEstero(values.get(25));
                    ricetta.setIstituzCompetente(values.get(26));
                    ricetta.setNumIdentPers(values.get(27));
                    ricetta.setNumIdentTess(values.get(28));
                    ricetta.setDataNascitaEstero(values.get(29));
                    ricetta.setDataScadTessera(values.get(30));
                    ricetta.setRicetta1(values.get(31));
                    ricetta.setRicetta2(values.get(32));
                    ricettaDpcm.setRicetta(ricetta);

                    logger.info("Start creating Prescrizioni...");

                    List<Prescrizione> prescrizioni = new ArrayList<>();
                    Integer startIndex = (testataNumCampi + ricettaNumCampi);

                    while(startIndex < values.size()){
                        Prescrizione prescrizione = new Prescrizione();
                        for(int i=startIndex; i<(startIndex + ricettaPrescrizioneNumCampi + 1);i++){
//                            logger.info("-> "+startIndex);
                            prescrizione.setCodProdPrest(values.get(startIndex));
                            prescrizione.setDescrProdPrest(values.get(startIndex + 1));
                            prescrizione.setNotaProd(values.get(startIndex + 2));
                            prescrizione.setQuantita(values.get(startIndex + 3));
                            prescrizione.setPrescrizione1(values.get(startIndex + 4));
                            prescrizione.setPrescrizione2(values.get(startIndex + 5));
                        }
                        prescrizioni.add(prescrizione);
                        startIndex = startIndex + ricettaPrescrizioneNumCampi + 1;
                    }
                    logger.info("End creating Prescrizioni");

                    ricettaDpcm.setPrescrizioni(prescrizioni);
                    logger.info("Ricetta DPCM successfully created: " + ricetta.toString());
                }
            } else{
                throw new RuntimeException("Il file in ingresso è vuoto");
            }
        } else{
            throw new RuntimeException("Il file in ingresso è vuoto");
        }

        return ricettaDpcm;
    }
}
