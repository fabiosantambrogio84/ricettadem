package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class CertificatoMalattia {

    private Redattore medico;
    private Lavoratore lavoratore;
    private Indirizzo residenza;
    private Reperibilita reperibilita;
    private Malattia malattia;

    public Redattore getMedico() {
        return medico;
    }

    public void setMedico(Redattore medico) {
        this.medico = medico;
    }

    public Lavoratore getLavoratore() {
        return lavoratore;
    }

    public void setLavoratore(Lavoratore lavoratore) {
        this.lavoratore = lavoratore;
    }

    public Indirizzo getResidenza() {
        return residenza;
    }

    public void setResidenza(Indirizzo residenza) {
        this.residenza = residenza;
    }

    public Reperibilita getReperibilita() {
        return reperibilita;
    }

    public void setReperibilita(Reperibilita reperibilita) {
        this.reperibilita = reperibilita;
    }

    public Malattia getMalattia() {
        return malattia;
    }

    public void setMalattia(Malattia malattia) {
        this.malattia = malattia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medico, lavoratore, residenza, reperibilita, malattia);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CertificatoMalattia that = (CertificatoMalattia) obj;
        return Objects.equals(medico, that.medico) &&
                Objects.equals(lavoratore, that.lavoratore) &&
                Objects.equals(residenza, that.residenza) &&
                Objects.equals(reperibilita, that.reperibilita) &&
                Objects.equals(malattia, that.malattia);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("medico: " + medico);
        result.append(", lavoratore: " + lavoratore);
        result.append(", residenza: " + residenza);
        result.append(", reperibilita: " + reperibilita);
        result.append(", malattia: " + malattia);
        result.append("}");

        return result.toString();

    }
}
