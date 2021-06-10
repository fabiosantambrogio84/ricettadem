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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ricevutaOkRettificaDimissione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricevutaOkRettificaDimissione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="idCertificato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lavoratore" type="{http://cert.sanita.finanze.it/}anagrafica"/&gt;
 *         &lt;element name="residenza" type="{http://cert.sanita.finanze.it/}indirizzo"/&gt;
 *         &lt;element name="reperibilita" type="{http://cert.sanita.finanze.it/}reperibilita" minOccurs="0"/&gt;
 *         &lt;element name="dimissione" type="{http://cert.sanita.finanze.it/}dimissione"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevutaOkRettificaDimissione", propOrder = {
    "dataRicezione",
    "idCertificato",
    "lavoratore",
    "residenza",
    "reperibilita",
    "dimissione"
})
public class RicevutaOkRettificaDimissione {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRicezione;
    @XmlElement(required = true)
    protected String idCertificato;
    @XmlElement(required = true)
    protected Anagrafica lavoratore;
    @XmlElement(required = true)
    protected Indirizzo residenza;
    protected Reperibilita reperibilita;
    @XmlElement(required = true)
    protected Dimissione dimissione;

    /**
     * Recupera il valore della proprietà dataRicezione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRicezione() {
        return dataRicezione;
    }

    /**
     * Imposta il valore della proprietà dataRicezione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRicezione(XMLGregorianCalendar value) {
        this.dataRicezione = value;
    }

    /**
     * Recupera il valore della proprietà idCertificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCertificato() {
        return idCertificato;
    }

    /**
     * Imposta il valore della proprietà idCertificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCertificato(String value) {
        this.idCertificato = value;
    }

    /**
     * Recupera il valore della proprietà lavoratore.
     * 
     * @return
     *     possible object is
     *     {@link Anagrafica }
     *     
     */
    public Anagrafica getLavoratore() {
        return lavoratore;
    }

    /**
     * Imposta il valore della proprietà lavoratore.
     * 
     * @param value
     *     allowed object is
     *     {@link Anagrafica }
     *     
     */
    public void setLavoratore(Anagrafica value) {
        this.lavoratore = value;
    }

    /**
     * Recupera il valore della proprietà residenza.
     * 
     * @return
     *     possible object is
     *     {@link Indirizzo }
     *     
     */
    public Indirizzo getResidenza() {
        return residenza;
    }

    /**
     * Imposta il valore della proprietà residenza.
     * 
     * @param value
     *     allowed object is
     *     {@link Indirizzo }
     *     
     */
    public void setResidenza(Indirizzo value) {
        this.residenza = value;
    }

    /**
     * Recupera il valore della proprietà reperibilita.
     * 
     * @return
     *     possible object is
     *     {@link Reperibilita }
     *     
     */
    public Reperibilita getReperibilita() {
        return reperibilita;
    }

    /**
     * Imposta il valore della proprietà reperibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link Reperibilita }
     *     
     */
    public void setReperibilita(Reperibilita value) {
        this.reperibilita = value;
    }

    /**
     * Recupera il valore della proprietà dimissione.
     * 
     * @return
     *     possible object is
     *     {@link Dimissione }
     *     
     */
    public Dimissione getDimissione() {
        return dimissione;
    }

    /**
     * Imposta il valore della proprietà dimissione.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimissione }
     *     
     */
    public void setDimissione(Dimissione value) {
        this.dimissione = value;
    }

}
