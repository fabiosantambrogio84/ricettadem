package com.ricettadem.components;

import com.ricettadem.helper.EncryptDecryptHelper;
import com.ricettadem.model.AnnullaRicetta;
import com.ricettadem.model.DettaglioPrescrizione;
import com.ricettadem.model.Ricetta;
import com.ricettadem.model.RichiestaLottiNre;
import com.ricettadem.soap.annullaPrescritto.AnnullaPrescrittoRichiesta;
import com.ricettadem.soap.invioPrescritto.DettaglioPrescrizioneType;
import com.ricettadem.soap.invioPrescritto.ElencoDettagliPrescrizioniType;
import com.ricettadem.soap.invioPrescritto.InvioPrescrittoRichiesta;
import com.ricettadem.soap.richiestaLottiNre.LottoRichiestaNRE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
            request.setPinCode(EncryptDecryptHelper.encrypt(ricetta.getCodiceAssistito(), sacCertificateFilePath));
        } else{
            request.setPinCode(EncryptDecryptHelper.encrypt(ricetta.getCodiceAssistito(), certificateFilePath));
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
    
}
