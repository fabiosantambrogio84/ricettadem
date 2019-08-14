package com.ricettadem.components;

import com.ricettadem.helper.EncryptDecryptHelper;
import com.ricettadem.model.AnnullaRicetta;
import com.ricettadem.model.DettaglioPrescrizione;
import com.ricettadem.model.Ricetta;
import com.ricettadem.model.RichiestaLottiNre;
import com.ricettadem.model.certificatiMalattia.AnnullaCertificatoMalattia;
import com.ricettadem.model.certificatiMalattia.CertificatoMalattia;
import com.ricettadem.soap.annullaPrescritto.AnnullaPrescrittoRichiesta;
import com.ricettadem.soap.certificatiMalattia.*;
import com.ricettadem.soap.invioPrescritto.DettaglioPrescrizioneType;
import com.ricettadem.soap.invioPrescritto.ElencoDettagliPrescrizioniType;
import com.ricettadem.soap.invioPrescritto.InvioPrescrittoRichiesta;
import com.ricettadem.soap.richiestaLottiNre.LottoRichiestaNRE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class SOAPSpringClientComponent {

    private static Logger logger = LoggerFactory.getLogger(SOAPSpringClientComponent.class);

    private static final String REGIONE_SICILIA = "sicilia";

    @Value("${certificate.file-path}")
    private String certificateFilePath;

    @Value("${sac.certificate.file-path}")
    private String sacCertificateFilePath;

    public InvioPrescrittoRichiesta createInvioPrescrittoRichiesta(Ricetta ricetta, String region) throws Exception{
        InvioPrescrittoRichiesta request = new InvioPrescrittoRichiesta();
        if(region != null && region.equalsIgnoreCase(REGIONE_SICILIA)){
            request.setPinCode(EncryptDecryptHelper.encrypt(ricetta.getPincode(), sacCertificateFilePath));
        } else{
            request.setPinCode(EncryptDecryptHelper.encrypt(ricetta.getPincode(), certificateFilePath));
        }
        request.setCfMedico1(ricetta.getCodiceFiscaleMedico());
        request.setCfMedico2(ricetta.getCodiceFiscaleMedico2());
        request.setCodRegione(ricetta.getCodiceRegione());
        request.setCodASLAo(ricetta.getCodiceAsl());
        request.setCodStruttura(ricetta.getCodiceStruttura());
        request.setCodSpecializzazione(ricetta.getSpecializzazioneMedico());
        request.setTestata1(ricetta.getInformazioniAggiuntive());
        request.setTestata2(ricetta.getInformazioniAggiuntive2());
        request.setNre(ricetta.getNre());
        request.setTipoRic(ricetta.getTipoRicetta());
        if(region != null && region.equalsIgnoreCase(REGIONE_SICILIA)){
            request.setCodiceAss(EncryptDecryptHelper.encrypt(ricetta.getCodiceAssistito(), sacCertificateFilePath));
        } else{
            request.setCodiceAss(EncryptDecryptHelper.encrypt(ricetta.getCodiceAssistito(), certificateFilePath));
        }
        request.setCognNome(ricetta.getCognomeAssistito());
        request.setIndirizzo(ricetta.getIndirizzoAssistito());
        request.setOscuramDati(ricetta.getOscuramentoDati());
        request.setNumTessSasn(ricetta.getNumeroTesseraSanitaria());
        request.setSocNavigaz(ricetta.getSocietaNavigazione());
        request.setTipoPrescrizione(ricetta.getTipoPrescrizione());
        request.setRicettaInterna(ricetta.getRicettaInterna());
        request.setCodEsenzione(ricetta.getCodiceEsenzione());
        request.setNonEsente(ricetta.getNonEsente());
        request.setReddito(ricetta.getReddito());
        request.setCodDiagnosi(ricetta.getCodiceDiagnosi());
        request.setDescrizioneDiagnosi(ricetta.getDescrizioneDiagnosi());
        request.setDataCompilazione(ricetta.getDataCompilazione());
        request.setTipoVisita(ricetta.getTipoVisita());
        request.setDispReg(ricetta.getDisposizioniRegionali());
        request.setProvAssistito(ricetta.getProvinciaAssistito());
        request.setAslAssistito(ricetta.getAslAssistito());
        request.setIndicazionePrescr(ricetta.getIndicazionePrescrizione());
        request.setAltro(ricetta.getAltro());
        request.setClassePriorita(ricetta.getClassePriorita());
        request.setStatoEstero(ricetta.getStatoEstero());
        request.setIstituzCompetente(ricetta.getIstituzioneCompetente());
        request.setNumIdentPers(ricetta.getNumeroIdentificazionePersonale());
        request.setNumIdentTess(ricetta.getNumeroIdentificazioneTessera());
        request.setDataNascitaEstero(ricetta.getDataNascitaEstero());
        request.setDataScadTessera(ricetta.getDataScadenzaTessera());

        ElencoDettagliPrescrizioniType elencoDettagliPrescrizioniType = new ElencoDettagliPrescrizioniType();
        List<DettaglioPrescrizione> dettagliPrescrizione = ricetta.getDettagliPrescrizione();
        if(dettagliPrescrizione != null && !dettagliPrescrizione.isEmpty()){
            for(DettaglioPrescrizione dettaglioPrescrizione: dettagliPrescrizione){
                DettaglioPrescrizioneType dettaglioPrescrizioneType = new DettaglioPrescrizioneType();
                dettaglioPrescrizioneType.setCodProdPrest(dettaglioPrescrizione.getCodiceProdotto());
                dettaglioPrescrizioneType.setDescrProdPrest(dettaglioPrescrizione.getDescrizioneProdotto());
                dettaglioPrescrizioneType.setCodGruppoEquival(dettaglioPrescrizione.getCodiceGruppoEquivalenza());
                dettaglioPrescrizioneType.setDescrGruppoEquival(dettaglioPrescrizione.getDescrizioneGruppoEquivalenza());
                dettaglioPrescrizioneType.setTestoLibero(dettaglioPrescrizione.getTestoLibero());
                dettaglioPrescrizioneType.setDescrTestoLiberoNote(dettaglioPrescrizione.getDescrizioneTestoLibero());
                dettaglioPrescrizioneType.setNonSost(dettaglioPrescrizione.getNonSostituito());
                dettaglioPrescrizioneType.setMotivazNote(dettaglioPrescrizione.getNoteMotivazioni());
                dettaglioPrescrizioneType.setCodMotivazione(dettaglioPrescrizione.getCodiceMotivazione());
                dettaglioPrescrizioneType.setNotaProd(dettaglioPrescrizione.getNotaProdotto());
                dettaglioPrescrizioneType.setQuantita(dettaglioPrescrizione.getQuantita());
                dettaglioPrescrizioneType.setPrescrizione1(dettaglioPrescrizione.getInformazioniPrescrizione());
                dettaglioPrescrizioneType.setPrescrizione2(dettaglioPrescrizione.getInformazioniPrescrizione2());
                dettaglioPrescrizioneType.setCodCatalogoPrescr(dettaglioPrescrizione.getCodiceCatalogoPrescrizione());
                dettaglioPrescrizioneType.setTipoAccesso(dettaglioPrescrizione.getTipoAccesso1());
                dettaglioPrescrizioneType.setNumeroNota(dettaglioPrescrizione.getNumeroNota());
                dettaglioPrescrizioneType.setCondErogabilita(dettaglioPrescrizione.getCondizioneErogabilita());
                dettaglioPrescrizioneType.setApproprPrescrittiva(dettaglioPrescrizione.getAppropriatezzaPrescrittiva());
                dettaglioPrescrizioneType.setPatologia(dettaglioPrescrizione.getPatologia());

                elencoDettagliPrescrizioniType.getDettaglioPrescrizione().add(dettaglioPrescrizioneType);
            }
        }
        request.setElencoDettagliPrescrizioni(elencoDettagliPrescrizioniType);

        return request;
    }

    public LottoRichiestaNRE createRichiestaLottiNreRichiesta(RichiestaLottiNre richiestaLottiNre) throws Exception{
        LottoRichiestaNRE request = new LottoRichiestaNRE();
        request.setCodRegione(richiestaLottiNre.getCodiceRegione());
        request.setIdentificativoLotto(richiestaLottiNre.getParamDimensioneLotto());
        request.setCFMedico(richiestaLottiNre.getCodiceFiscale());

        return request;
    }

    public AnnullaPrescrittoRichiesta createAnnullaRicettaRichiesta(AnnullaRicetta annullaRicetta) throws Exception{
        AnnullaPrescrittoRichiesta request = new AnnullaPrescrittoRichiesta();
        request.setPinCode(annullaRicetta.getPinCode());
        request.setCfMedico(annullaRicetta.getCodiceFiscale());
        request.setNre(annullaRicetta.getNre());

        return request;
    }

    public InvioMalattiaRequest createCertificatoMalattiaRichiesta(CertificatoMalattia certificatoMalattia) throws Exception{
        InvioMalattiaRequest request = new InvioMalattiaRequest();

        Lavoratore lavoratore = new Lavoratore();
        lavoratore.setCodiceFiscale(EncryptDecryptHelper.encrypt(certificatoMalattia.getLavoratore().getCodiceFiscale(), sacCertificateFilePath));

        Redattore medico = new Redattore();
        medico.setCodiceAsl(certificatoMalattia.getMedico().getCodiceAsl());
        medico.setCodiceRegione(certificatoMalattia.getMedico().getCodiceRegione());
        medico.setCodiceStruttura(certificatoMalattia.getMedico().getCodiceStruttura());
        medico.setCodiceFiscale(certificatoMalattia.getMedico().getCodiceFiscale());
        medico.setPincode(EncryptDecryptHelper.encrypt(certificatoMalattia.getMedico().getPincode(), sacCertificateFilePath));

        Indirizzo residenza = new Indirizzo();
        residenza.setVia(certificatoMalattia.getResidenza().getVia());
        residenza.setComune(certificatoMalattia.getResidenza().getComune());
        residenza.setCivico(certificatoMalattia.getResidenza().getCivico());
        residenza.setCap(certificatoMalattia.getResidenza().getCap());
        residenza.setProvincia(certificatoMalattia.getResidenza().getProvincia());
        residenza.setCodiceCatastale(certificatoMalattia.getResidenza().getCodiceCatastale());

        Reperibilita reperibilita = new Reperibilita();
        reperibilita.setCognome(certificatoMalattia.getReperibilita().getCognome());
        Indirizzo reperibilitaIndirizzo = new Indirizzo();
        reperibilitaIndirizzo.setVia(certificatoMalattia.getReperibilita().getIndirizzo().getVia());
        reperibilitaIndirizzo.setComune(certificatoMalattia.getReperibilita().getIndirizzo().getComune());
        reperibilitaIndirizzo.setCivico(certificatoMalattia.getReperibilita().getIndirizzo().getCivico());
        reperibilitaIndirizzo.setCap(certificatoMalattia.getReperibilita().getIndirizzo().getCap());
        reperibilitaIndirizzo.setProvincia(certificatoMalattia.getReperibilita().getIndirizzo().getProvincia());

        String codiceCatastale = certificatoMalattia.getReperibilita().getIndirizzo().getCodiceCatastale();
        if(codiceCatastale != null && !codiceCatastale.equals("")){
            reperibilitaIndirizzo.setCodiceCatastale(codiceCatastale);
        }
        reperibilita.setIndirizzo(reperibilitaIndirizzo);

        Malattia malattia = new Malattia();
        malattia.setRuoloMedico(certificatoMalattia.getMalattia().getRuoloMedico());
        String dataRilascio = certificatoMalattia.getMalattia().getDataRilascio();
        String dataInizio = certificatoMalattia.getMalattia().getDataInizio();
        String dataFine = certificatoMalattia.getMalattia().getDataFine();

        malattia.setDataRilascio(formatDateString(dataRilascio));
        malattia.setDataInizio(formatDateString(dataInizio));
        malattia.setDataFine(formatDateString(dataFine));

        malattia.setVisita(certificatoMalattia.getMalattia().getVisita());
        malattia.setTipoCertificato(certificatoMalattia.getMalattia().getTipoCertificato());
        Diagnosi diagnosi = new Diagnosi();
        diagnosi.setCodiceDiagnosi(certificatoMalattia.getMalattia().getDiagnosi().getCodiceDiagnosi());
        diagnosi.setNoteDiagnosi(certificatoMalattia.getMalattia().getDiagnosi().getNoteDiagnosi());
        malattia.setDiagnosi(diagnosi);
        String giornataLavorata = certificatoMalattia.getMalattia().getGiornataLavorata();
        if(giornataLavorata != null && giornataLavorata.equals("1")){
            malattia.setGiornataLavorata("true");
        } else{
            malattia.setGiornataLavorata("false");
        }
        String trauma = certificatoMalattia.getMalattia().getTrauma();
        if(trauma != null && trauma.equals("1")){
            malattia.setTrauma("true");
        } else {
            malattia.setTrauma("false");
        }
        String agevolazioni = certificatoMalattia.getMalattia().getAgevolazioni();
        if(agevolazioni != null && !agevolazioni.equals("")){
            malattia.setAgevolazioni(agevolazioni);
        }

        request.setLavoratore(lavoratore);
        request.setMedico(medico);
        request.setResidenza(residenza);
        request.setReperibilita(reperibilita);
        request.setMalattia(malattia);

        return request;
    }

    public AnnullamentoMalattiaRequest createAnnullaCertificatoMalattiaRichiesta(AnnullaCertificatoMalattia annullaCertificatoMalattia) throws Exception{
        AnnullamentoMalattiaRequest request = new AnnullamentoMalattiaRequest();

        Lavoratore lavoratore = new Lavoratore();
        lavoratore.setCodiceFiscale(EncryptDecryptHelper.encrypt(annullaCertificatoMalattia.getLavoratore().getCodiceFiscale(), sacCertificateFilePath));

        Redattore medico = new Redattore();
        medico.setCodiceAsl(annullaCertificatoMalattia.getMedico().getCodiceAsl());
        medico.setCodiceRegione(annullaCertificatoMalattia.getMedico().getCodiceRegione());
        medico.setCodiceStruttura(annullaCertificatoMalattia.getMedico().getCodiceStruttura());
        medico.setCodiceFiscale(annullaCertificatoMalattia.getMedico().getCodiceFiscale());
        medico.setPincode(EncryptDecryptHelper.encrypt(annullaCertificatoMalattia.getMedico().getPincode(), sacCertificateFilePath));

        request.setLavoratore(lavoratore);
        request.setMedico(medico);
        request.setIdCertificato(annullaCertificatoMalattia.getIdCertificato());

        return request;
    }

    private String formatDateString(String dateString){
        String result = dateString;
        try{
            Date date1 = new SimpleDateFormat("yyyyMMdd").parse(dateString);

            result = new SimpleDateFormat("yyyy-MM-dd").format(date1);

        } catch(Exception e){
            logger.error("Error parsing date '" + dateString + "'");
        }
        return result;
    }

}
