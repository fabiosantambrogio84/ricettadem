//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.11 at 12:17:27 PM CEST 
//


package com.ricettadem.soap.invioPrescritto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pinCode" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType"/&gt;
 *         &lt;element name="cfMedico1" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType"/&gt;
 *         &lt;element name="cfMedico2" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType" minOccurs="0"/&gt;
 *         &lt;element name="codRegione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codRegioneType"/&gt;
 *         &lt;element name="codASLAo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType"/&gt;
 *         &lt;element name="codStruttura" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codSpecializzazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codSpecializzazioneType"/&gt;
 *         &lt;element name="testata1" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="testata2" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType" minOccurs="0"/&gt;
 *         &lt;element name="tipoRic" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoRicettaType" minOccurs="0"/&gt;
 *         &lt;element name="codiceAss" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="cognNome" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="indirizzo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="oscuramDati" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="numTessSasn" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="socNavigaz" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoPrescrizione" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoPrescType"/&gt;
 *         &lt;element name="ricettaInterna" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codEsenzione" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="nonEsente" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="reddito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codDiagnosi" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneDiagnosi" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="dataCompilazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType"/&gt;
 *         &lt;element name="tipoVisita" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoVisitaType"/&gt;
 *         &lt;element name="dispReg" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="provAssistito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="aslAssistito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="indicazionePrescr" type="{http://tipodati.xsd.dem.sanita.finanze.it}indicPrescType" minOccurs="0"/&gt;
 *         &lt;element name="altro" type="{http://tipodati.xsd.dem.sanita.finanze.it}indicPrescType" minOccurs="0"/&gt;
 *         &lt;element name="classePriorita" type="{http://tipodati.xsd.dem.sanita.finanze.it}prioritaType" minOccurs="0"/&gt;
 *         &lt;element name="statoEstero" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="istituzCompetente" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="numIdentPers" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="numIdentTess" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="dataNascitaEstero" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/&gt;
 *         &lt;element name="dataScadTessera" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/&gt;
 *         &lt;element name="ElencoDettagliPrescrizioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoDettagliPrescrizioniType"/&gt;
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
    "pinCode",
    "cfMedico1",
    "cfMedico2",
    "codRegione",
    "codASLAo",
    "codStruttura",
    "codSpecializzazione",
    "testata1",
    "testata2",
    "nre",
    "tipoRic",
    "codiceAss",
    "cognNome",
    "indirizzo",
    "oscuramDati",
    "numTessSasn",
    "socNavigaz",
    "tipoPrescrizione",
    "ricettaInterna",
    "codEsenzione",
    "nonEsente",
    "reddito",
    "codDiagnosi",
    "descrizioneDiagnosi",
    "dataCompilazione",
    "tipoVisita",
    "dispReg",
    "provAssistito",
    "aslAssistito",
    "indicazionePrescr",
    "altro",
    "classePriorita",
    "statoEstero",
    "istituzCompetente",
    "numIdentPers",
    "numIdentTess",
    "dataNascitaEstero",
    "dataScadTessera",
    "elencoDettagliPrescrizioni"
})
@XmlRootElement(name = "InvioPrescrittoRichiesta", namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
public class InvioPrescrittoRichiesta {

    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String pinCode;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String cfMedico1;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String cfMedico2;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String codRegione;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String codASLAo;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String codStruttura;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String codSpecializzazione;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String testata1;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String testata2;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String nre;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String tipoRic;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String codiceAss;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String cognNome;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String indirizzo;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String oscuramDati;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String numTessSasn;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String socNavigaz;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String tipoPrescrizione;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String ricettaInterna;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String codEsenzione;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String nonEsente;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String reddito;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String codDiagnosi;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String descrizioneDiagnosi;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String dataCompilazione;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected String tipoVisita;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String dispReg;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String provAssistito;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String aslAssistito;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String indicazionePrescr;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String altro;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String classePriorita;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String statoEstero;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String istituzCompetente;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String numIdentPers;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String numIdentTess;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String dataNascitaEstero;
    @XmlElement(namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it")
    protected String dataScadTessera;
    @XmlElement(name = "ElencoDettagliPrescrizioni", namespace = "http://invioprescrittorichiesta.xsd.dem.sanita.finanze.it", required = true)
    protected ElencoDettagliPrescrizioniType elencoDettagliPrescrizioni;

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the cfMedico1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfMedico1() {
        return cfMedico1;
    }

    /**
     * Sets the value of the cfMedico1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfMedico1(String value) {
        this.cfMedico1 = value;
    }

    /**
     * Gets the value of the cfMedico2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfMedico2() {
        return cfMedico2;
    }

    /**
     * Sets the value of the cfMedico2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfMedico2(String value) {
        this.cfMedico2 = value;
    }

    /**
     * Gets the value of the codRegione property.
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
     * Sets the value of the codRegione property.
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
     * Gets the value of the codASLAo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodASLAo() {
        return codASLAo;
    }

    /**
     * Sets the value of the codASLAo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodASLAo(String value) {
        this.codASLAo = value;
    }

    /**
     * Gets the value of the codStruttura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStruttura() {
        return codStruttura;
    }

    /**
     * Sets the value of the codStruttura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStruttura(String value) {
        this.codStruttura = value;
    }

    /**
     * Gets the value of the codSpecializzazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSpecializzazione() {
        return codSpecializzazione;
    }

    /**
     * Sets the value of the codSpecializzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSpecializzazione(String value) {
        this.codSpecializzazione = value;
    }

    /**
     * Gets the value of the testata1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestata1() {
        return testata1;
    }

    /**
     * Sets the value of the testata1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestata1(String value) {
        this.testata1 = value;
    }

    /**
     * Gets the value of the testata2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestata2() {
        return testata2;
    }

    /**
     * Sets the value of the testata2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestata2(String value) {
        this.testata2 = value;
    }

    /**
     * Gets the value of the nre property.
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
     * Sets the value of the nre property.
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
     * Gets the value of the tipoRic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRic() {
        return tipoRic;
    }

    /**
     * Sets the value of the tipoRic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRic(String value) {
        this.tipoRic = value;
    }

    /**
     * Gets the value of the codiceAss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAss() {
        return codiceAss;
    }

    /**
     * Sets the value of the codiceAss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAss(String value) {
        this.codiceAss = value;
    }

    /**
     * Gets the value of the cognNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognNome() {
        return cognNome;
    }

    /**
     * Sets the value of the cognNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognNome(String value) {
        this.cognNome = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the oscuramDati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscuramDati() {
        return oscuramDati;
    }

    /**
     * Sets the value of the oscuramDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscuramDati(String value) {
        this.oscuramDati = value;
    }

    /**
     * Gets the value of the numTessSasn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTessSasn() {
        return numTessSasn;
    }

    /**
     * Sets the value of the numTessSasn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTessSasn(String value) {
        this.numTessSasn = value;
    }

    /**
     * Gets the value of the socNavigaz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocNavigaz() {
        return socNavigaz;
    }

    /**
     * Sets the value of the socNavigaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocNavigaz(String value) {
        this.socNavigaz = value;
    }

    /**
     * Gets the value of the tipoPrescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    /**
     * Sets the value of the tipoPrescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrescrizione(String value) {
        this.tipoPrescrizione = value;
    }

    /**
     * Gets the value of the ricettaInterna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRicettaInterna() {
        return ricettaInterna;
    }

    /**
     * Sets the value of the ricettaInterna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRicettaInterna(String value) {
        this.ricettaInterna = value;
    }

    /**
     * Gets the value of the codEsenzione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsenzione() {
        return codEsenzione;
    }

    /**
     * Sets the value of the codEsenzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsenzione(String value) {
        this.codEsenzione = value;
    }

    /**
     * Gets the value of the nonEsente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEsente() {
        return nonEsente;
    }

    /**
     * Sets the value of the nonEsente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEsente(String value) {
        this.nonEsente = value;
    }

    /**
     * Gets the value of the reddito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReddito() {
        return reddito;
    }

    /**
     * Sets the value of the reddito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReddito(String value) {
        this.reddito = value;
    }

    /**
     * Gets the value of the codDiagnosi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDiagnosi() {
        return codDiagnosi;
    }

    /**
     * Sets the value of the codDiagnosi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDiagnosi(String value) {
        this.codDiagnosi = value;
    }

    /**
     * Gets the value of the descrizioneDiagnosi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneDiagnosi() {
        return descrizioneDiagnosi;
    }

    /**
     * Sets the value of the descrizioneDiagnosi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneDiagnosi(String value) {
        this.descrizioneDiagnosi = value;
    }

    /**
     * Gets the value of the dataCompilazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCompilazione() {
        return dataCompilazione;
    }

    /**
     * Sets the value of the dataCompilazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCompilazione(String value) {
        this.dataCompilazione = value;
    }

    /**
     * Gets the value of the tipoVisita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVisita() {
        return tipoVisita;
    }

    /**
     * Sets the value of the tipoVisita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVisita(String value) {
        this.tipoVisita = value;
    }

    /**
     * Gets the value of the dispReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispReg() {
        return dispReg;
    }

    /**
     * Sets the value of the dispReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispReg(String value) {
        this.dispReg = value;
    }

    /**
     * Gets the value of the provAssistito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvAssistito() {
        return provAssistito;
    }

    /**
     * Sets the value of the provAssistito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvAssistito(String value) {
        this.provAssistito = value;
    }

    /**
     * Gets the value of the aslAssistito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAslAssistito() {
        return aslAssistito;
    }

    /**
     * Sets the value of the aslAssistito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAslAssistito(String value) {
        this.aslAssistito = value;
    }

    /**
     * Gets the value of the indicazionePrescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicazionePrescr() {
        return indicazionePrescr;
    }

    /**
     * Sets the value of the indicazionePrescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicazionePrescr(String value) {
        this.indicazionePrescr = value;
    }

    /**
     * Gets the value of the altro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltro() {
        return altro;
    }

    /**
     * Sets the value of the altro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltro(String value) {
        this.altro = value;
    }

    /**
     * Gets the value of the classePriorita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassePriorita() {
        return classePriorita;
    }

    /**
     * Sets the value of the classePriorita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassePriorita(String value) {
        this.classePriorita = value;
    }

    /**
     * Gets the value of the statoEstero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoEstero() {
        return statoEstero;
    }

    /**
     * Sets the value of the statoEstero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoEstero(String value) {
        this.statoEstero = value;
    }

    /**
     * Gets the value of the istituzCompetente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstituzCompetente() {
        return istituzCompetente;
    }

    /**
     * Sets the value of the istituzCompetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstituzCompetente(String value) {
        this.istituzCompetente = value;
    }

    /**
     * Gets the value of the numIdentPers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentPers() {
        return numIdentPers;
    }

    /**
     * Sets the value of the numIdentPers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentPers(String value) {
        this.numIdentPers = value;
    }

    /**
     * Gets the value of the numIdentTess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentTess() {
        return numIdentTess;
    }

    /**
     * Sets the value of the numIdentTess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentTess(String value) {
        this.numIdentTess = value;
    }

    /**
     * Gets the value of the dataNascitaEstero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascitaEstero() {
        return dataNascitaEstero;
    }

    /**
     * Sets the value of the dataNascitaEstero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascitaEstero(String value) {
        this.dataNascitaEstero = value;
    }

    /**
     * Gets the value of the dataScadTessera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScadTessera() {
        return dataScadTessera;
    }

    /**
     * Sets the value of the dataScadTessera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScadTessera(String value) {
        this.dataScadTessera = value;
    }

    /**
     * Gets the value of the elencoDettagliPrescrizioni property.
     * 
     * @return
     *     possible object is
     *     {@link ElencoDettagliPrescrizioniType }
     *     
     */
    public ElencoDettagliPrescrizioniType getElencoDettagliPrescrizioni() {
        return elencoDettagliPrescrizioni;
    }

    /**
     * Sets the value of the elencoDettagliPrescrizioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoDettagliPrescrizioniType }
     *     
     */
    public void setElencoDettagliPrescrizioni(ElencoDettagliPrescrizioniType value) {
        this.elencoDettagliPrescrizioni = value;
    }

}
