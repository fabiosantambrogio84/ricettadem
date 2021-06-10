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
 *         &lt;element name="medico" type="{http://cert.sanita.finanze.it/}redattore"/&gt;
 *         &lt;element name="lavoratore" type="{http://cert.sanita.finanze.it/}lavoratore"/&gt;
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
@XmlType(name = "", propOrder = {
    "medico",
    "lavoratore",
    "residenza",
    "reperibilita",
    "malattia"
})
@XmlRootElement(name = "invioMalattiaRequest")
public class InvioMalattiaRequest {

    @XmlElement(required = true)
    protected Redattore medico;
    @XmlElement(required = true)
    protected Lavoratore lavoratore;
    @XmlElement(required = true)
    protected Indirizzo residenza;
    protected Reperibilita reperibilita;
    @XmlElement(required = true)
    protected Malattia malattia;

    /**
     * Recupera il valore della proprietà medico.
     * 
     * @return
     *     possible object is
     *     {@link Redattore }
     *     
     */
    public Redattore getMedico() {
        return medico;
    }

    /**
     * Imposta il valore della proprietà medico.
     * 
     * @param value
     *     allowed object is
     *     {@link Redattore }
     *     
     */
    public void setMedico(Redattore value) {
        this.medico = value;
    }

    /**
     * Recupera il valore della proprietà lavoratore.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratore }
     *     
     */
    public Lavoratore getLavoratore() {
        return lavoratore;
    }

    /**
     * Imposta il valore della proprietà lavoratore.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratore }
     *     
     */
    public void setLavoratore(Lavoratore value) {
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
