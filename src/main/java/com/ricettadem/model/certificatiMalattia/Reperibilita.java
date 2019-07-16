package com.ricettadem.model.certificatiMalattia;

import java.util.Objects;

public class Reperibilita {

    private String cognome;
    private Indirizzo indirizzo;

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cognome, indirizzo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Reperibilita that = (Reperibilita) obj;
        return Objects.equals(cognome, that.cognome) &&
                Objects.equals(indirizzo, that.indirizzo);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("cognome: " + cognome);
        result.append(", indirizzo: " + indirizzo);
        result.append("}");

        return result.toString();

    }
}
