package com.ricettadem.model.dpcm;

import com.ricettadem.model.DettaglioPrescrizione;

import java.util.List;
import java.util.Objects;

public class RicettaMir {

    private Testata testata;
    private RicettaDpcm ricetta;
    private List<Prescrizione> prescrizioni;

    public Testata getTestata() {
        return testata;
    }

    public void setTestata(Testata testata) {
        this.testata = testata;
    }

    public RicettaDpcm getRicetta() {
        return ricetta;
    }

    public void setRicetta(RicettaDpcm ricetta) {
        this.ricetta = ricetta;
    }

    public List<Prescrizione> getPrescrizioni() {
        return prescrizioni;
    }

    public void setPrescrizioni(List<Prescrizione> prescrizioni) {
        this.prescrizioni = prescrizioni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testata, ricetta, prescrizioni);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RicettaMir that = (RicettaMir) obj;
        return Objects.equals(testata, that.testata) &&
                Objects.equals(ricetta, that.ricetta) &&
                Objects.equals(prescrizioni, that.prescrizioni);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("testata: " + testata);
        result.append(", ricetta: " + ricetta);
        if(prescrizioni != null){
            result.append(", prescrizioni: [");
            for(Prescrizione prescrizione: prescrizioni){
                result.append(prescrizione.toString());
            }
            result.append("]");
        }
        result.append("}");

        return result.toString();

    }
}
