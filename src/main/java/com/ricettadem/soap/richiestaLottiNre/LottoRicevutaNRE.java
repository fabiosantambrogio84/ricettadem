//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.05.07 alle 10:45:02 AM CEST 
//


package com.ricettadem.soap.richiestaLottiNre;

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
 *         &lt;element name="CodRegione" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}CodRegioneType" minOccurs="0"/&gt;
 *         &lt;element name="CodRagLotto" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}CodRagLottoType" minOccurs="0"/&gt;
 *         &lt;element name="IdentificativoLotto" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}integer1" minOccurs="0"/&gt;
 *         &lt;element name="CodLotto" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}CodLottoType" minOccurs="0"/&gt;
 *         &lt;element name="CFMedico" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}CFMedicoType" minOccurs="0"/&gt;
 *         &lt;element name="CodEsito" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}integer2" minOccurs="0"/&gt;
 *         &lt;element name="Esito" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}stringType" minOccurs="0"/&gt;
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
    "codRegione",
    "codRagLotto",
    "identificativoLotto",
    "codLotto",
    "cfMedico",
    "codEsito",
    "esito"
})
@XmlRootElement(name = "LottoRicevutaNRE")
public class LottoRicevutaNRE {

    @XmlElement(name = "CodRegione")
    protected String codRegione;
    @XmlElement(name = "CodRagLotto")
    protected String codRagLotto;
    @XmlElement(name = "IdentificativoLotto")
    protected String identificativoLotto;
    @XmlElement(name = "CodLotto")
    protected String codLotto;
    @XmlElement(name = "CFMedico")
    protected String cfMedico;
    @XmlElement(name = "CodEsito")
    protected String codEsito;
    @XmlElement(name = "Esito")
    protected String esito;

    /**
     * Recupera il valore della proprietà codRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegione() {
        return codRegione;
    }

    /**
     * Imposta il valore della proprietà codRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegione(String value) {
        this.codRegione = value;
    }

    /**
     * Recupera il valore della proprietà codRagLotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRagLotto() {
        return codRagLotto;
    }

    /**
     * Imposta il valore della proprietà codRagLotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRagLotto(String value) {
        this.codRagLotto = value;
    }

    /**
     * Recupera il valore della proprietà identificativoLotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoLotto() {
        return identificativoLotto;
    }

    /**
     * Imposta il valore della proprietà identificativoLotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoLotto(String value) {
        this.identificativoLotto = value;
    }

    /**
     * Recupera il valore della proprietà codLotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLotto() {
        return codLotto;
    }

    /**
     * Imposta il valore della proprietà codLotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLotto(String value) {
        this.codLotto = value;
    }

    /**
     * Recupera il valore della proprietà cfMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFMedico() {
        return cfMedico;
    }

    /**
     * Imposta il valore della proprietà cfMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFMedico(String value) {
        this.cfMedico = value;
    }

    /**
     * Recupera il valore della proprietà codEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsito() {
        return codEsito;
    }

    /**
     * Imposta il valore della proprietà codEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsito(String value) {
        this.codEsito = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

}
