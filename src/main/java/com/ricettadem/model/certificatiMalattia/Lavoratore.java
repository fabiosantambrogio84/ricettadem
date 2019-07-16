package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class Lavoratore {

    private String codiceFiscale;

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Lavoratore that = (Lavoratore) obj;
        return Objects.equals(codiceFiscale, that.codiceFiscale);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("codiceFiscale: " + codiceFiscale);
        result.append("}");

        return result.toString();

    }
}
