//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.31 at 05:45:17 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the progrPresc property.
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
     * Sets the value of the progrPresc property.
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
     * Gets the value of the codProdPrest property.
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
     * Sets the value of the codProdPrest property.
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
     * Gets the value of the tipoAmbulatorio property.
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
     * Sets the value of the tipoAmbulatorio property.
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
