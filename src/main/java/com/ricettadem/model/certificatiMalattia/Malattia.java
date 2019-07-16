package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class Malattia {

    private String ruoloMedico;
    private String dataRilascio;
    private String dataInizio;
    private String dataFine;
    private String visita;
    private String tipoCertificato;
    private Diagnosi diagnosi;
    private String giornataLavorata;
    private String trauma;
    private String agevolazioni;

    public String getRuoloMedico() {
        return ruoloMedico;
    }

    public void setRuoloMedico(String ruoloMedico) {
        this.ruoloMedico = ruoloMedico;
    }

    public String getDataRilascio() {
        return dataRilascio;
    }

    public void setDataRilascio(String dataRilascio) {
        this.dataRilascio = dataRilascio;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public String getTipoCertificato() {
        return tipoCertificato;
    }

    public void setTipoCertificato(String tipoCertificato) {
        this.tipoCertificato = tipoCertificato;
    }

    public Diagnosi getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(Diagnosi diagnosi) {
        this.diagnosi = diagnosi;
    }

    public String getGiornataLavorata() {
        return giornataLavorata;
    }

    public void setGiornataLavorata(String giornataLavorata) {
        this.giornataLavorata = giornataLavorata;
    }

    public String getTrauma() {
        return trauma;
    }

    public void setTrauma(String trauma) {
        this.trauma = trauma;
    }

    public String getAgevolazioni() {
        return agevolazioni;
    }

    public void setAgevolazioni(String agevolazioni) {
        this.agevolazioni = agevolazioni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruoloMedico, dataRilascio, dataInizio, dataFine, visita, tipoCertificato, diagnosi, giornataLavorata, trauma, agevolazioni);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Malattia that = (Malattia) obj;
        return Objects.equals(ruoloMedico, that.ruoloMedico) &&
                Objects.equals(dataRilascio, that.dataRilascio) &&
                Objects.equals(dataInizio, that.dataInizio) &&
                Objects.equals(dataFine, that.dataFine) &&
                Objects.equals(visita, that.visita) &&
                Objects.equals(tipoCertificato, that.tipoCertificato) &&
                Objects.equals(diagnosi, that.diagnosi) &&
                Objects.equals(giornataLavorata, that.giornataLavorata) &&
                Objects.equals(trauma, that.trauma) &&
                Objects.equals(agevolazioni, that.agevolazioni);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("ruoloMedico: " + ruoloMedico);
        result.append(", dataRilascio: " + dataRilascio);
        result.append(", dataInizio: " + dataInizio);
        result.append(", dataFine: " + dataFine);
        result.append(", visita: " + visita);
        result.append(", tipoCertificato: " + tipoCertificato);
        result.append(", diagnosi: " + diagnosi);
        result.append(", giornataLavorata: " + giornataLavorata);
        result.append(", trauma: " + trauma);
        result.append(", agevolazioni: " + agevolazioni);
        result.append("}");

        return result.toString();

    }
}
