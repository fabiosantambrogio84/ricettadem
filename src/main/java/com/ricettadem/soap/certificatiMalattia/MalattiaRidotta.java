//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.10 alle 04:43:49 PM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Sottoinsieme dell'elemento malattia, utilizzato come risultato della funzione di ricerca.
 *             
 * 
 * <p>Classe Java per malattiaRidotta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="malattiaRidotta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataRilascio" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="dataInizio" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="dataFine" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="visita" type="{http://cert.sanita.finanze.it/}tipoVisita"/&gt;
 *         &lt;element name="tipoCertificato" type="{http://cert.sanita.finanze.it/}tipoCertificato"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "malattiaRidotta", propOrder = {
    "dataRilascio",
    "dataInizio",
    "dataFine",
    "visita",
    "tipoCertificato"
})
public class MalattiaRidotta {

    @XmlElement(required = true)
    protected String dataRilascio;
    @XmlElement(required = true)
    protected String dataInizio;
    @XmlElement(required = true)
    protected String dataFine;
    @XmlElement(required = true)
    protected String visita;
    @XmlElement(required = true)
    protected String tipoCertificato;

    /**
     * Recupera il valore della proprietà dataRilascio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRilascio() {
        return dataRilascio;
    }

    /**
     * Imposta il valore della proprietà dataRilascio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRilascio(String value) {
        this.dataRilascio = value;
    }

    /**
     * Recupera il valore della proprietà dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietà dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInizio(String value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprietà dataFine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprietà dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFine(String value) {
        this.dataFine = value;
    }

    /**
     * Recupera il valore della proprietà visita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisita() {
        return visita;
    }

    /**
     * Imposta il valore della proprietà visita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisita(String value) {
        this.visita = value;
    }

    /**
     * Recupera il valore della proprietà tipoCertificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCertificato() {
        return tipoCertificato;
    }

    /**
     * Imposta il valore della proprietà tipoCertificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCertificato(String value) {
        this.tipoCertificato = value;
    }

}
