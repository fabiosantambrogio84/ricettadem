//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.02.01 alle 11:04:51 AM CET 
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
 *         &lt;element name="medico" type="{http://cert.sanita.finanze.it/}redattore"/&gt;
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
    "medico",
    "lavoratore",
    "idCertificato"
})
@XmlRootElement(name = "annullamentoMalattiaRequest")
public class AnnullamentoMalattiaRequest {

    @XmlElement(required = true)
    protected Redattore medico;
    @XmlElement(required = true)
    protected Lavoratore lavoratore;
    @XmlElement(required = true)
    protected String idCertificato;

    /**
     * Recupera il valore della proprietà medico.
     * 
     * @return
     *     possible object is
     *     {@link Redattore }
     *     
     */
    public Redattore getMedico() {
        return medico;
    }

    /**
     * Imposta il valore della proprietà medico.
     * 
     * @param value
     *     allowed object is
     *     {@link Redattore }
     *     
     */
    public void setMedico(Redattore value) {
        this.medico = value;
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
