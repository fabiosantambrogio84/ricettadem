//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.02.01 alle 11:04:51 AM CET 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ricevutaOkRistampaMalattia complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricevutaOkRistampaMalattia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lavoratore" type="{http://cert.sanita.finanze.it/}anagrafica"/&gt;
 *         &lt;element name="residenza" type="{http://cert.sanita.finanze.it/}indirizzo"/&gt;
 *         &lt;element name="reperibilita" type="{http://cert.sanita.finanze.it/}reperibilita" minOccurs="0"/&gt;
 *         &lt;element name="malattia" type="{http://cert.sanita.finanze.it/}malattia"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevutaOkRistampaMalattia", propOrder = {
    "lavoratore",
    "residenza",
    "reperibilita",
    "malattia"
})
public class RicevutaOkRistampaMalattia {

    @XmlElement(required = true)
    protected Anagrafica lavoratore;
    @XmlElement(required = true)
    protected Indirizzo residenza;
    protected Reperibilita reperibilita;
    @XmlElement(required = true)
    protected Malattia malattia;

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
     * Recupera il valore della proprietà malattia.
     * 
     * @return
     *     possible object is
     *     {@link Malattia }
     *     
     */
    public Malattia getMalattia() {
        return malattia;
    }

    /**
     * Imposta il valore della proprietà malattia.
     * 
     * @param value
     *     allowed object is
     *     {@link Malattia }
     *     
     */
    public void setMalattia(Malattia value) {
        this.malattia = value;
    }

}
