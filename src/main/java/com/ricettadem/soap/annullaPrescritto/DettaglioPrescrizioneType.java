//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.05.07 alle 10:45:02 AM CEST 
//


package com.ricettadem.soap.annullaPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dettaglioPrescrizioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà codProdPrest.
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
     * Imposta il valore della proprietà codProdPrest.
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
     * Recupera il valore della proprietà descrProdPrest.
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
     * Imposta il valore della proprietà descrProdPrest.
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
     * Recupera il valore della proprietà codGruppoEquival.
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
     * Imposta il valore della proprietà codGruppoEquival.
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
     * Recupera il valore della proprietà descrGruppoEquival.
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
     * Imposta il valore della proprietà descrGruppoEquival.
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
     * Recupera il valore della proprietà testoLibero.
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
     * Imposta il valore della proprietà testoLibero.
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
     * Recupera il valore della proprietà descrTestoLiberoNote.
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
     * Imposta il valore della proprietà descrTestoLiberoNote.
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
     * Recupera il valore della proprietà nonSost.
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
     * Imposta il valore della proprietà nonSost.
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
     * Recupera il valore della proprietà motivazNote.
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
     * Imposta il valore della proprietà motivazNote.
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
     * Recupera il valore della proprietà codMotivazione.
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
     * Imposta il valore della proprietà codMotivazione.
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
     * Recupera il valore della proprietà notaProd.
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
     * Imposta il valore della proprietà notaProd.
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
     * Recupera il valore della proprietà quantita.
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
     * Imposta il valore della proprietà quantita.
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
     * Recupera il valore della proprietà prescrizione1.
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
     * Imposta il valore della proprietà prescrizione1.
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
     * Recupera il valore della proprietà prescrizione2.
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
     * Imposta il valore della proprietà prescrizione2.
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
     * Recupera il valore della proprietà codCatalogoPrescr.
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
     * Imposta il valore della proprietà codCatalogoPrescr.
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
     * Recupera il valore della proprietà tipoAccesso.
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
     * Imposta il valore della proprietà tipoAccesso.
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
     * Recupera il valore della proprietà numeroNota.
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
     * Imposta il valore della proprietà numeroNota.
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
     * Recupera il valore della proprietà condErogabilita.
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
     * Imposta il valore della proprietà condErogabilita.
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
     * Recupera il valore della proprietà approprPrescrittiva.
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
     * Imposta il valore della proprietà approprPrescrittiva.
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
     * Recupera il valore della proprietà patologia.
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
     * Imposta il valore della proprietà patologia.
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
