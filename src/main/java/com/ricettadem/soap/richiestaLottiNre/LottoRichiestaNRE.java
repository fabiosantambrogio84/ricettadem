//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.06.07 alle 05:47:34 PM CEST 
//


package com.ricettadem.soap.richiestaLottiNre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LottoRichiestaNRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LottoRichiestaNRE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodRegione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentificativoLotto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CFMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LottoRichiestaNRE", namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it", propOrder = {
    "codRegione",
    "identificativoLotto",
    "cfMedico"
})
public class LottoRichiestaNRE {

    @XmlElement(name = "CodRegione", required = true)
    protected String codRegione;
    @XmlElement(name = "IdentificativoLotto", required = true)
    protected String identificativoLotto;
    @XmlElement(name = "CFMedico")
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
