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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatore" type="{http://cert.sanita.finanze.it/}redattore" minOccurs="0"/&gt;
 *         &lt;element name="lavoratore" type="{http://cert.sanita.finanze.it/}lavoratore"/&gt;
 *         &lt;element name="residenza" type="{http://cert.sanita.finanze.it/}indirizzo"/&gt;
 *         &lt;element name="ricovero" type="{http://cert.sanita.finanze.it/}ricovero"/&gt;
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
    "operatore",
    "lavoratore",
    "residenza",
    "ricovero"
})
@XmlRootElement(name = "invioRicoveroRequest")
public class InvioRicoveroRequest {

    protected Redattore operatore;
    @XmlElement(required = true)
    protected Lavoratore lavoratore;
    @XmlElement(required = true)
    protected Indirizzo residenza;
    @XmlElement(required = true)
    protected Ricovero ricovero;

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link Redattore }
     *     
     */
    public Redattore getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Redattore }
     *     
     */
    public void setOperatore(Redattore value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the lavoratore property.
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
     * Sets the value of the lavoratore property.
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
     * Gets the value of the residenza property.
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
     * Sets the value of the residenza property.
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
     * Gets the value of the ricovero property.
     * 
     * @return
     *     possible object is
     *     {@link Ricovero }
     *     
     */
    public Ricovero getRicovero() {
        return ricovero;
    }

    /**
     * Sets the value of the ricovero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ricovero }
     *     
     */
    public void setRicovero(Ricovero value) {
        this.ricovero = value;
    }

}
