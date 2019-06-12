//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 11:07:57 AM CEST 
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
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType"/&gt;
 *         &lt;element name="codEsitoAnnullamento" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/&gt;
 *         &lt;element name="ElencoErroriRicette" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoErroriRicetteType" minOccurs="0"/&gt;
 *         &lt;element name="ElencoComunicazioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoComunicazioniType" minOccurs="0"/&gt;
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
    "nre",
    "codEsitoAnnullamento",
    "elencoErroriRicette",
    "elencoComunicazioni"
})
@XmlRootElement(name = "AnnullaPrescrittoRicevuta", namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it")
public class AnnullaPrescrittoRicevuta {

    @XmlElement(namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it", required = true)
    protected String nre;
    @XmlElement(namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it", required = true)
    protected String codEsitoAnnullamento;
    @XmlElement(name = "ElencoErroriRicette", namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoErroriRicetteType elencoErroriRicette;
    @XmlElement(name = "ElencoComunicazioni", namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoComunicazioniType elencoComunicazioni;

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
     * Gets the value of the codEsitoAnnullamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsitoAnnullamento() {
        return codEsitoAnnullamento;
    }

    /**
     * Sets the value of the codEsitoAnnullamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsitoAnnullamento(String value) {
        this.codEsitoAnnullamento = value;
    }

    /**
     * Gets the value of the elencoErroriRicette property.
     * 
     * @return
     *     possible object is
     *     {@link ElencoErroriRicetteType }
     *     
     */
    public ElencoErroriRicetteType getElencoErroriRicette() {
        return elencoErroriRicette;
    }

    /**
     * Sets the value of the elencoErroriRicette property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoErroriRicetteType }
     *     
     */
    public void setElencoErroriRicette(ElencoErroriRicetteType value) {
        this.elencoErroriRicette = value;
    }

    /**
     * Gets the value of the elencoComunicazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ElencoComunicazioniType }
     *     
     */
    public ElencoComunicazioniType getElencoComunicazioni() {
        return elencoComunicazioni;
    }

    /**
     * Sets the value of the elencoComunicazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoComunicazioniType }
     *     
     */
    public void setElencoComunicazioni(ElencoComunicazioniType value) {
        this.elencoComunicazioni = value;
    }

}
