//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.02.01 alle 11:04:51 AM CET 
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
 *         &lt;element name="ricevutaOkInvioRicovero" type="{http://cert.sanita.finanze.it/}ricevutaOkInvioRicovero" minOccurs="0"/&gt;
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
    "ricevutaOkInvioRicovero"
})
@XmlRootElement(name = "invioRicoveroResponse")
public class InvioRicoveroResponse
    extends Ricevuta
{

    protected RicevutaOkInvioRicovero ricevutaOkInvioRicovero;

    /**
     * Recupera il valore della proprietà ricevutaOkInvioRicovero.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaOkInvioRicovero }
     *     
     */
    public RicevutaOkInvioRicovero getRicevutaOkInvioRicovero() {
        return ricevutaOkInvioRicovero;
    }

    /**
     * Imposta il valore della proprietà ricevutaOkInvioRicovero.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaOkInvioRicovero }
     *     
     */
    public void setRicevutaOkInvioRicovero(RicevutaOkInvioRicovero value) {
        this.ricevutaOkInvioRicovero = value;
    }

}
