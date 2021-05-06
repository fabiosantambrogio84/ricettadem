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
 *                 Medico che redige il certificato di malattia
 *                 oppure operatore che redige la comunicazione di inizio ricovero.
 *                 Se l'utente è una regione è obbligatorio impostare l'elemento codiceFiscale
 *                 per specificare il medico oppure l'operatore per cui si sta inviando il certificato
 *                 o la comunicazione e l'elemento pincode non deve essere impostato.
 *                 Se l'utente è un medico è obbligatorio l'elemento pincode e l'elemento codiceFiscale non deve essere impostato. Il
 *                 pincode deve essere cifrato.
 *                 Se l'utente e' un operatore consultare la documentazione specifica del servizio di invio ricovero.
 *             
 * 
 * <p>Classe Java per redattore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="redattore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceFiscale" type="{http://cert.sanita.finanze.it/}codiceFiscale" minOccurs="0"/&gt;
 *         &lt;element name="pincode" type="{http://cert.sanita.finanze.it/}string200" minOccurs="0"/&gt;
 *         &lt;element name="codiceRegione" type="{http://cert.sanita.finanze.it/}string3" minOccurs="0"/&gt;
 *         &lt;element name="codiceAsl" type="{http://cert.sanita.finanze.it/}string3" minOccurs="0"/&gt;
 *         &lt;element name="codiceStruttura" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redattore", propOrder = {
    "codiceFiscale",
    "pincode",
    "codiceRegione",
    "codiceAsl",
    "codiceStruttura"
})
public class Redattore {

    protected String codiceFiscale;
    protected String pincode;
    protected String codiceRegione;
    protected String codiceAsl;
    protected String codiceStruttura;

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà pincode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Imposta il valore della proprietà pincode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
    }

    /**
     * Recupera il valore della proprietà codiceRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegione() {
        return codiceRegione;
    }

    /**
     * Imposta il valore della proprietà codiceRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegione(String value) {
        this.codiceRegione = value;
    }

    /**
     * Recupera il valore della proprietà codiceAsl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAsl() {
        return codiceAsl;
    }

    /**
     * Imposta il valore della proprietà codiceAsl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAsl(String value) {
        this.codiceAsl = value;
    }

    /**
     * Recupera il valore della proprietà codiceStruttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceStruttura() {
        return codiceStruttura;
    }

    /**
     * Imposta il valore della proprietà codiceStruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceStruttura(String value) {
        this.codiceStruttura = value;
    }

}
