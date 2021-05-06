//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.05.07 alle 10:45:03 AM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatore" type="{http://cert.sanita.finanze.it/}redattore" minOccurs="0"/&gt;
 *         &lt;element name="lavoratore" type="{http://cert.sanita.finanze.it/}lavoratore"/&gt;
 *         &lt;element name="idCertificato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "idCertificato"
})
@XmlRootElement(name = "annullamentoRicoveroRequest")
public class AnnullamentoRicoveroRequest {

    protected Redattore operatore;
    @XmlElement(required = true)
    protected Lavoratore lavoratore;
    @XmlElement(required = true)
    protected String idCertificato;

    /**
     * Recupera il valore della proprietà operatore.
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
     * Imposta il valore della proprietà operatore.
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
     * Recupera il valore della proprietà lavoratore.
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
     * Imposta il valore della proprietà lavoratore.
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
     * Recupera il valore della proprietà idCertificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCertificato() {
        return idCertificato;
    }

    /**
     * Imposta il valore della proprietà idCertificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCertificato(String value) {
        this.idCertificato = value;
    }

}
