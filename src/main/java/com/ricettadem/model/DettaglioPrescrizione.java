package com.ricettadem.model;

import java.util.Objects;

public class DettaglioPrescrizione {

    private String codiceProdotto;
    private String descrizioneProdotto;
    private String codiceGruppoEquivalenza;
    private String descrizioneGruppoEquivalenza;
    private String testoLibero;
    private String descrizioneTestoLibero;
    private String nonSostituito;
    private String noteMotivazioni;
    private String codiceMotivazione;
    private String notaProdotto;
    private String quantita;
    private String informazioniPrescrizione;
    private String informazioniPrescrizione2;
    private String codiceCatalogoPrescrizione;
    private String tipoAccesso1;
    private String numeroNota;
    private String condizioneErogabilita;
    private String appropriatezzaPrescrittiva;
    private String patologia;
    private String numSedute;

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public String getDescrizioneProdotto() {
        return descrizioneProdotto;
    }

    public void setDescrizioneProdotto(String descrizioneProdotto) {
        this.descrizioneProdotto = descrizioneProdotto;
    }

    public String getCodiceGruppoEquivalenza() {
        return codiceGruppoEquivalenza;
    }

    public void setCodiceGruppoEquivalenza(String codiceGruppoEquivalenza) {
        this.codiceGruppoEquivalenza = codiceGruppoEquivalenza;
    }

    public String getDescrizioneGruppoEquivalenza() {
        return descrizioneGruppoEquivalenza;
    }

    public void setDescrizioneGruppoEquivalenza(String descrizioneGruppoEquivalenza) {
        this.descrizioneGruppoEquivalenza = descrizioneGruppoEquivalenza;
    }

    public String getTestoLibero() {
        return testoLibero;
    }

    public void setTestoLibero(String testoLibero) {
        this.testoLibero = testoLibero;
    }

    public String getDescrizioneTestoLibero() {
        return descrizioneTestoLibero;
    }

    public void setDescrizioneTestoLibero(String descrizioneTestoLibero) {
        this.descrizioneTestoLibero = descrizioneTestoLibero;
    }

    public String getNonSostituito() {
        return nonSostituito;
    }

    public void setNonSostituito(String nonSostituito) {
        this.nonSostituito = nonSostituito;
    }

    public String getNoteMotivazioni() {
        return noteMotivazioni;
    }

    public void setNoteMotivazioni(String noteMotivazioni) {
        this.noteMotivazioni = noteMotivazioni;
    }

    public String getCodiceMotivazione() {
        return codiceMotivazione;
    }

    public void setCodiceMotivazione(String codiceMotivazione) {
        this.codiceMotivazione = codiceMotivazione;
    }

    public String getNotaProdotto() {
        return notaProdotto;
    }

    public void setNotaProdotto(String notaProdotto) {
        this.notaProdotto = notaProdotto;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getInformazioniPrescrizione() {
        return informazioniPrescrizione;
    }

    public void setInformazioniPrescrizione(String informazioniPrescrizione) {
        this.informazioniPrescrizione = informazioniPrescrizione;
    }

    public String getInformazioniPrescrizione2() {
        return informazioniPrescrizione2;
    }

    public void setInformazioniPrescrizione2(String informazioniPrescrizione2) {
        this.informazioniPrescrizione2 = informazioniPrescrizione2;
    }

    public String getCodiceCatalogoPrescrizione() {
        return codiceCatalogoPrescrizione;
    }

    public void setCodiceCatalogoPrescrizione(String codiceCatalogoPrescrizione) {
        this.codiceCatalogoPrescrizione = codiceCatalogoPrescrizione;
    }

    public String getTipoAccesso1() {
        return tipoAccesso1;
    }

    public void setTipoAccesso1(String tipoAccesso1) {
        this.tipoAccesso1 = tipoAccesso1;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getCondizioneErogabilita() {
        return condizioneErogabilita;
    }

    public void setCondizioneErogabilita(String condizioneErogabilita) {
        this.condizioneErogabilita = condizioneErogabilita;
    }

    public String getAppropriatezzaPrescrittiva() {
        return appropriatezzaPrescrittiva;
    }

    public void setAppropriatezzaPrescrittiva(String appropriatezzaPrescrittiva) {
        this.appropriatezzaPrescrittiva = appropriatezzaPrescrittiva;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getNumSedute() {
        return numSedute;
    }

    public void setNumSedute(String numSedute) {
        this.numSedute = numSedute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceProdotto, descrizioneProdotto, codiceGruppoEquivalenza, descrizioneGruppoEquivalenza, testoLibero, descrizioneTestoLibero, nonSostituito, noteMotivazioni, codiceMotivazione, notaProdotto, quantita, informazioniPrescrizione, informazioniPrescrizione2, codiceCatalogoPrescrizione, tipoAccesso1, numeroNota, condizioneErogabilita, appropriatezzaPrescrittiva, patologia, numSedute);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DettaglioPrescrizione that = (DettaglioPrescrizione) obj;
        return Objects.equals(codiceProdotto , that.codiceProdotto ) &&
                Objects.equals(descrizioneProdotto , that.descrizioneProdotto ) &&
                Objects.equals(codiceGruppoEquivalenza , that.codiceGruppoEquivalenza ) &&
                Objects.equals(descrizioneGruppoEquivalenza , that.descrizioneGruppoEquivalenza ) &&
                Objects.equals(testoLibero , that.testoLibero ) &&
                Objects.equals(descrizioneTestoLibero , that.descrizioneTestoLibero ) &&
                Objects.equals(nonSostituito , that.nonSostituito ) &&
                Objects.equals(noteMotivazioni , that.noteMotivazioni ) &&
                Objects.equals(codiceMotivazione , that.codiceMotivazione ) &&
                Objects.equals(notaProdotto , that.notaProdotto ) &&
                Objects.equals(quantita , that.quantita ) &&
                Objects.equals(informazioniPrescrizione , that.informazioniPrescrizione ) &&
                Objects.equals(informazioniPrescrizione2 , that.informazioniPrescrizione2 ) &&
                Objects.equals(codiceCatalogoPrescrizione , that.codiceCatalogoPrescrizione ) &&
                Objects.equals(tipoAccesso1 , that.tipoAccesso1 ) &&
                Objects.equals(numeroNota , that.numeroNota ) &&
                Objects.equals(condizioneErogabilita , that.condizioneErogabilita ) &&
                Objects.equals(appropriatezzaPrescrittiva , that.appropriatezzaPrescrittiva ) &&
                Objects.equals(patologia, that.patologia) &&
                Objects.equals(numSedute, that.numSedute);
    }

    @Override
    public String toString() {

        return "{" +
                " codiceProdotto : " + codiceProdotto +
                ", descrizioneProdotto : " + descrizioneProdotto +
                ", codiceGruppoEquivalenza : " + codiceGruppoEquivalenza +
                ", descrizioneGruppoEquivalenza : " + descrizioneGruppoEquivalenza +
                ", testoLibero : " + testoLibero +
                ", descrizioneTestoLibero : " + descrizioneTestoLibero +
                ", nonSostituito : " + nonSostituito +
                ", noteMotivazioni : " + noteMotivazioni +
                ", codiceMotivazione : " + codiceMotivazione +
                ", notaProdotto : " + notaProdotto +
                ", quantita : " + quantita +
                ", informazioniPrescrizione : " + informazioniPrescrizione +
                ", informazioniPrescrizione2 : " + informazioniPrescrizione2 +
                ", codiceCatalogoPrescrizione : " + codiceCatalogoPrescrizione +
                ", tipoAccesso1 : " + tipoAccesso1 +
                ", numeroNota : " + numeroNota +
                ", condizioneErogabilita : " + condizioneErogabilita +
                ", appropriatezzaPrescrittiva : " + appropriatezzaPrescrittiva +
                ", patologia: " + patologia +
                ", numSedute: " + numSedute +
                "}";
    }
}
