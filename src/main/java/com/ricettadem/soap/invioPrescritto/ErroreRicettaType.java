//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.11 at 12:24:39 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for erroreRicettaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="erroreRicettaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEsito" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/&gt;
 *         &lt;element name="esito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="progPresc" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoErrore" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erroreRicettaType", propOrder = {
    "codEsito",
    "esito",
    "progPresc",
    "tipoErrore"
})
public class ErroreRicettaType {

    @XmlElement(required = true)
    protected String codEsito;
    protected String esito;
    protected String progPresc;
    protected String tipoErrore;

    /**
     * Gets the value of the codEsito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsito() {
        return codEsito;
    }

    /**
     * Sets the value of the codEsito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsito(String value) {
        this.codEsito = value;
    }

    /**
     * Gets the value of the esito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Sets the value of the esito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Gets the value of the progPresc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgPresc() {
        return progPresc;
    }

    /**
     * Sets the value of the progPresc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgPresc(String value) {
        this.progPresc = value;
    }

    /**
     * Gets the value of the tipoErrore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoErrore() {
        return tipoErrore;
    }

    /**
     * Sets the value of the tipoErrore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoErrore(String value) {
        this.tipoErrore = value;
    }

}
