//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.10 alle 04:43:48 PM CEST 
//


package com.ricettadem.soap.annullaPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per erroreRicettaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="erroreRicettaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEsito" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/&gt;
 *         &lt;element name="esito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="progPresc" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoErrore" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erroreRicettaType", propOrder = {
    "codEsito",
    "esito",
    "progPresc",
    "tipoErrore"
})
public class ErroreRicettaType {

    @XmlElement(required = true)
    protected String codEsito;
    protected String esito;
    protected String progPresc;
    protected String tipoErrore;

    /**
     * Recupera il valore della proprietà codEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsito() {
        return codEsito;
    }

    /**
     * Imposta il valore della proprietà codEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsito(String value) {
        this.codEsito = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà progPresc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgPresc() {
        return progPresc;
    }

    /**
     * Imposta il valore della proprietà progPresc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgPresc(String value) {
        this.progPresc = value;
    }

    /**
     * Recupera il valore della proprietà tipoErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoErrore() {
        return tipoErrore;
    }

    /**
     * Imposta il valore della proprietà tipoErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoErrore(String value) {
        this.tipoErrore = value;
    }

}
