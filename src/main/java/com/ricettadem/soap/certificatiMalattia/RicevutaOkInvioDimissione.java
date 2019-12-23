//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.23 at 10:39:14 AM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ricevutaOkInvioDimissione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ricevutaOkInvioDimissione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="idInizioRicovero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idCertificato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevutaOkInvioDimissione", propOrder = {
    "dataRicezione",
    "idInizioRicovero",
    "idCertificato"
})
public class RicevutaOkInvioDimissione {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRicezione;
    @XmlElement(required = true)
    protected String idInizioRicovero;
    @XmlElement(required = true)
    protected String idCertificato;

    /**
     * Gets the value of the dataRicezione property.
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
     * Sets the value of the dataRicezione property.
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
     * Gets the value of the idInizioRicovero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInizioRicovero() {
        return idInizioRicovero;
    }

    /**
     * Sets the value of the idInizioRicovero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInizioRicovero(String value) {
        this.idInizioRicovero = value;
    }

    /**
     * Gets the value of the idCertificato property.
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
     * Sets the value of the idCertificato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCertificato(String value) {
        this.idCertificato = value;
    }

}
