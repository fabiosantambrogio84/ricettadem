//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.06.08 alle 02:27:53 PM CEST 
//


package com.ricettadem.soap.certificatiMalattia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ricevutaOkRicercaMalattia complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricevutaOkRicercaMalattia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datiCertificato" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="idCertificato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="dataRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="annullato" type="{http://cert.sanita.finanze.it/}booleanString"/&gt;
 *                   &lt;element name="malattia" type="{http://cert.sanita.finanze.it/}malattiaRidotta"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevutaOkRicercaMalattia", propOrder = {
    "datiCertificato"
})
public class RicevutaOkRicercaMalattia {

    protected List<RicevutaOkRicercaMalattia.DatiCertificato> datiCertificato;

    /**
     * Gets the value of the datiCertificato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datiCertificato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatiCertificato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RicevutaOkRicercaMalattia.DatiCertificato }
     * 
     * 
     */
    public List<RicevutaOkRicercaMalattia.DatiCertificato> getDatiCertificato() {
        if (datiCertificato == null) {
            datiCertificato = new ArrayList<RicevutaOkRicercaMalattia.DatiCertificato>();
        }
        return this.datiCertificato;
    }


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
     *         &lt;element name="idCertificato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="dataRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="annullato" type="{http://cert.sanita.finanze.it/}booleanString"/&gt;
     *         &lt;element name="malattia" type="{http://cert.sanita.finanze.it/}malattiaRidotta"/&gt;
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
        "idCertificato",
        "dataRicezione",
        "annullato",
        "malattia"
    })
    public static class DatiCertificato {

        @XmlElement(required = true)
        protected String idCertificato;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dataRicezione;
        @XmlElement(required = true)
        protected String annullato;
        @XmlElement(required = true)
        protected MalattiaRidotta malattia;

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

        /**
         * Recupera il valore della proprietà dataRicezione.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRicezione() {
            return dataRicezione;
        }

        /**
         * Imposta il valore della proprietà dataRicezione.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRicezione(XMLGregorianCalendar value) {
            this.dataRicezione = value;
        }

        /**
         * Recupera il valore della proprietà annullato.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnnullato() {
            return annullato;
        }

        /**
         * Imposta il valore della proprietà annullato.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnnullato(String value) {
            this.annullato = value;
        }

        /**
         * Recupera il valore della proprietà malattia.
         * 
         * @return
         *     possible object is
         *     {@link MalattiaRidotta }
         *     
         */
        public MalattiaRidotta getMalattia() {
            return malattia;
        }

        /**
         * Imposta il valore della proprietà malattia.
         * 
         * @param value
         *     allowed object is
         *     {@link MalattiaRidotta }
         *     
         */
        public void setMalattia(MalattiaRidotta value) {
            this.malattia = value;
        }

    }

}
