//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.07.16 alle 06:36:05 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per notaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="progrPresc" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codProdPrest" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoAmbulatorio" type="{http://tipodati.xsd.dem.sanita.finanze.it}maxString10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaType", propOrder = {
    "progrPresc",
    "codProdPrest",
    "tipoAmbulatorio"
})
public class NotaType {

    protected String progrPresc;
    protected String codProdPrest;
    protected String tipoAmbulatorio;

    /**
     * Recupera il valore della proprietà progrPresc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrPresc() {
        return progrPresc;
    }

    /**
     * Imposta il valore della proprietà progrPresc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrPresc(String value) {
        this.progrPresc = value;
    }

    /**
     * Recupera il valore della proprietà codProdPrest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProdPrest() {
        return codProdPrest;
    }

    /**
     * Imposta il valore della proprietà codProdPrest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProdPrest(String value) {
        this.codProdPrest = value;
    }

    /**
     * Recupera il valore della proprietà tipoAmbulatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAmbulatorio() {
        return tipoAmbulatorio;
    }

    /**
     * Imposta il valore della proprietà tipoAmbulatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAmbulatorio(String value) {
        this.tipoAmbulatorio = value;
    }

}
