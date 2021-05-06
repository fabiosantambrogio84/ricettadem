//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.05.07 alle 10:45:02 AM CEST 
//


package com.ricettadem.soap.annullaPrescritto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoRicetteType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoRicetteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InfoRicetta" type="{http://tipodati.xsd.dem.sanita.finanze.it}infoRicettaType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoRicetteType", propOrder = {
    "infoRicetta"
})
public class ElencoRicetteType {

    @XmlElement(name = "InfoRicetta", required = true)
    protected List<InfoRicettaType> infoRicetta;

    /**
     * Gets the value of the infoRicetta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoRicetta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoRicetta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoRicettaType }
     * 
     * 
     */
    public List<InfoRicettaType> getInfoRicetta() {
        if (infoRicetta == null) {
            infoRicetta = new ArrayList<InfoRicettaType>();
        }
        return this.infoRicetta;
    }

}
