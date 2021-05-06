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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Giornata lavorata: se true indica che il lavoratore ha dichiarato di aver completato la propria attivita' lavorativa alla data del
 *                 ricovero,
 *                 false altrimenti.
 *                 Trauma: indica l'occorrenza di un evento traumatico.
 *             
 * 
 * <p>Classe Java per malattia complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="malattia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruoloMedico" type="{http://cert.sanita.finanze.it/}ruolo"/&gt;
 *         &lt;element name="dataRilascio" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="dataInizio" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="dataFine" type="{http://cert.sanita.finanze.it/}dateString"/&gt;
 *         &lt;element name="visita" type="{http://cert.sanita.finanze.it/}tipoVisita"/&gt;
 *         &lt;element name="tipoCertificato" type="{http://cert.sanita.finanze.it/}tipoCertificato"/&gt;
 *         &lt;element name="diagnosi" type="{http://cert.sanita.finanze.it/}diagnosi"/&gt;
 *         &lt;element name="giornataLavorata" type="{http://cert.sanita.finanze.it/}booleanString" minOccurs="0"/&gt;
 *         &lt;element name="trauma" type="{http://cert.sanita.finanze.it/}booleanString" minOccurs="0"/&gt;
 *         &lt;element name="agevolazioni" type="{http://cert.sanita.finanze.it/}agevolazioni" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "malattia", propOrder = {
    "ruoloMedico",
    "dataRilascio",
    "dataInizio",
    "dataFine",
    "visita",
    "tipoCertificato",
    "diagnosi",
    "giornataLavorata",
    "trauma",
    "agevolazioni"
})
public class Malattia {

    @XmlElement(required = true)
    protected String ruoloMedico;
    @XmlElement(required = true)
    protected String dataRilascio;
    @XmlElement(required = true)
    protected String dataInizio;
    @XmlElement(required = true)
    protected String dataFine;
    @XmlElement(required = true)
    protected String visita;
    @XmlElement(required = true)
    protected String tipoCertificato;
    @XmlElement(required = true)
    protected Diagnosi diagnosi;
    protected String giornataLavorata;
    protected String trauma;
    protected String agevolazioni;

    /**
     * Recupera il valore della proprietà ruoloMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuoloMedico() {
        return ruoloMedico;
    }

    /**
     * Imposta il valore della proprietà ruoloMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuoloMedico(String value) {
        this.ruoloMedico = value;
    }

    /**
     * Recupera il valore della proprietà dataRilascio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRilascio() {
        return dataRilascio;
    }

    /**
     * Imposta il valore della proprietà dataRilascio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRilascio(String value) {
        this.dataRilascio = value;
    }

    /**
     * Recupera il valore della proprietà dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietà dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInizio(String value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprietà dataFine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprietà dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFine(String value) {
        this.dataFine = value;
    }

    /**
     * Recupera il valore della proprietà visita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisita() {
        return visita;
    }

    /**
     * Imposta il valore della proprietà visita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisita(String value) {
        this.visita = value;
    }

    /**
     * Recupera il valore della proprietà tipoCertificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCertificato() {
        return tipoCertificato;
    }

    /**
     * Imposta il valore della proprietà tipoCertificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCertificato(String value) {
        this.tipoCertificato = value;
    }

    /**
     * Recupera il valore della proprietà diagnosi.
     * 
     * @return
     *     possible object is
     *     {@link Diagnosi }
     *     
     */
    public Diagnosi getDiagnosi() {
        return diagnosi;
    }

    /**
     * Imposta il valore della proprietà diagnosi.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnosi }
     *     
     */
    public void setDiagnosi(Diagnosi value) {
        this.diagnosi = value;
    }

    /**
     * Recupera il valore della proprietà giornataLavorata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiornataLavorata() {
        return giornataLavorata;
    }

    /**
     * Imposta il valore della proprietà giornataLavorata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiornataLavorata(String value) {
        this.giornataLavorata = value;
    }

    /**
     * Recupera il valore della proprietà trauma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrauma() {
        return trauma;
    }

    /**
     * Imposta il valore della proprietà trauma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrauma(String value) {
        this.trauma = value;
    }

    /**
     * Recupera il valore della proprietà agevolazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgevolazioni() {
        return agevolazioni;
    }

    /**
     * Imposta il valore della proprietà agevolazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgevolazioni(String value) {
        this.agevolazioni = value;
    }

}
