//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.10 alle 04:43:49 PM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ricevuta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricevuta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ricevutaVarie" type="{http://cert.sanita.finanze.it/}ricevutaVarie" minOccurs="0"/&gt;
 *         &lt;element name="ricevutaInfo" type="{http://cert.sanita.finanze.it/}ricevutaInfo" minOccurs="0"/&gt;
 *         &lt;element name="ricevutaNonOk" type="{http://cert.sanita.finanze.it/}ricevutaNonOk" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevuta", propOrder = {
    "ricevutaVarie",
    "ricevutaInfo",
    "ricevutaNonOk"
})
@XmlSeeAlso({
    InterrogazioneLavoratoreResponse.class,
    RettificaDimissioneResponse.class,
    InvioDimissioneResponse.class,
    AnnullamentoRicoveroResponse.class,
    InvioRicoveroResponse.class,
    RistampaMalattiaResponse.class,
    RicercaMalattiaResponse.class,
    AnnullamentoMalattiaResponse.class,
    RettificaMalattiaResponse.class,
    InvioMalattiaResponse.class
})
public abstract class Ricevuta {

    protected RicevutaVarie ricevutaVarie;
    protected RicevutaInfo ricevutaInfo;
    protected RicevutaNonOk ricevutaNonOk;

    /**
     * Recupera il valore della proprietà ricevutaVarie.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaVarie }
     *     
     */
    public RicevutaVarie getRicevutaVarie() {
        return ricevutaVarie;
    }

    /**
     * Imposta il valore della proprietà ricevutaVarie.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaVarie }
     *     
     */
    public void setRicevutaVarie(RicevutaVarie value) {
        this.ricevutaVarie = value;
    }

    /**
     * Recupera il valore della proprietà ricevutaInfo.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaInfo }
     *     
     */
    public RicevutaInfo getRicevutaInfo() {
        return ricevutaInfo;
    }

    /**
     * Imposta il valore della proprietà ricevutaInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaInfo }
     *     
     */
    public void setRicevutaInfo(RicevutaInfo value) {
        this.ricevutaInfo = value;
    }

    /**
     * Recupera il valore della proprietà ricevutaNonOk.
     * 
     * @return
     *     possible object is
     *     {@link RicevutaNonOk }
     *     
     */
    public RicevutaNonOk getRicevutaNonOk() {
        return ricevutaNonOk;
    }

    /**
     * Imposta il valore della proprietà ricevutaNonOk.
     * 
     * @param value
     *     allowed object is
     *     {@link RicevutaNonOk }
     *     
     */
    public void setRicevutaNonOk(RicevutaNonOk value) {
        this.ricevutaNonOk = value;
    }

}
