package com.ricettadem.model.dpcm;

import java.util.Objects;

public class RicettaDpcmInvioResponse {

    private String protocolloSAC;

    private String dataAccoglienza;

    private String nomeFileAllegato;

    private String dimensioneFileAllegato;

    private String codiceEsito;

    private String descrizioneEsito;

    public String getProtocolloSAC() {
        return protocolloSAC;
    }

    public void setProtocolloSAC(String protocolloSAC) {
        this.protocolloSAC = protocolloSAC;
    }

    public String getDataAccoglienza() {
        return dataAccoglienza;
    }

    public void setDataAccoglienza(String dataAccoglienza) {
        this.dataAccoglienza = dataAccoglienza;
    }

    public String getNomeFileAllegato() {
        return nomeFileAllegato;
    }

    public void setNomeFileAllegato(String nomeFileAllegato) {
        this.nomeFileAllegato = nomeFileAllegato;
    }

    public String getDimensioneFileAllegato() {
        return dimensioneFileAllegato;
    }

    public void setDimensioneFileAllegato(String dimensioneFileAllegato) {
        this.dimensioneFileAllegato = dimensioneFileAllegato;
    }

    public String getCodiceEsito() {
        return codiceEsito;
    }

    public void setCodiceEsito(String codiceEsito) {
        this.codiceEsito = codiceEsito;
    }

    public String getDescrizioneEsito() {
        return descrizioneEsito;
    }

    public void setDescrizioneEsito(String descrizioneEsito) {
        this.descrizioneEsito = descrizioneEsito;
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolloSAC, dataAccoglienza, nomeFileAllegato, dimensioneFileAllegato, codiceEsito, descrizioneEsito);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RicettaDpcmInvioResponse that = (RicettaDpcmInvioResponse) obj;
        return Objects.equals(protocolloSAC, that.protocolloSAC) &&
                Objects.equals(dataAccoglienza, that.dataAccoglienza) &&
                Objects.equals(nomeFileAllegato, that.nomeFileAllegato) &&
                Objects.equals(dimensioneFileAllegato, that.dimensioneFileAllegato) &&
                Objects.equals(codiceEsito, that.codiceEsito) &&
                Objects.equals(descrizioneEsito, that.descrizioneEsito);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("protocolloSAC: " + protocolloSAC);
        result.append(", dataAccoglienza: " + dataAccoglienza);
        result.append(", nomeFileAllegato: " + nomeFileAllegato);
        result.append(", dimensioneFileAllegato: " + dimensioneFileAllegato);
        result.append(", codiceEsito: " + codiceEsito);
        result.append(", descrizioneEsito: " + descrizioneEsito);
        result.append("}");

        return result.toString();
    }
}
