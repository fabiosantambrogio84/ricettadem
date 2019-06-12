package com.ricettadem.services.dpcm;

import com.ricettadem.components.SOAPSpringClientComponent;
import com.ricettadem.helper.CsvHelper;
import com.ricettadem.helper.EncryptDecryptHelper;
import com.ricettadem.model.dpcm.Prescrizione;
import com.ricettadem.model.dpcm.RicettaDpcm;
import com.ricettadem.model.dpcm.RicettaMir;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

    @Value("${dpcm.certificate.file-path}")
    private String dpcmCertificateFilePath;

    @Autowired
    private SOAPSpringClientComponent SOAPSpringClientComponent;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    public void invia() throws Exception{
        logger.info("INVIO RICETTA DPCM DEMATERIALIZZATA");
        logger.info("Parsing the file...");
        RicettaMir ricettaMir = CsvHelper.readRicettaDpcmCsv(ricettaDpcmFilePath, delimiter, ricettaDpcmTestataNumCampi, ricettaDpcmNumCampi, ricettaDpcmPrescrizioneNumCampi);
        logger.info("Ricetta DPCM retrieved from file: " + ricettaMir.toString());

        logger.info("Creating the xml file...");

        StringWriter stringWriter = new StringWriter();
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);

        xmlStreamWriter.writeStartElement("RicetteMIR");

        xmlStreamWriter.writeStartElement("Testata");

        xmlStreamWriter.writeStartElement("PinCode");
        xmlStreamWriter.writeCharacters(EncryptDecryptHelper.encrypt(ricettaMir.getTestata().getPinCode(), dpcmCertificateFilePath));
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("TipoInvio");
        xmlStreamWriter.writeCharacters(ricettaMir.getTestata().getTipoInvio());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Testata1");
        xmlStreamWriter.writeCharacters(ricettaMir.getTestata().getTestata1());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Testata2");
        xmlStreamWriter.writeCharacters(ricettaMir.getTestata().getTestata2());
        xmlStreamWriter.writeEndElement();

        // chiusura 'Testata'
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("RicettaI");

        RicettaDpcm ricettaDpcm = ricettaMir.getRicetta();

        xmlStreamWriter.writeStartElement("Bar1");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getBar1());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Bar2");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getBar2());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Altro");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getAltro());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("NoteInvio");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getNoteInvio());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("CodiceAss");
        xmlStreamWriter.writeCharacters(EncryptDecryptHelper.encrypt(ricettaDpcm.getCodAssistito(), dpcmCertificateFilePath));
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("TipoPrescrizione");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getTipoPrescrizione());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("CodEsenzione");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getCodEsenzione());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("NonEsente");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getNonEsente());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Reddito");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getReddito());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("CodiceDiagnosi");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getCodDiagnosi());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("DescrizioneDiagnosi");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getDescrDiagnosi());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("TotPezzi");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getTotPezzi());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("TipoRic");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getTipoRic());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("DataCompilazione");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getDataCompilazione());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("TipoVisita");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getTipoVisita());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("DispReg");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getDispReg());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("ProvAssistito");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getProvAssistito());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("AslAssistito");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getAslAssistito());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("IndicazionePresc");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getIndicazionePrescrizione());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("ClassePriorita");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getClassePriorita());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("StatoEstero");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getStatoEstero());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("IstituzCompetente");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getIstituzCompetente());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("NumIdentPers");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getNumIdentPers());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("NumIdentTess");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getNumIdentTess());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("DataNascitaEstero");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getDataNascitaEstero());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("DataScadTessera");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getDataScadTessera());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Ricetta1");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getRicetta1());
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeStartElement("Ricetta2");
        xmlStreamWriter.writeCharacters(ricettaDpcm.getRicetta2());
        xmlStreamWriter.writeEndElement();

        List<Prescrizione> prescrizioni = ricettaMir.getPrescrizioni();
        if(prescrizioni != null && !prescrizioni.isEmpty()){
            for(Prescrizione prescrizione: prescrizioni){
                xmlStreamWriter.writeStartElement("Prescrizione");

                xmlStreamWriter.writeStartElement("CodProdPrest");
                xmlStreamWriter.writeCharacters(prescrizione.getCodProdPrest());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("DescrProdPrest");
                xmlStreamWriter.writeCharacters(prescrizione.getDescrProdPrest());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("NotaProd");
                xmlStreamWriter.writeCharacters(prescrizione.getNotaProd());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("Quantita");
                xmlStreamWriter.writeCharacters(prescrizione.getQuantita());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("Prescrizione1");
                xmlStreamWriter.writeCharacters(prescrizione.getPrescrizione1());
                xmlStreamWriter.writeEndElement();

                xmlStreamWriter.writeStartElement("Prescrizione2");
                xmlStreamWriter.writeCharacters(prescrizione.getPrescrizione2());
                xmlStreamWriter.writeEndElement();

                // chiusura 'Prescrizione'
                xmlStreamWriter.writeEndElement();
            }
        }

        // chiusura 'RicettaI'
        xmlStreamWriter.writeEndElement();

        // chiusura 'RicetteMIR'
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.flush();
        xmlStreamWriter.close();

        String xmlString = stringWriter.getBuffer().toString();
        stringWriter.close();

        xmlString = transformToPrettyPrint(xmlString);
        //System.out.println(transformToPrettyPrint(xmlString));

        String fileName = System.currentTimeMillis() + "_Venza_Windoc";
        String xmlFilePath = ricettaDpcmTmpFolderPath + "/" + fileName + ".xml";

        File xmlFile = new File(xmlFilePath);
        try (PrintWriter out = new PrintWriter(xmlFile)) {
            out.println(xmlString);
        }
        logger.info("File xml successfully created");

        logger.info("Creating the zip file...");
        FileOutputStream fos = null;
        FileInputStream fis = null;
        ZipOutputStream zipOut = null;
        try{
            fos = new FileOutputStream(ricettaDpcmTmpFolderPath + "/" + fileName + ".zip");
            zipOut = new ZipOutputStream(fos);
            File fileToZip = new File(xmlFilePath);
            fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }

        } catch(Exception e){
            logger.error("Error creating the zip file", e);
            throw e;
        } finally{
            if(zipOut != null){
                zipOut.close();
            }
            if(fis != null){
                fis.close();
            }
            if(fos != null){
                fos.close();
            }
        }
        logger.info("File zip successfully created");

        logger.info("Creating the soap request...");
        //InvioPrescrittoRichiesta request = SOAPSpringClientComponent.createInvioPrescrittoRichiesta(ricetta);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        webServiceTemplate.setDefaultUri(uriInvioRicettaDpcm);

        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory();
//        DataHandler dataHandler = new DataHandler(new FileDataSource(("")));
        SaajSoapMessage saajSoapMessage = saajSoapMessageFactory.createWebServiceMessage();
        saajSoapMessage.addAttachment("", new File(""));

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

    private String transformToPrettyPrint(String xml) throws Exception{
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        Writer out = new StringWriter();
        t.transform(new StreamSource(new StringReader(xml)), new StreamResult(out));
        return out.toString();
    }

}
