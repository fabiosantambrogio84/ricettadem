package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class Indirizzo {

    private String via;
    private String civico;
    private String cap;
    private String codiceCatastale;
    private String comune;
    private String provincia;

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCodiceCatastale() {
        return codiceCatastale;
    }

    public void setCodiceCatastale(String codiceCatastale) {
        this.codiceCatastale = codiceCatastale;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(via, civico, cap, codiceCatastale, comune, provincia);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Indirizzo that = (Indirizzo) obj;
        return Objects.equals(via, that.via) &&
                Objects.equals(civico, that.civico) &&
                Objects.equals(cap, that.cap) &&
                Objects.equals(codiceCatastale, that.codiceCatastale) &&
                Objects.equals(comune, that.comune) &&
                Objects.equals(provincia, that.provincia);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("via: " + via);
        result.append(", civico: " + civico);
        result.append(", cap: " + cap);
        result.append(", codiceCatastale: " + codiceCatastale);
        result.append(", comune: " + comune);
        result.append(", provincia: " + provincia);
        result.append("}");

        return result.toString();

    }
}
