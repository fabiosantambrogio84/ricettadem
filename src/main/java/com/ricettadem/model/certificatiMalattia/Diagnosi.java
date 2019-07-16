package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class Diagnosi {

    private String codiceDiagnosi;
    private String noteDiagnosi;

    public String getCodiceDiagnosi() {
        return codiceDiagnosi;
    }

    public void setCodiceDiagnosi(String codiceDiagnosi) {
        this.codiceDiagnosi = codiceDiagnosi;
    }

    public String getNoteDiagnosi() {
        return noteDiagnosi;
    }

    public void setNoteDiagnosi(String noteDiagnosi) {
        this.noteDiagnosi = noteDiagnosi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceDiagnosi, noteDiagnosi);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Diagnosi that = (Diagnosi) obj;
        return Objects.equals(codiceDiagnosi, that.codiceDiagnosi) &&
                Objects.equals(noteDiagnosi, that.noteDiagnosi);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("codiceDiagnosi: " + codiceDiagnosi);
        result.append(", noteDiagnosi: " + noteDiagnosi);
        result.append("}");

        return result.toString();

    }
}
