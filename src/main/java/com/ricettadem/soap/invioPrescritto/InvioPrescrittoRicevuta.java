//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.18 at 04:00:53 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

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
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType" minOccurs="0"/&gt;
 *         &lt;element name="codAutenticazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="dataInserimento" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/&gt;
 *         &lt;element name="codEsitoInserimento" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/&gt;
 *         &lt;element name="ElencoErroriRicette" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoErroriRicetteType" minOccurs="0"/&gt;
 *         &lt;element name="ElencoComunicazioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoComunicazioniType" minOccurs="0"/&gt;
 *         &lt;element name="ElencoNota" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoNotaType" minOccurs="0"/&gt;
 *         &lt;element name="flagPromemoria" type="{http://tipodati.xsd.dem.sanita.finanze.it}string1Type" minOccurs="0"/&gt;
 *         &lt;element name="pdfPromemoria" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "codAutenticazione",
    "dataInserimento",
    "codEsitoInserimento",
    "elencoErroriRicette",
    "elencoComunicazioni",
    "elencoNota",
    "flagPromemoria",
    "pdfPromemoria"
})
@XmlRootElement(name = "InvioPrescrittoRicevuta", namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
public class InvioPrescrittoRicevuta {

    @XmlElement(namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected String nre;
    @XmlElement(namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected String codAutenticazione;
    @XmlElement(namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected String dataInserimento;
    @XmlElement(namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it", required = true)
    protected String codEsitoInserimento;
    @XmlElement(name = "ElencoErroriRicette", namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoErroriRicetteType elencoErroriRicette;
    @XmlElement(name = "ElencoComunicazioni", namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoComunicazioniType elencoComunicazioni;
    @XmlElement(name = "ElencoNota", namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoNotaType elencoNota;
    @XmlElement(namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected String flagPromemoria;
    @XmlElement(namespace = "http://invioprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected byte[] pdfPromemoria;

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
     * Gets the value of the codAutenticazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAutenticazione() {
        return codAutenticazione;
    }

    /**
     * Sets the value of the codAutenticazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAutenticazione(String value) {
        this.codAutenticazione = value;
    }

    /**
     * Gets the value of the dataInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Sets the value of the dataInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInserimento(String value) {
        this.dataInserimento = value;
    }

    /**
     * Gets the value of the codEsitoInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsitoInserimento() {
        return codEsitoInserimento;
    }

    /**
     * Sets the value of the codEsitoInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsitoInserimento(String value) {
        this.codEsitoInserimento = value;
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

    /**
     * Gets the value of the elencoNota property.
     * 
     * @return
     *     possible object is
     *     {@link ElencoNotaType }
     *     
     */
    public ElencoNotaType getElencoNota() {
        return elencoNota;
    }

    /**
     * Sets the value of the elencoNota property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoNotaType }
     *     
     */
    public void setElencoNota(ElencoNotaType value) {
        this.elencoNota = value;
    }

    /**
     * Gets the value of the flagPromemoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagPromemoria() {
        return flagPromemoria;
    }

    /**
     * Sets the value of the flagPromemoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagPromemoria(String value) {
        this.flagPromemoria = value;
    }

    /**
     * Gets the value of the pdfPromemoria property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfPromemoria() {
        return pdfPromemoria;
    }

    /**
     * Sets the value of the pdfPromemoria property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfPromemoria(byte[] value) {
        this.pdfPromemoria = value;
    }

}
