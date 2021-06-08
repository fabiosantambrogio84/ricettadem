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
 *         &lt;element name="ricevutaOkAnnullamentoRicovero" type="{http://cert.sanita.finanze.it/}ricevutaOkAnnullamento" minOccurs="0"/&gt;
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
    "ricevutaOkAnnullamentoRicovero"
})
@XmlRootElement(name = "annullamentoRicoveroResponse")
public class AnnullamentoRicoveroResponse
    extends Ricevuta
{

    protected RicevutaOkAnnullamento ricevutaOkAnnullamentoRicovero;

    /**
     * Recupera il valore della proprietà ricevutaOkAnnullamentoRicovero.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaOkAnnullamento }
     *     
     */
    public RicevutaOkAnnullamento getRicevutaOkAnnullamentoRicovero() {
        return ricevutaOkAnnullamentoRicovero;
    }

    /**
     * Imposta il valore della proprietà ricevutaOkAnnullamentoRicovero.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaOkAnnullamento }
     *     
     */
    public void setRicevutaOkAnnullamentoRicovero(RicevutaOkAnnullamento value) {
        this.ricevutaOkAnnullamentoRicovero = value;
    }

}
