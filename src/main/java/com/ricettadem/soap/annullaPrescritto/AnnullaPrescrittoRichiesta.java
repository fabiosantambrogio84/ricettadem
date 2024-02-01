//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.02.01 alle 11:04:51 AM CET 
//


package com.ricettadem.soap.annullaPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà pinCode.
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
     * Imposta il valore della proprietà pinCode.
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
     * Recupera il valore della proprietà nre.
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
     * Imposta il valore della proprietà nre.
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
     * Recupera il valore della proprietà cfMedico.
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
     * Imposta il valore della proprietà cfMedico.
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
