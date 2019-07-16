package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class Redattore {

    private String codiceFiscale;
    private String pincode;
    private String codiceRegione;
    private String codiceAsl;
    private String codiceStruttura;

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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

    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale, pincode, codiceRegione, codiceAsl, codiceStruttura);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Redattore that = (Redattore) obj;
        return Objects.equals(codiceFiscale, that.codiceFiscale) &&
                Objects.equals(pincode, that.pincode) &&
                Objects.equals(codiceRegione, that.codiceRegione) &&
                Objects.equals(codiceAsl, that.codiceAsl) &&
                Objects.equals(codiceStruttura, that.codiceStruttura);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("codiceFiscale: " + codiceFiscale);
        result.append(", pincode: " + pincode);
        result.append(", codiceRegione: " + codiceRegione);
        result.append(", codiceAsl: " + codiceAsl);
        result.append(", codiceStruttura: " + codiceStruttura);
        result.append("}");

        return result.toString();

    }
}
