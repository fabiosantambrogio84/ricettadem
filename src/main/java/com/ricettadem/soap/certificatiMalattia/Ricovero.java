//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.08 alle 02:27:53 PM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Giornata lavorata: se true indica che il lavoratore ha dichiarato di aver completato la propria attivita' lavorativa alla data del
 *                 ricovero,
 *                 false altrimenti.
 *                 Trauma: indica l'occorrenza di un evento traumatico.
 *             
 * 
 * <p>Classe Java per ricovero complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricovero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataRicovero" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="giornataLavorata" type="{http://cert.sanita.finanze.it/}booleanString" minOccurs="0"/&gt;
 *         &lt;element name="trauma" type="{http://cert.sanita.finanze.it/}booleanString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricovero", propOrder = {
    "dataRicovero",
    "giornataLavorata",
    "trauma"
})
public class Ricovero {

    @XmlElement(required = true)
    protected String dataRicovero;
    protected String giornataLavorata;
    protected String trauma;

    /**
     * Recupera il valore della proprietà dataRicovero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRicovero() {
        return dataRicovero;
    }

    /**
     * Imposta il valore della proprietà dataRicovero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRicovero(String value) {
        this.dataRicovero = value;
    }

    /**
     * Recupera il valore della proprietà giornataLavorata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiornataLavorata() {
        return giornataLavorata;
    }

    /**
     * Imposta il valore della proprietà giornataLavorata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiornataLavorata(String value) {
        this.giornataLavorata = value;
    }

    /**
     * Recupera il valore della proprietà trauma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrauma() {
        return trauma;
    }

    /**
     * Imposta il valore della proprietà trauma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrauma(String value) {
        this.trauma = value;
    }

}
