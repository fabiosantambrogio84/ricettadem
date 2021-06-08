//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.08 alle 02:27:53 PM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://cert.sanita.finanze.it/}ricevuta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ricevutaOkRettificaMalattia" type="{http://cert.sanita.finanze.it/}ricevutaOkRettificaMalattia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ricevutaOkRettificaMalattia"
})
@XmlRootElement(name = "rettificaMalattiaResponse")
public class RettificaMalattiaResponse
    extends Ricevuta
{

    protected RicevutaOkRettificaMalattia ricevutaOkRettificaMalattia;

    /**
     * Recupera il valore della proprietà ricevutaOkRettificaMalattia.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaOkRettificaMalattia }
     *     
     */
    public RicevutaOkRettificaMalattia getRicevutaOkRettificaMalattia() {
        return ricevutaOkRettificaMalattia;
    }

    /**
     * Imposta il valore della proprietà ricevutaOkRettificaMalattia.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaOkRettificaMalattia }
     *     
     */
    public void setRicevutaOkRettificaMalattia(RicevutaOkRettificaMalattia value) {
        this.ricevutaOkRettificaMalattia = value;
    }

}
