package com.ricettadem.model.dpcm;

import java.util.Objects;

public class Testata {

    private String pinCode;
    private String tipoInvio;
    private String testata1;
    private String testata2;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getTipoInvio() {
        return tipoInvio;
    }

    public void setTipoInvio(String tipoInvio) {
        this.tipoInvio = tipoInvio;
    }

    public String getTestata1() {
        return testata1;
    }

    public void setTestata1(String testata1) {
        this.testata1 = testata1;
    }

    public String getTestata2() {
        return testata2;
    }

    public void setTestata2(String testata2) {
        this.testata2 = testata2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinCode, tipoInvio, testata1, testata2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Testata that = (Testata) obj;
        return Objects.equals(pinCode, that.pinCode) &&
                Objects.equals(tipoInvio, that.tipoInvio) &&
                Objects.equals(testata1, that.testata1) &&
                Objects.equals(testata2, that.testata2);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("pinCode: " + pinCode);
        result.append(", tipoInvio: " + tipoInvio);
        result.append(", testata1: " + testata1);
        result.append(", testata2: " + testata2);
        result.append("}");

        return result.toString();

    }
}
