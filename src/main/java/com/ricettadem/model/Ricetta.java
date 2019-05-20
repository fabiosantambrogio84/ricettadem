package com.ricettadem.model;

import java.util.List;
import java.util.Objects;

public class Ricetta {

    private String pincode;
    private String codiceFiscaleMedico;
    private String codiceFiscaleMedico2;
    private String codiceRegione;
    private String codiceAsl;
    private String codiceStruttura;
    private String specializzazioneMedico;
    private String informazioniAggiuntive;
    private String informazioniAggiuntive2;
    private String nre;
    private String tipoRicetta;
    private String codiceAssistito;
    private String cognomeAssistito;
    private String indirizzoAssistito;
    private String oscuramentoDati;
    private String numeroTesseraSanitaria;
    private String societaNavigazione;
    private String tipoPrescrizione;
    private String ricettaInterna;
    private String codiceEsenzione;
    private String nonEsente;
    private String reddito;
    private String codiceDiagnosi;
    private String descrizioneDiagnosi;
    private String dataCompilazione;
    private String tipoVisita;
    private String disposizioniRegionali;
    private String provinciaAssistito;
    private String aslAssistito;
    private String indicazionePrescrizione;
    private String altro;
    private String classePriorita;
    private String statoEstero;
    private String istituzioneCompetente;
    private String numeroIdentificazionePersonale;
    private String numeroIdentificazioneTessera;
    private String dataNascitaEstero;
    private String dataScadenzaTessera;
    private List<DettaglioPrescrizione> dettagliPrescrizione;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCodiceFiscaleMedico() {
        return codiceFiscaleMedico;
    }

    public void setCodiceFiscaleMedico(String codiceFiscaleMedico) {
        this.codiceFiscaleMedico = codiceFiscaleMedico;
    }

    public String getCodiceFiscaleMedico2() {
        return codiceFiscaleMedico2;
    }

    public void setCodiceFiscaleMedico2(String codiceFiscaleMedico2) {
        this.codiceFiscaleMedico2 = codiceFiscaleMedico2;
    }

    public String getCodiceRegione() {
        return codiceRegione;
    }

    public void setCodiceRegione(String codiceRegione) {
        this.codiceRegione = codiceRegione;
    }

    public String getCodiceAsl() {
        return codiceAsl;
    }

    public void setCodiceAsl(String codiceAsl) {
        this.codiceAsl = codiceAsl;
    }

    public String getCodiceStruttura() {
        return codiceStruttura;
    }

    public void setCodiceStruttura(String codiceStruttura) {
        this.codiceStruttura = codiceStruttura;
    }

    public String getSpecializzazioneMedico() {
        return specializzazioneMedico;
    }

    public void setSpecializzazioneMedico(String specializzazioneMedico) {
        this.specializzazioneMedico = specializzazioneMedico;
    }

    public String getInformazioniAggiuntive() {
        return informazioniAggiuntive;
    }

    public void setInformazioniAggiuntive(String informazioniAggiuntive) {
        this.informazioniAggiuntive = informazioniAggiuntive;
    }

    public String getInformazioniAggiuntive2() {
        return informazioniAggiuntive2;
    }

    public void setInformazioniAggiuntive2(String informazioniAggiuntive2) {
        this.informazioniAggiuntive2 = informazioniAggiuntive2;
    }

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getTipoRicetta() {
        return tipoRicetta;
    }

    public void setTipoRicetta(String tipoRicetta) {
        this.tipoRicetta = tipoRicetta;
    }

    public String getCodiceAssistito() {
        return codiceAssistito;
    }

    public void setCodiceAssistito(String codiceAssistito) {
        this.codiceAssistito = codiceAssistito;
    }

    public String getCognomeAssistito() {
        return cognomeAssistito;
    }

    public void setCognomeAssistito(String cognomeAssistito) {
        this.cognomeAssistito = cognomeAssistito;
    }

    public String getIndirizzoAssistito() {
        return indirizzoAssistito;
    }

    public void setIndirizzoAssistito(String indirizzoAssistito) {
        this.indirizzoAssistito = indirizzoAssistito;
    }

    public String getOscuramentoDati() {
        return oscuramentoDati;
    }

    public void setOscuramentoDati(String oscuramentoDati) {
        this.oscuramentoDati = oscuramentoDati;
    }

    public String getNumeroTesseraSanitaria() {
        return numeroTesseraSanitaria;
    }

    public void setNumeroTesseraSanitaria(String numeroTesseraSanitaria) {
        this.numeroTesseraSanitaria = numeroTesseraSanitaria;
    }

    public String getSocietaNavigazione() {
        return societaNavigazione;
    }

    public void setSocietaNavigazione(String societaNavigazione) {
        this.societaNavigazione = societaNavigazione;
    }

    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    public void setTipoPrescrizione(String tipoPrescrizione) {
        this.tipoPrescrizione = tipoPrescrizione;
    }

    public String getRicettaInterna() {
        return ricettaInterna;
    }

    public void setRicettaInterna(String ricettaInterna) {
        this.ricettaInterna = ricettaInterna;
    }

    public String getCodiceEsenzione() {
        return codiceEsenzione;
    }

    public void setCodiceEsenzione(String codiceEsenzione) {
        this.codiceEsenzione = codiceEsenzione;
    }

    public String getNonEsente() {
        return nonEsente;
    }

    public void setNonEsente(String nonEsente) {
        this.nonEsente = nonEsente;
    }

    public String getReddito() {
        return reddito;
    }

    public void setReddito(String reddito) {
        this.reddito = reddito;
    }

    public String getCodiceDiagnosi() {
        return codiceDiagnosi;
    }

    public void setCodiceDiagnosi(String codiceDiagnosi) {
        this.codiceDiagnosi = codiceDiagnosi;
    }

    public String getDescrizioneDiagnosi() {
        return descrizioneDiagnosi;
    }

    public void setDescrizioneDiagnosi(String descrizioneDiagnosi) {
        this.descrizioneDiagnosi = descrizioneDiagnosi;
    }

    public String getDataCompilazione() {
        return dataCompilazione;
    }

    public void setDataCompilazione(String dataCompilazione) {
        this.dataCompilazione = dataCompilazione;
    }

    public String getTipoVisita() {
        return tipoVisita;
    }

    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }

    public String getDisposizioniRegionali() {
        return disposizioniRegionali;
    }

    public void setDisposizioniRegionali(String disposizioniRegionali) {
        this.disposizioniRegionali = disposizioniRegionali;
    }

    public String getProvinciaAssistito() {
        return provinciaAssistito;
    }

    public void setProvinciaAssistito(String provinciaAssistito) {
        this.provinciaAssistito = provinciaAssistito;
    }

    public String getAslAssistito() {
        return aslAssistito;
    }

    public void setAslAssistito(String aslAssistito) {
        this.aslAssistito = aslAssistito;
    }

    public String getIndicazionePrescrizione() {
        return indicazionePrescrizione;
    }

    public void setIndicazionePrescrizione(String indicazionePrescrizione) {
        this.indicazionePrescrizione = indicazionePrescrizione;
    }

    public String getAltro() {
        return altro;
    }

    public void setAltro(String altro) {
        this.altro = altro;
    }

    public String getClassePriorita() {
        return classePriorita;
    }

    public void setClassePriorita(String classePriorita) {
        this.classePriorita = classePriorita;
    }

    public String getStatoEstero() {
        return statoEstero;
    }

    public void setStatoEstero(String statoEstero) {
        this.statoEstero = statoEstero;
    }

    public String getIstituzioneCompetente() {
        return istituzioneCompetente;
    }

    public void setIstituzioneCompetente(String istituzioneCompetente) {
        this.istituzioneCompetente = istituzioneCompetente;
    }

    public String getNumeroIdentificazionePersonale() {
        return numeroIdentificazionePersonale;
    }

    public void setNumeroIdentificazionePersonale(String numeroIdentificazionePersonale) {
        this.numeroIdentificazionePersonale = numeroIdentificazionePersonale;
    }

    public String getNumeroIdentificazioneTessera() {
        return numeroIdentificazioneTessera;
    }

    public void setNumeroIdentificazioneTessera(String numeroIdentificazioneTessera) {
        this.numeroIdentificazioneTessera = numeroIdentificazioneTessera;
    }

    public String getDataNascitaEstero() {
        return dataNascitaEstero;
    }

    public void setDataNascitaEstero(String dataNascitaEstero) {
        this.dataNascitaEstero = dataNascitaEstero;
    }

    public String getDataScadenzaTessera() {
        return dataScadenzaTessera;
    }

    public void setDataScadenzaTessera(String dataScadenzaTessera) {
        this.dataScadenzaTessera = dataScadenzaTessera;
    }

    public List<DettaglioPrescrizione> getDettagliPrescrizione() {
        return dettagliPrescrizione;
    }

    public void setDettagliPrescrizione(List<DettaglioPrescrizione> dettagliPrescrizione) {
        this.dettagliPrescrizione = dettagliPrescrizione;
    }


    @Override
    public int hashCode() {
        return Objects.hash(pincode, codiceFiscaleMedico, codiceFiscaleMedico2, codiceRegione, codiceAsl, codiceStruttura, specializzazioneMedico, informazioniAggiuntive, informazioniAggiuntive2, nre, tipoRicetta, codiceAssistito, cognomeAssistito, indirizzoAssistito, oscuramentoDati, numeroTesseraSanitaria, societaNavigazione, tipoPrescrizione, ricettaInterna, codiceEsenzione, nonEsente, reddito, codiceDiagnosi, descrizioneDiagnosi, dataCompilazione, tipoVisita, disposizioniRegionali, provinciaAssistito, aslAssistito, indicazionePrescrizione, altro, classePriorita, statoEstero, istituzioneCompetente, numeroIdentificazionePersonale, numeroIdentificazioneTessera, dataNascitaEstero, dataScadenzaTessera, dettagliPrescrizione);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Ricetta that = (Ricetta) obj;
        return Objects.equals(pincode, that.pincode) &&
                Objects.equals(codiceFiscaleMedico, that.codiceFiscaleMedico) &&
                Objects.equals(codiceFiscaleMedico2, that.codiceFiscaleMedico2) &&
                Objects.equals(codiceRegione, that.codiceRegione) &&
                Objects.equals(codiceAsl, that.codiceAsl) &&
                Objects.equals(codiceStruttura, that.codiceStruttura) &&
                Objects.equals(specializzazioneMedico, that.specializzazioneMedico) &&
                Objects.equals(informazioniAggiuntive, that.informazioniAggiuntive) &&
                Objects.equals(informazioniAggiuntive2, that.informazioniAggiuntive2) &&
                Objects.equals(nre, that.nre) &&
                Objects.equals(tipoRicetta, that.tipoRicetta) &&
                Objects.equals(codiceAssistito, that.codiceAssistito) &&
                Objects.equals(cognomeAssistito, that.cognomeAssistito) &&
                Objects.equals(indirizzoAssistito, that.indirizzoAssistito) &&
                Objects.equals(oscuramentoDati, that.oscuramentoDati) &&
                Objects.equals(numeroTesseraSanitaria, that.numeroTesseraSanitaria) &&
                Objects.equals(societaNavigazione, that.societaNavigazione) &&
                Objects.equals(tipoPrescrizione, that.tipoPrescrizione) &&
                Objects.equals(ricettaInterna, that.ricettaInterna) &&
                Objects.equals(codiceEsenzione, that.codiceEsenzione) &&
                Objects.equals(nonEsente, that.nonEsente) &&
                Objects.equals(reddito, that.reddito) &&
                Objects.equals(codiceDiagnosi, that.codiceDiagnosi) &&
                Objects.equals(descrizioneDiagnosi, that.descrizioneDiagnosi) &&
                Objects.equals(dataCompilazione, that.dataCompilazione) &&
                Objects.equals(tipoVisita, that.tipoVisita) &&
                Objects.equals(disposizioniRegionali, that.disposizioniRegionali) &&
                Objects.equals(provinciaAssistito, that.provinciaAssistito) &&
                Objects.equals(aslAssistito, that.aslAssistito) &&
                Objects.equals(indicazionePrescrizione, that.indicazionePrescrizione) &&
                Objects.equals(altro, that.altro) &&
                Objects.equals(classePriorita, that.classePriorita) &&
                Objects.equals(statoEstero, that.statoEstero) &&
                Objects.equals(istituzioneCompetente, that.istituzioneCompetente) &&
                Objects.equals(numeroIdentificazionePersonale, that.numeroIdentificazionePersonale) &&
                Objects.equals(numeroIdentificazioneTessera, that.numeroIdentificazioneTessera) &&
                Objects.equals(dataNascitaEstero, that.dataNascitaEstero) &&
                Objects.equals(dataScadenzaTessera, that.dataScadenzaTessera) &&
                Objects.equals(dettagliPrescrizione, that.dettagliPrescrizione);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("pincode: " + pincode);
        result.append(", codiceFiscaleMedico: " + codiceFiscaleMedico);
        result.append(", codiceFiscaleMedico2: " + codiceFiscaleMedico2);
        result.append(", codiceRegione: " + codiceRegione);
        result.append(", codiceAsl: " + codiceAsl);
        result.append(", codiceStruttura: " + codiceStruttura);
        result.append(", specializzazioneMedico: " + specializzazioneMedico);
        result.append(", informazioniAggiuntive: " + informazioniAggiuntive);
        result.append(", informazioniAggiuntive2: " + informazioniAggiuntive2);
        result.append(", nre: " + nre);
        result.append(", tipoRicetta: " + tipoRicetta);
        result.append(", codiceAssistito: " + codiceAssistito);
        result.append(", cognomeAssistito: " + cognomeAssistito);
        result.append(", indirizzoAssistito: " + indirizzoAssistito);
        result.append(", oscuramentoDati: " + oscuramentoDati);
        result.append(", numeroTesseraSanitaria: " + numeroTesseraSanitaria);
        result.append(", societaNavigazione: " + societaNavigazione);
        result.append(", tipoPrescrizione: " + tipoPrescrizione);
        result.append(", ricettaInterna: " + ricettaInterna);
        result.append(", codiceEsenzione: " + codiceEsenzione);
        result.append(", nonEsente: " + nonEsente);
        result.append(", reddito: " + reddito);
        result.append(", codiceDiagnosi: " + codiceDiagnosi);
        result.append(", descrizioneDiagnosi: " + descrizioneDiagnosi);
        result.append(", dataCompilazione: " + dataCompilazione);
        result.append(", tipoVisita: " + tipoVisita);
        result.append(", disposizioniRegionali: " + disposizioniRegionali);
        result.append(", provinciaAssistito: " + provinciaAssistito);
        result.append(", aslAssistito: " + aslAssistito);
        result.append(", indicazionePrescrizione: " + indicazionePrescrizione);
        result.append(", altro: " + altro);
        result.append(", classePriorita: " + classePriorita);
        result.append(", statoEstero: " + statoEstero);
        result.append(", istituzioneCompetente: " + istituzioneCompetente);
        result.append(", numeroIdentificazionePersonale: " + numeroIdentificazionePersonale);
        result.append(", numeroIdentificazioneTessera: " + numeroIdentificazioneTessera);
        result.append(", dataNascitaEstero: " + dataNascitaEstero);
        result.append(", dataScadenzaTessera: " + dataScadenzaTessera);
        if(dettagliPrescrizione != null){
            result.append(", dettagliPrescrizione: [");
            for(DettaglioPrescrizione dettaglioPrescrizione:dettagliPrescrizione){
                result.append(dettaglioPrescrizione.toString());
            }
            result.append("]");
        }
        result.append("}");

        return result.toString();

    }
}
