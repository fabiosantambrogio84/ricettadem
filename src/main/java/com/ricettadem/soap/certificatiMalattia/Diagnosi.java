//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.05.07 alle 10:45:03 AM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 E' obbligatorio almeno uno tra gli elementi codiceDiagnosi e noteDiagnosi,
 *                 ma e' anche possibile inserirli tutti e due.
 *             
 * 
 * <p>Classe Java per diagnosi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="diagnosi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceDiagnosi" type="{http://cert.sanita.finanze.it/}codiceDiagnosi" minOccurs="0"/&gt;
 *         &lt;element name="noteDiagnosi" type="{http://cert.sanita.finanze.it/}string200" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnosi", propOrder = {
    "codiceDiagnosi",
    "noteDiagnosi"
})
public class Diagnosi {

    protected String codiceDiagnosi;
    protected String noteDiagnosi;

    /**
     * Recupera il valore della proprietà codiceDiagnosi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDiagnosi() {
        return codiceDiagnosi;
    }

    /**
     * Imposta il valore della proprietà codiceDiagnosi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDiagnosi(String value) {
        this.codiceDiagnosi = value;
    }

    /**
     * Recupera il valore della proprietà noteDiagnosi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteDiagnosi() {
        return noteDiagnosi;
    }

    /**
     * Imposta il valore della proprietà noteDiagnosi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteDiagnosi(String value) {
        this.noteDiagnosi = value;
    }

}
