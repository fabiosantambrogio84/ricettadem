//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.05 at 12:08:53 PM CEST 
//


package com.ricettadem.soap.annullaPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dettaglioPrescrizioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dettaglioPrescrizioneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codProdPrest" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="descrProdPrest" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codGruppoEquival" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="descrGruppoEquival" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="testoLibero" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="descrTestoLiberoNote" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="nonSost" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="motivazNote" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codMotivazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="notaProd" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="quantita" type="{http://tipodati.xsd.dem.sanita.finanze.it}integerType"/&gt;
 *         &lt;element name="prescrizione1" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="prescrizione2" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codCatalogoPrescr" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoAccesso" type="{http://tipodati.xsd.dem.sanita.finanze.it}string1Type" minOccurs="0"/&gt;
 *         &lt;element name="numeroNota" type="{http://tipodati.xsd.dem.sanita.finanze.it}maxString10" minOccurs="0"/&gt;
 *         &lt;element name="condErogabilita" type="{http://tipodati.xsd.dem.sanita.finanze.it}maxString10" minOccurs="0"/&gt;
 *         &lt;element name="approprPrescrittiva" type="{http://tipodati.xsd.dem.sanita.finanze.it}maxString10" minOccurs="0"/&gt;
 *         &lt;element name="patologia" type="{http://tipodati.xsd.dem.sanita.finanze.it}maxString10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioPrescrizioneType", propOrder = {
    "codProdPrest",
    "descrProdPrest",
    "codGruppoEquival",
    "descrGruppoEquival",
    "testoLibero",
    "descrTestoLiberoNote",
    "nonSost",
    "motivazNote",
    "codMotivazione",
    "notaProd",
    "quantita",
    "prescrizione1",
    "prescrizione2",
    "codCatalogoPrescr",
    "tipoAccesso",
    "numeroNota",
    "condErogabilita",
    "approprPrescrittiva",
    "patologia"
})
public class DettaglioPrescrizioneType {

    protected String codProdPrest;
    protected String descrProdPrest;
    protected String codGruppoEquival;
    protected String descrGruppoEquival;
    protected String testoLibero;
    protected String descrTestoLiberoNote;
    protected String nonSost;
    protected String motivazNote;
    protected String codMotivazione;
    protected String notaProd;
    @XmlElement(required = true)
    protected String quantita;
    protected String prescrizione1;
    protected String prescrizione2;
    protected String codCatalogoPrescr;
    protected String tipoAccesso;
    protected String numeroNota;
    protected String condErogabilita;
    protected String approprPrescrittiva;
    protected String patologia;

    /**
     * Gets the value of the codProdPrest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProdPrest() {
        return codProdPrest;
    }

    /**
     * Sets the value of the codProdPrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProdPrest(String value) {
        this.codProdPrest = value;
    }

    /**
     * Gets the value of the descrProdPrest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrProdPrest() {
        return descrProdPrest;
    }

    /**
     * Sets the value of the descrProdPrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrProdPrest(String value) {
        this.descrProdPrest = value;
    }

    /**
     * Gets the value of the codGruppoEquival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGruppoEquival() {
        return codGruppoEquival;
    }

    /**
     * Sets the value of the codGruppoEquival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGruppoEquival(String value) {
        this.codGruppoEquival = value;
    }

    /**
     * Gets the value of the descrGruppoEquival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrGruppoEquival() {
        return descrGruppoEquival;
    }

    /**
     * Sets the value of the descrGruppoEquival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrGruppoEquival(String value) {
        this.descrGruppoEquival = value;
    }

    /**
     * Gets the value of the testoLibero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestoLibero() {
        return testoLibero;
    }

    /**
     * Sets the value of the testoLibero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestoLibero(String value) {
        this.testoLibero = value;
    }

    /**
     * Gets the value of the descrTestoLiberoNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrTestoLiberoNote() {
        return descrTestoLiberoNote;
    }

    /**
     * Sets the value of the descrTestoLiberoNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrTestoLiberoNote(String value) {
        this.descrTestoLiberoNote = value;
    }

    /**
     * Gets the value of the nonSost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonSost() {
        return nonSost;
    }

    /**
     * Sets the value of the nonSost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonSost(String value) {
        this.nonSost = value;
    }

    /**
     * Gets the value of the motivazNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivazNote() {
        return motivazNote;
    }

    /**
     * Sets the value of the motivazNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivazNote(String value) {
        this.motivazNote = value;
    }

    /**
     * Gets the value of the codMotivazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMotivazione() {
        return codMotivazione;
    }

    /**
     * Sets the value of the codMotivazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMotivazione(String value) {
        this.codMotivazione = value;
    }

    /**
     * Gets the value of the notaProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaProd() {
        return notaProd;
    }

    /**
     * Sets the value of the notaProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaProd(String value) {
        this.notaProd = value;
    }

    /**
     * Gets the value of the quantita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantita() {
        return quantita;
    }

    /**
     * Sets the value of the quantita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantita(String value) {
        this.quantita = value;
    }

    /**
     * Gets the value of the prescrizione1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescrizione1() {
        return prescrizione1;
    }

    /**
     * Sets the value of the prescrizione1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescrizione1(String value) {
        this.prescrizione1 = value;
    }

    /**
     * Gets the value of the prescrizione2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescrizione2() {
        return prescrizione2;
    }

    /**
     * Sets the value of the prescrizione2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescrizione2(String value) {
        this.prescrizione2 = value;
    }

    /**
     * Gets the value of the codCatalogoPrescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCatalogoPrescr() {
        return codCatalogoPrescr;
    }

    /**
     * Sets the value of the codCatalogoPrescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCatalogoPrescr(String value) {
        this.codCatalogoPrescr = value;
    }

    /**
     * Gets the value of the tipoAccesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAccesso() {
        return tipoAccesso;
    }

    /**
     * Sets the value of the tipoAccesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAccesso(String value) {
        this.tipoAccesso = value;
    }

    /**
     * Gets the value of the numeroNota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNota() {
        return numeroNota;
    }

    /**
     * Sets the value of the numeroNota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNota(String value) {
        this.numeroNota = value;
    }

    /**
     * Gets the value of the condErogabilita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondErogabilita() {
        return condErogabilita;
    }

    /**
     * Sets the value of the condErogabilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondErogabilita(String value) {
        this.condErogabilita = value;
    }

    /**
     * Gets the value of the approprPrescrittiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproprPrescrittiva() {
        return approprPrescrittiva;
    }

    /**
     * Sets the value of the approprPrescrittiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproprPrescrittiva(String value) {
        this.approprPrescrittiva = value;
    }

    /**
     * Gets the value of the patologia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatologia() {
        return patologia;
    }

    /**
     * Sets the value of the patologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatologia(String value) {
        this.patologia = value;
    }

}
