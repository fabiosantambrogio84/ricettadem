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

    @Override
    public int hashCode() {
        return Objects.hash(codiceProdotto, descrizioneProdotto, codiceGruppoEquivalenza, descrizioneGruppoEquivalenza, testoLibero, descrizioneTestoLibero, nonSostituito, noteMotivazioni, codiceMotivazione, notaProdotto, quantita, informazioniPrescrizione, informazioniPrescrizione2, codiceCatalogoPrescrizione, tipoAccesso1, numeroNota, condizioneErogabilita, appropriatezzaPrescrittiva, patologia);
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
                Objects.equals(patologia, that.patologia);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append(" codiceProdotto : " + codiceProdotto );
        result.append(", descrizioneProdotto : " + descrizioneProdotto );
        result.append(", codiceGruppoEquivalenza : " + codiceGruppoEquivalenza );
        result.append(", descrizioneGruppoEquivalenza : " + descrizioneGruppoEquivalenza );
        result.append(", testoLibero : " + testoLibero );
        result.append(", descrizioneTestoLibero : " + descrizioneTestoLibero );
        result.append(", nonSostituito : " + nonSostituito );
        result.append(", noteMotivazioni : " + noteMotivazioni );
        result.append(", codiceMotivazione : " + codiceMotivazione );
        result.append(", notaProdotto : " + notaProdotto );
        result.append(", quantita : " + quantita );
        result.append(", informazioniPrescrizione : " + informazioniPrescrizione );
        result.append(", informazioniPrescrizione2 : " + informazioniPrescrizione2 );
        result.append(", codiceCatalogoPrescrizione : " + codiceCatalogoPrescrizione );
        result.append(", tipoAccesso1 : " + tipoAccesso1 );
        result.append(", numeroNota : " + numeroNota );
        result.append(", condizioneErogabilita : " + condizioneErogabilita );
        result.append(", appropriatezzaPrescrittiva : " + appropriatezzaPrescrittiva );
        result.append(", patologia: " + patologia);

        result.append("}");

        return result.toString();
    }
}
