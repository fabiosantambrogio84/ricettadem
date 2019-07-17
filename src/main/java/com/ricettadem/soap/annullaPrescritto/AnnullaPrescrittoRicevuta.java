//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.07.17 alle 07:47:24 PM CEST 
//


package com.ricettadem.soap.annullaPrescritto;

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
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType"/&gt;
 *         &lt;element name="codEsitoAnnullamento" type="{http://tipodati.xsd.dem.sanita.finanze.it}codEsitoType"/&gt;
 *         &lt;element name="ElencoErroriRicette" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoErroriRicetteType" minOccurs="0"/&gt;
 *         &lt;element name="ElencoComunicazioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoComunicazioniType" minOccurs="0"/&gt;
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
    "nre",
    "codEsitoAnnullamento",
    "elencoErroriRicette",
    "elencoComunicazioni"
})
@XmlRootElement(name = "AnnullaPrescrittoRicevuta", namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it")
public class AnnullaPrescrittoRicevuta {

    @XmlElement(namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it", required = true)
    protected String nre;
    @XmlElement(namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it", required = true)
    protected String codEsitoAnnullamento;
    @XmlElement(name = "ElencoErroriRicette", namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoErroriRicetteType elencoErroriRicette;
    @XmlElement(name = "ElencoComunicazioni", namespace = "http://annullaprescrittoricevuta.xsd.dem.sanita.finanze.it")
    protected ElencoComunicazioniType elencoComunicazioni;

    /**
     * Recupera il valore della proprietà nre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNre() {
        return nre;
    }

    /**
     * Imposta il valore della proprietà nre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNre(String value) {
        this.nre = value;
    }

    /**
     * Recupera il valore della proprietà codEsitoAnnullamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsitoAnnullamento() {
        return codEsitoAnnullamento;
    }

    /**
     * Imposta il valore della proprietà codEsitoAnnullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsitoAnnullamento(String value) {
        this.codEsitoAnnullamento = value;
    }

    /**
     * Recupera il valore della proprietà elencoErroriRicette.
     * 
     * @return
     *     possible object is
     *     {@link ElencoErroriRicetteType }
     *     
     */
    public ElencoErroriRicetteType getElencoErroriRicette() {
        return elencoErroriRicette;
    }

    /**
     * Imposta il valore della proprietà elencoErroriRicette.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoErroriRicetteType }
     *     
     */
    public void setElencoErroriRicette(ElencoErroriRicetteType value) {
        this.elencoErroriRicette = value;
    }

    /**
     * Recupera il valore della proprietà elencoComunicazioni.
     * 
     * @return
     *     possible object is
     *     {@link ElencoComunicazioniType }
     *     
     */
    public ElencoComunicazioniType getElencoComunicazioni() {
        return elencoComunicazioni;
    }

    /**
     * Imposta il valore della proprietà elencoComunicazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoComunicazioniType }
     *     
     */
    public void setElencoComunicazioni(ElencoComunicazioniType value) {
        this.elencoComunicazioni = value;
    }

}
