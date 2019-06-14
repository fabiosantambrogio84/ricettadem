//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 12:45:35 PM CEST 
//


package com.ricettadem.soap.richiestaLottiNre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LottoRichiestaNRE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LottoRichiestaNRE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodRegione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentificativoLotto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CFMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LottoRichiestaNRE", namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it", propOrder = {
    "codRegione",
    "identificativoLotto",
    "cfMedico"
})
public class LottoRichiestaNRE {

    @XmlElement(name = "CodRegione", required = true)
    protected String codRegione;
    @XmlElement(name = "IdentificativoLotto", required = true)
    protected String identificativoLotto;
    @XmlElement(name = "CFMedico")
    protected String cfMedico;

    /**
     * Gets the value of the codRegione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegione() {
        return codRegione;
    }

    /**
     * Sets the value of the codRegione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegione(String value) {
        this.codRegione = value;
    }

    /**
     * Gets the value of the identificativoLotto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoLotto() {
        return identificativoLotto;
    }

    /**
     * Sets the value of the identificativoLotto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoLotto(String value) {
        this.identificativoLotto = value;
    }

    /**
     * Gets the value of the cfMedico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFMedico() {
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
    public void setCFMedico(String value) {
        this.cfMedico = value;
    }

}
