//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.18 at 04:39:18 PM CEST 
//


package com.ricettadem.soap.richiestaLottiNre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LottoRicevutaNRE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LottoRicevutaNRE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodRegione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodRagLotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificativoLotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodLotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CFMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LottoRicevutaNRE", propOrder = {
    "codRegione",
    "codRagLotto",
    "identificativoLotto",
    "codLotto",
    "cfMedico",
    "codEsito",
    "esito"
})
public class LottoRicevutaNRE {

    @XmlElement(name = "CodRegione")
    protected String codRegione;
    @XmlElement(name = "CodRagLotto")
    protected String codRagLotto;
    @XmlElement(name = "IdentificativoLotto")
    protected String identificativoLotto;
    @XmlElement(name = "CodLotto")
    protected String codLotto;
    @XmlElement(name = "CFMedico")
    protected String cfMedico;
    @XmlElement(name = "CodEsito")
    protected String codEsito;
    @XmlElement(name = "Esito")
    protected String esito;

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
     * Gets the value of the codRagLotto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRagLotto() {
        return codRagLotto;
    }

    /**
     * Sets the value of the codRagLotto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRagLotto(String value) {
        this.codRagLotto = value;
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
     * Gets the value of the codLotto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLotto() {
        return codLotto;
    }

    /**
     * Sets the value of the codLotto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLotto(String value) {
        this.codLotto = value;
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

}
