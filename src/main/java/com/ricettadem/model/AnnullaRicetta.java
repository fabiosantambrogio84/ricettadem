package com.ricettadem.model;

import java.util.Objects;

public class AnnullaRicetta {

    private String pinCode;
    private String codiceFiscale;
    private String nre;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinCode, codiceFiscale, nre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AnnullaRicetta that = (AnnullaRicetta) obj;
        return Objects.equals(pinCode, that.pinCode) &&
                Objects.equals(codiceFiscale, that.codiceFiscale) &&
                Objects.equals(nre, that.nre);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("pinCode: " + pinCode);
        result.append(", codiceFiscale: " + codiceFiscale);
        result.append(", nre: " + nre);
        result.append("}");

        return result.toString();

    }
}
