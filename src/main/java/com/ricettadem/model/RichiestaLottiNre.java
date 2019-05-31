package com.ricettadem.model;

import java.util.Objects;

public class RichiestaLottiNre {

    private String codiceRegione;
    private String paramDimensioneLotto;
    private String codiceFiscale;

    public String getCodiceRegione() {
        return codiceRegione;
    }

    public void setCodiceRegione(String codiceRegione) {
        this.codiceRegione = codiceRegione;
    }

    public String getParamDimensioneLotto() {
        return paramDimensioneLotto;
    }

    public void setParamDimensioneLotto(String paramDimensioneLotto) {
        this.paramDimensioneLotto = paramDimensioneLotto;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceRegione, paramDimensioneLotto, codiceFiscale);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RichiestaLottiNre that = (RichiestaLottiNre) obj;
        return Objects.equals(codiceRegione, that.codiceRegione) &&
                Objects.equals(paramDimensioneLotto, that.paramDimensioneLotto) &&
                Objects.equals(codiceFiscale, that.codiceFiscale);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("codiceRegione: " + codiceRegione);
        result.append(", paramDimensioneLotto: " + paramDimensioneLotto);
        result.append(", codiceFiscale: " + codiceFiscale);
        result.append("}");

        return result.toString();

    }
}
