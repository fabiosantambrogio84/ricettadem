//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.10 at 11:32:30 AM CEST 
//


package com.ricettadem.soap.invioPrescritto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elencoErroriRicetteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elencoErroriRicetteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErroreRicetta" type="{http://tipodati.xsd.dem.sanita.finanze.it}erroreRicettaType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoErroriRicetteType", propOrder = {
    "erroreRicetta"
})
public class ElencoErroriRicetteType {

    @XmlElement(name = "ErroreRicetta", required = true)
    protected List<ErroreRicettaType> erroreRicetta;

    /**
     * Gets the value of the erroreRicetta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erroreRicetta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroreRicetta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErroreRicettaType }
     * 
     * 
     */
    public List<ErroreRicettaType> getErroreRicetta() {
        if (erroreRicetta == null) {
            erroreRicetta = new ArrayList<ErroreRicettaType>();
        }
        return this.erroreRicetta;
    }

}
