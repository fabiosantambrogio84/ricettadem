package com.ricettadem.model.dpcm;

import java.util.Objects;

public class RicettaDpcm {

    private String protocolloSAC;
    private String bar1;
    private String bar2;
    private String altro;
    private String noteInvio;
    private String codAssistito;
    private String tipoPrescrizione;
    private String codEsenzione;
    private String nonEsente;
    private String reddito;
    private String codDiagnosi;
    private String descrDiagnosi;
    private String totPezzi;
    private String tipoRic;
    private String dataCompilazione;
    private String tipoVisita;
    private String dispReg;
    private String provAssistito;
    private String aslAssistito;
    private String indicazionePrescrizione;
    private String classePriorita;
    private String statoEstero;
    private String istituzCompetente;
    private String numIdentPers;
    private String numIdentTess;
    private String dataNascitaEstero;
    private String dataScadTessera;
    private String ricetta1;
    private String ricetta2;

    public String getProtocolloSAC() {
        return protocolloSAC;
    }

    public void setProtocolloSAC(String protocolloSAC) {
        this.protocolloSAC = protocolloSAC;
    }

    public String getBar1() {
        return bar1;
    }

    public void setBar1(String bar1) {
        this.bar1 = bar1;
    }

    public String getBar2() {
        return bar2;
    }

    public void setBar2(String bar2) {
        this.bar2 = bar2;
    }

    public String getAltro() {
        return altro;
    }

    public void setAltro(String altro) {
        this.altro = altro;
    }

    public String getNoteInvio() {
        return noteInvio;
    }

    public void setNoteInvio(String noteInvio) {
        this.noteInvio = noteInvio;
    }

    public String getCodAssistito() {
        return codAssistito;
    }

    public void setCodAssistito(String codAssistito) {
        this.codAssistito = codAssistito;
    }

    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    public void setTipoPrescrizione(String tipoPrescrizione) {
        this.tipoPrescrizione = tipoPrescrizione;
    }

    public String getCodEsenzione() {
        return codEsenzione;
    }

    public void setCodEsenzione(String codEsenzione) {
        this.codEsenzione = codEsenzione;
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

    public String getCodDiagnosi() {
        return codDiagnosi;
    }

    public void setCodDiagnosi(String codDiagnosi) {
        this.codDiagnosi = codDiagnosi;
    }

    public String getDescrDiagnosi() {
        return descrDiagnosi;
    }

    public void setDescrDiagnosi(String descrDiagnosi) {
        this.descrDiagnosi = descrDiagnosi;
    }

    public String getTotPezzi() {
        return totPezzi;
    }

    public void setTotPezzi(String totPezzi) {
        this.totPezzi = totPezzi;
    }

    public String getTipoRic() {
        return tipoRic;
    }

    public void setTipoRic(String tipoRic) {
        this.tipoRic = tipoRic;
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

    public String getDispReg() {
        return dispReg;
    }

    public void setDispReg(String dispReg) {
        this.dispReg = dispReg;
    }

    public String getProvAssistito() {
        return provAssistito;
    }

    public void setProvAssistito(String provAssistito) {
        this.provAssistito = provAssistito;
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

    public String getIstituzCompetente() {
        return istituzCompetente;
    }

    public void setIstituzCompetente(String istituzCompetente) {
        this.istituzCompetente = istituzCompetente;
    }

    public String getNumIdentPers() {
        return numIdentPers;
    }

    public void setNumIdentPers(String numIdentPers) {
        this.numIdentPers = numIdentPers;
    }

    public String getNumIdentTess() {
        return numIdentTess;
    }

    public void setNumIdentTess(String numIdentTess) {
        this.numIdentTess = numIdentTess;
    }

    public String getDataNascitaEstero() {
        return dataNascitaEstero;
    }

    public void setDataNascitaEstero(String dataNascitaEstero) {
        this.dataNascitaEstero = dataNascitaEstero;
    }

    public String getDataScadTessera() {
        return dataScadTessera;
    }

    public void setDataScadTessera(String dataScadTessera) {
        this.dataScadTessera = dataScadTessera;
    }

    public String getRicetta1() {
        return ricetta1;
    }

    public void setRicetta1(String ricetta1) {
        this.ricetta1 = ricetta1;
    }

    public String getRicetta2() {
        return ricetta2;
    }

    public void setRicetta2(String ricetta2) {
        this.ricetta2 = ricetta2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolloSAC, bar1, bar2, altro, noteInvio, codAssistito, tipoPrescrizione, codEsenzione, nonEsente,
                reddito, codDiagnosi, descrDiagnosi, totPezzi, tipoRic, dataCompilazione, tipoVisita, dispReg, provAssistito,
                aslAssistito, indicazionePrescrizione, classePriorita, statoEstero, istituzCompetente, numIdentPers, numIdentTess,
                dataNascitaEstero, dataScadTessera, ricetta1, ricetta2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RicettaDpcm that = (RicettaDpcm) obj;
        return Objects.equals(protocolloSAC, that.protocolloSAC) &&
                Objects.equals(bar1, that.bar1) &&
                Objects.equals(bar2, that.bar2) &&
                Objects.equals(altro, that.altro) &&
                Objects.equals(noteInvio, that.noteInvio) &&
                Objects.equals(codAssistito, that.codAssistito) &&
                Objects.equals(tipoPrescrizione, that.tipoPrescrizione) &&
                Objects.equals(codEsenzione, that.codEsenzione) &&
                Objects.equals(nonEsente, that.nonEsente) &&
                Objects.equals(reddito, that.reddito) &&
                Objects.equals(codDiagnosi, that.codDiagnosi) &&
                Objects.equals(descrDiagnosi, that.descrDiagnosi) &&
                Objects.equals(totPezzi, that.totPezzi) &&
                Objects.equals(tipoRic, that.tipoRic) &&
                Objects.equals(dataCompilazione, that.dataCompilazione) &&
                Objects.equals(tipoVisita, that.tipoVisita) &&
                Objects.equals(dispReg, that.dispReg) &&
                Objects.equals(provAssistito, that.provAssistito) &&
                Objects.equals(aslAssistito, that.aslAssistito) &&
                Objects.equals(indicazionePrescrizione, that.indicazionePrescrizione) &&
                Objects.equals(classePriorita, that.classePriorita) &&
                Objects.equals(statoEstero, that.statoEstero) &&
                Objects.equals(istituzCompetente, that.istituzCompetente) &&
                Objects.equals(numIdentPers, that.numIdentPers) &&
                Objects.equals(numIdentTess, that.numIdentTess) &&
                Objects.equals(dataNascitaEstero, that.dataNascitaEstero) &&
                Objects.equals(dataScadTessera, that.dataScadTessera) &&
                Objects.equals(ricetta1, that.ricetta1) &&
                Objects.equals(ricetta2, that.ricetta2);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("protocolloSAC: " + protocolloSAC);
        result.append(", bar1: " + bar1);
        result.append(", bar2: " + bar2);
        result.append(", altro: " + altro);
        result.append(", noteInvio: " + noteInvio);
        result.append(", codAssistito: " + codAssistito);
        result.append(", tipoPrescrizione: " + tipoPrescrizione);
        result.append(", codEsenzione: " + codEsenzione);
        result.append(", nonEsente: " + nonEsente);
        result.append(", reddito: " + reddito);
        result.append(", codDiagnosi: " + codDiagnosi);
        result.append(", descrDiagnosi: " + descrDiagnosi);
        result.append(", totPezzi: " + totPezzi);
        result.append(", tipoRic: " + tipoRic);
        result.append(", dataCompilazione: " + dataCompilazione);
        result.append(", tipoVisita: " + tipoVisita);
        result.append(", dispReg: " + dispReg);
        result.append(", provAssistito: " + provAssistito);
        result.append(", aslAssistito: " + aslAssistito);
        result.append(", indicazionePrescrizione: " + indicazionePrescrizione);
        result.append(", classePriorita: " + classePriorita);
        result.append(", statoEstero: " + statoEstero);
        result.append(", istituzCompetente: " + istituzCompetente);
        result.append(", numIdentPers: " + numIdentPers);
        result.append(", numIdentTess: " + numIdentTess);
        result.append(", dataNascitaEstero: " + dataNascitaEstero);
        result.append(", dataScadTessera: " + dataScadTessera);
        result.append(", ricetta1: " + ricetta1);
        result.append(", ricetta2: " + ricetta2);
        result.append("}");

        return result.toString();

    }
}
