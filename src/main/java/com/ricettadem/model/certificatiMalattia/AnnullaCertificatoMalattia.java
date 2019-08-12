package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class AnnullaCertificatoMalattia {

    private Redattore medico;
    private Lavoratore lavoratore;
    private String idCertificato;

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

    public String getIdCertificato() {
        return idCertificato;
    }

    public void setIdCertificato(String idCertificato) {
        this.idCertificato = idCertificato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medico, lavoratore, idCertificato);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AnnullaCertificatoMalattia that = (AnnullaCertificatoMalattia) obj;
        return Objects.equals(medico, that.medico) &&
                Objects.equals(lavoratore, that.lavoratore) &&
                Objects.equals(idCertificato, that.idCertificato) ;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("medico: " + medico);
        result.append(", lavoratore: " + lavoratore);
        result.append(", idCertificato: " + idCertificato);
        result.append("}");

        return result.toString();

    }
}
