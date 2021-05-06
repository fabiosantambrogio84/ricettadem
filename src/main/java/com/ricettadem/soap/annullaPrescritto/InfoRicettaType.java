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
 * <p>Classe Java per infoRicettaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="infoRicettaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nre" type="{http://tipodati.xsd.dem.sanita.finanze.it}nreType" minOccurs="0"/&gt;
 *         &lt;element name="cfMedico1" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType" minOccurs="0"/&gt;
 *         &lt;element name="cfMedico2" type="{http://tipodati.xsd.dem.sanita.finanze.it}cfMedicoType" minOccurs="0"/&gt;
 *         &lt;element name="codRegione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codRegioneType" minOccurs="0"/&gt;
 *         &lt;element name="codASLAo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codStruttura" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codSpecializzazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}codSpecializzazioneType" minOccurs="0"/&gt;
 *         &lt;element name="testata1" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="testata2" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoRic" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoRicettaType" minOccurs="0"/&gt;
 *         &lt;element name="codiceAss" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="cognNome" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="indirizzo" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="numTessSasn" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="socNavigaz" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="tipoPrescrizione" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoPrescType" minOccurs="0"/&gt;
 *         &lt;element name="ricettaInterna" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codEsenzione" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="nonEsente" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="reddito" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="codDiagnosi" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="descrizioneDiagnosi" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="dataCompilazione" type="{http://tipodati.xsd.dem.sanita.finanze.it}dataOraType" minOccurs="0"/&gt;
 *         &lt;element name="tipoVisita" type="{http://tipodati.xsd.dem.sanita.finanze.it}tipoVisitaType" minOccurs="0"/&gt;
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
 *         &lt;element name="statoProcesso" type="{http://tipodati.xsd.dem.sanita.finanze.it}stringType" minOccurs="0"/&gt;
 *         &lt;element name="ElencoDettagliPrescrizioni" type="{http://tipodati.xsd.dem.sanita.finanze.it}elencoDettagliPrescrizioniType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoRicettaType", propOrder = {
    "nre",
    "cfMedico1",
    "cfMedico2",
    "codRegione",
    "codASLAo",
    "codStruttura",
    "codSpecializzazione",
    "testata1",
    "testata2",
    "tipoRic",
    "codiceAss",
    "cognNome",
    "indirizzo",
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
    "statoProcesso",
    "elencoDettagliPrescrizioni"
})
public class InfoRicettaType {

    protected String nre;
    protected String cfMedico1;
    protected String cfMedico2;
    protected String codRegione;
    protected String codASLAo;
    protected String codStruttura;
    protected String codSpecializzazione;
    protected String testata1;
    protected String testata2;
    protected String tipoRic;
    protected String codiceAss;
    protected String cognNome;
    protected String indirizzo;
    protected String numTessSasn;
    protected String socNavigaz;
    protected String tipoPrescrizione;
    protected String ricettaInterna;
    protected String codEsenzione;
    protected String nonEsente;
    protected String reddito;
    protected String codDiagnosi;
    protected String descrizioneDiagnosi;
    protected String dataCompilazione;
    protected String tipoVisita;
    protected String dispReg;
    protected String provAssistito;
    protected String aslAssistito;
    protected String indicazionePrescr;
    protected String altro;
    protected String classePriorita;
    protected String statoEstero;
    protected String istituzCompetente;
    protected String numIdentPers;
    protected String numIdentTess;
    protected String dataNascitaEstero;
    protected String dataScadTessera;
    protected String statoProcesso;
    @XmlElement(name = "ElencoDettagliPrescrizioni")
    protected ElencoDettagliPrescrizioniType elencoDettagliPrescrizioni;

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
     * Recupera il valore della proprietà cfMedico1.
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
     * Imposta il valore della proprietà cfMedico1.
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
     * Recupera il valore della proprietà cfMedico2.
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
     * Imposta il valore della proprietà cfMedico2.
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
     * Recupera il valore della proprietà codASLAo.
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
     * Imposta il valore della proprietà codASLAo.
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
     * Recupera il valore della proprietà codStruttura.
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
     * Imposta il valore della proprietà codStruttura.
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
     * Recupera il valore della proprietà codSpecializzazione.
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
     * Imposta il valore della proprietà codSpecializzazione.
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
     * Recupera il valore della proprietà testata1.
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
     * Imposta il valore della proprietà testata1.
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
     * Recupera il valore della proprietà testata2.
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
     * Imposta il valore della proprietà testata2.
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
     * Recupera il valore della proprietà tipoRic.
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
     * Imposta il valore della proprietà tipoRic.
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
     * Recupera il valore della proprietà codiceAss.
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
     * Imposta il valore della proprietà codiceAss.
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
     * Recupera il valore della proprietà cognNome.
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
     * Imposta il valore della proprietà cognNome.
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
     * Recupera il valore della proprietà indirizzo.
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
     * Imposta il valore della proprietà indirizzo.
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
     * Recupera il valore della proprietà numTessSasn.
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
     * Imposta il valore della proprietà numTessSasn.
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
     * Recupera il valore della proprietà socNavigaz.
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
     * Imposta il valore della proprietà socNavigaz.
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
     * Recupera il valore della proprietà tipoPrescrizione.
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
     * Imposta il valore della proprietà tipoPrescrizione.
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
     * Recupera il valore della proprietà ricettaInterna.
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
     * Imposta il valore della proprietà ricettaInterna.
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
     * Recupera il valore della proprietà codEsenzione.
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
     * Imposta il valore della proprietà codEsenzione.
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
     * Recupera il valore della proprietà nonEsente.
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
     * Imposta il valore della proprietà nonEsente.
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
     * Recupera il valore della proprietà reddito.
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
     * Imposta il valore della proprietà reddito.
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
     * Recupera il valore della proprietà codDiagnosi.
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
     * Imposta il valore della proprietà codDiagnosi.
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
     * Recupera il valore della proprietà descrizioneDiagnosi.
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
     * Imposta il valore della proprietà descrizioneDiagnosi.
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
     * Recupera il valore della proprietà dataCompilazione.
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
     * Imposta il valore della proprietà dataCompilazione.
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
     * Recupera il valore della proprietà tipoVisita.
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
     * Imposta il valore della proprietà tipoVisita.
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
     * Recupera il valore della proprietà dispReg.
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
     * Imposta il valore della proprietà dispReg.
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
     * Recupera il valore della proprietà provAssistito.
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
     * Imposta il valore della proprietà provAssistito.
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
     * Recupera il valore della proprietà aslAssistito.
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
     * Imposta il valore della proprietà aslAssistito.
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
     * Recupera il valore della proprietà indicazionePrescr.
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
     * Imposta il valore della proprietà indicazionePrescr.
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
     * Recupera il valore della proprietà altro.
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
     * Imposta il valore della proprietà altro.
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
     * Recupera il valore della proprietà classePriorita.
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
     * Imposta il valore della proprietà classePriorita.
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
     * Recupera il valore della proprietà statoEstero.
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
     * Imposta il valore della proprietà statoEstero.
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
     * Recupera il valore della proprietà istituzCompetente.
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
     * Imposta il valore della proprietà istituzCompetente.
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
     * Recupera il valore della proprietà numIdentPers.
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
     * Imposta il valore della proprietà numIdentPers.
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
     * Recupera il valore della proprietà numIdentTess.
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
     * Imposta il valore della proprietà numIdentTess.
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
     * Recupera il valore della proprietà dataNascitaEstero.
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
     * Imposta il valore della proprietà dataNascitaEstero.
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
     * Recupera il valore della proprietà dataScadTessera.
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
     * Imposta il valore della proprietà dataScadTessera.
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
     * Recupera il valore della proprietà statoProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoProcesso() {
        return statoProcesso;
    }

    /**
     * Imposta il valore della proprietà statoProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoProcesso(String value) {
        this.statoProcesso = value;
    }

    /**
     * Recupera il valore della proprietà elencoDettagliPrescrizioni.
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
     * Imposta il valore della proprietà elencoDettagliPrescrizioni.
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
