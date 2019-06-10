package com.ricettadem.model.dpcm;

import java.util.Objects;

public class Prescrizione {

    private String codProdPrest;
    private String descrProdPrest;
    private String notaProd;
    private String quantita;
    private String prescrizione1;
    private String prescrizione2;

    public String getCodProdPrest() {
        return codProdPrest;
    }

    public void setCodProdPrest(String codProdPrest) {
        this.codProdPrest = codProdPrest;
    }

    public String getDescrProdPrest() {
        return descrProdPrest;
    }

    public void setDescrProdPrest(String descrProdPrest) {
        this.descrProdPrest = descrProdPrest;
    }

    public String getNotaProd() {
        return notaProd;
    }

    public void setNotaProd(String notaProd) {
        this.notaProd = notaProd;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getPrescrizione1() {
        return prescrizione1;
    }

    public void setPrescrizione1(String prescrizione1) {
        this.prescrizione1 = prescrizione1;
    }

    public String getPrescrizione2() {
        return prescrizione2;
    }

    public void setPrescrizione2(String prescrizione2) {
        this.prescrizione2 = prescrizione2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProdPrest, descrProdPrest, notaProd, quantita, prescrizione1, prescrizione2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Prescrizione that = (Prescrizione) obj;
        return Objects.equals(codProdPrest, that.codProdPrest) &&
                Objects.equals(descrProdPrest, that.descrProdPrest) &&
                Objects.equals(notaProd, that.notaProd) &&
                Objects.equals(quantita, that.quantita) &&
                Objects.equals(prescrizione1, that.prescrizione1) &&
                Objects.equals(prescrizione2, that.prescrizione2);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("{");
        result.append("codProdPrest: " + codProdPrest);
        result.append(", descrProdPrest: " + descrProdPrest);
        result.append(", notaProd: " + notaProd);
        result.append(", quantita: " + quantita);
        result.append(", prescrizione1: " + prescrizione1);
        result.append(", prescrizione2: " + prescrizione2);
        result.append("}");

        return result.toString();

    }
}
