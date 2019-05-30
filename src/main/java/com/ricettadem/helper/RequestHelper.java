package com.ricettadem.helper;

import com.ricettadem.model.DettaglioPrescrizione;
import com.ricettadem.model.Ricetta;
import com.ricettadem.soap.DettaglioPrescrizioneType;
import com.ricettadem.soap.ElencoDettagliPrescrizioniType;
import com.ricettadem.soap.InvioPrescrittoRichiesta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RequestHelper {

    private static Logger logger = LoggerFactory.getLogger(RequestHelper.class);

    @Value("${certificate.file-path}")
    private String certificateFilePath;

    public InvioPrescrittoRichiesta createInvioPrescrittoRichiesta(Ricetta ricetta) throws Exception{
        InvioPrescrittoRichiesta request = new InvioPrescrittoRichiesta();
        request.setPinCode(ricetta.getPincode());
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
        request.setCodiceAss(EncryptDecryptHelper.encrypt(ricetta.getCodiceAssistito(), certificateFilePath));
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
}
