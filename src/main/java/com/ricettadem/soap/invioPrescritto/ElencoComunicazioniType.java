//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.10 at 04:45:56 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elencoComunicazioniType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elencoComunicazioniType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comunicazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}comunicazioneType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoComunicazioniType", propOrder = {
    "comunicazione"
})
public class ElencoComunicazioniType {

    @XmlElement(name = "Comunicazione", required = true)
    protected List<ComunicazioneType> comunicazione;

    /**
     * Gets the value of the comunicazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comunicazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComunicazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComunicazioneType }
     * 
     * 
     */
    public List<ComunicazioneType> getComunicazione() {
        if (comunicazione == null) {
            comunicazione = new ArrayList<ComunicazioneType>();
        }
        return this.comunicazione;
    }

}
