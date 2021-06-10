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
 *         &lt;element name="ricevutaOkAnnullamentoMalattia" type="{http://cert.sanita.finanze.it/}ricevutaOkAnnullamento" minOccurs="0"/&gt;
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
    "ricevutaOkAnnullamentoMalattia"
})
@XmlRootElement(name = "annullamentoMalattiaResponse")
public class AnnullamentoMalattiaResponse
    extends Ricevuta
{

    protected RicevutaOkAnnullamento ricevutaOkAnnullamentoMalattia;

    /**
     * Recupera il valore della proprietà ricevutaOkAnnullamentoMalattia.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaOkAnnullamento }
     *     
     */
    public RicevutaOkAnnullamento getRicevutaOkAnnullamentoMalattia() {
        return ricevutaOkAnnullamentoMalattia;
    }

    /**
     * Imposta il valore della proprietà ricevutaOkAnnullamentoMalattia.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaOkAnnullamento }
     *     
     */
    public void setRicevutaOkAnnullamentoMalattia(RicevutaOkAnnullamento value) {
        this.ricevutaOkAnnullamentoMalattia = value;
    }

}
