//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.18 at 04:39:17 PM CEST 
//


package com.ricettadem.soap.annullaPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pinCode" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType"/&gt;
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType"/&gt;
 *         &lt;element name="cfMedico" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pinCode",
    "nre",
    "cfMedico"
})
@XmlRootElement(name = "AnnullaPrescrittoRichiesta", namespace = "http://annullaprescrittorichiesta.xsd.dem.sanita.finanze.it")
public class AnnullaPrescrittoRichiesta {

    @XmlElement(namespace = "http://annullaprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String pinCode;
    @XmlElement(namespace = "http://annullaprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String nre;
    @XmlElement(namespace = "http://annullaprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String cfMedico;

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the nre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNre() {
        return nre;
    }

    /**
     * Sets the value of the nre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNre(String value) {
        this.nre = value;
    }

    /**
     * Gets the value of the cfMedico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfMedico() {
        return cfMedico;
    }

    /**
     * Sets the value of the cfMedico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfMedico(String value) {
        this.cfMedico = value;
    }

}
