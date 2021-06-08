//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.08 alle 02:27:51 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

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
     * Recupera il valore della proprietà codAutenticazione.
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
     * Imposta il valore della proprietà codAutenticazione.
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
     * Recupera il valore della proprietà dataInserimento.
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
     * Imposta il valore della proprietà dataInserimento.
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
     * Recupera il valore della proprietà codEsitoInserimento.
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
     * Imposta il valore della proprietà codEsitoInserimento.
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
     * Recupera il valore della proprietà elencoErroriRicette.
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
     * Imposta il valore della proprietà elencoErroriRicette.
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
     * Recupera il valore della proprietà elencoComunicazioni.
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
     * Imposta il valore della proprietà elencoComunicazioni.
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
     * Recupera il valore della proprietà elencoNota.
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
     * Imposta il valore della proprietà elencoNota.
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
     * Recupera il valore della proprietà flagPromemoria.
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
     * Imposta il valore della proprietà flagPromemoria.
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
     * Recupera il valore della proprietà pdfPromemoria.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfPromemoria() {
        return pdfPromemoria;
    }

    /**
     * Imposta il valore della proprietà pdfPromemoria.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfPromemoria(byte[] value) {
        this.pdfPromemoria = value;
    }

}
