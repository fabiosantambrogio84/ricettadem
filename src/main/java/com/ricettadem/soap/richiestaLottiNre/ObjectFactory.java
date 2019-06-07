//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.06 at 12:27:11 PM CEST 
//


package com.ricettadem.soap.richiestaLottiNre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ricettadem.soap.richiestaLottiNre package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LottoRichiestaNRE_QNAME = new QName("http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it", "LottoRichiestaNRE");
    private final static QName _LottoRicevutaNRE_QNAME = new QName("http://lottoricevuta.xsd.nre.mirsac.sanita.finanze.it", "LottoRicevutaNRE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ricettadem.soap.richiestaLottiNre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LottoRichiestaNRE }
     * 
     */
    public LottoRichiestaNRE createLottoRichiestaNRE() {
        return new LottoRichiestaNRE();
    }

    /**
     * Create an instance of {@link LottoRicevutaNRE }
     * 
     */
    public LottoRicevutaNRE createLottoRicevutaNRE() {
        return new LottoRicevutaNRE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LottoRichiestaNRE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LottoRichiestaNRE }{@code >}
     */
    @XmlElementDecl(namespace = "http://lottorichiesta.xsd.nre.mirsac.sanita.finanze.it", name = "LottoRichiestaNRE")
    public JAXBElement<LottoRichiestaNRE> createLottoRichiestaNRE(LottoRichiestaNRE value) {
        return new JAXBElement<LottoRichiestaNRE>(_LottoRichiestaNRE_QNAME, LottoRichiestaNRE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LottoRicevutaNRE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LottoRicevutaNRE }{@code >}
     */
    @XmlElementDecl(namespace = "http://lottoricevuta.xsd.nre.mirsac.sanita.finanze.it", name = "LottoRicevutaNRE")
    public JAXBElement<LottoRicevutaNRE> createLottoRicevutaNRE(LottoRicevutaNRE value) {
        return new JAXBElement<LottoRicevutaNRE>(_LottoRicevutaNRE_QNAME, LottoRicevutaNRE.class, null, value);
    }

}