//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.10 alle 04:43:49 PM CEST 
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
 *         &lt;element name="ricevutaOkRistampaMalattia" type="{http://cert.sanita.finanze.it/}ricevutaOkRistampaMalattia" minOccurs="0"/&gt;
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
    "ricevutaOkRistampaMalattia"
})
@XmlRootElement(name = "ristampaMalattiaResponse")
public class RistampaMalattiaResponse
    extends Ricevuta
{

    protected RicevutaOkRistampaMalattia ricevutaOkRistampaMalattia;

    /**
     * Recupera il valore della proprietà ricevutaOkRistampaMalattia.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaOkRistampaMalattia }
     *     
     */
    public RicevutaOkRistampaMalattia getRicevutaOkRistampaMalattia() {
        return ricevutaOkRistampaMalattia;
    }

    /**
     * Imposta il valore della proprietà ricevutaOkRistampaMalattia.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaOkRistampaMalattia }
     *     
     */
    public void setRicevutaOkRistampaMalattia(RicevutaOkRistampaMalattia value) {
        this.ricevutaOkRistampaMalattia = value;
    }

}
