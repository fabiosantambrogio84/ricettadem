//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.08 alle 02:27:53 PM CEST 
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
 *         &lt;element name="CodRegione" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}CodRegioneType"/&gt;
 *         &lt;element name="IdentificativoLotto" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}integer1"/&gt;
 *         &lt;element name="CFMedico" type="{http://tipodati.xsd.nre.mirsac.sanita.finanze.it}CFMedicoType" minOccurs="0"/&gt;
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
    "identificativoLotto",
    "cfMedico"
})
@XmlRootElement(name = "LottoRichiestaNRE", namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it")
public class LottoRichiestaNRE {

    @XmlElement(name = "CodRegione", namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it", required = true)
    protected String codRegione;
    @XmlElement(name = "IdentificativoLotto", namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it", required = true)
    protected String identificativoLotto;
    @XmlElement(name = "CFMedico", namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it")
    protected String cfMedico;

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

}
