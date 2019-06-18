package com.ricettadem.configuration;

import com.ricettadem.interceptors.LogHttpHeaderClientInterceptor;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import javax.net.ssl.SSLContext;
import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class SoapClientConfiguration {

    private static Logger logger = LoggerFactory.getLogger(SoapClientConfiguration.class);

    @Value("${ws.credentials.file-path}")
    private String credentialsFilePath;

    @Value("${certificate.file-path}")
    private String certificateFilePath;

    @Value("${dpcm.certificate.file-path}")
    private String dpcmCertificateFilePath;

    @Value("${ws.ssl.truststore}")
    private File trustStore;

    @Value("${ws.ssl.truststore-password}")
    private String trustStorePassword;

    @Bean
    Jaxb2Marshaller jaxb2MarshallerInvioPrescritto() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.ricettadem.soap.invioPrescritto");
        return jaxb2Marshaller;
    }

    @Bean
    Jaxb2Marshaller jaxb2MarshallerAnnullaPrescritto() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.ricettadem.soap.annullaPrescritto");
        return jaxb2Marshaller;
    }

    @Bean
    Jaxb2Marshaller jaxb2MarshallerRichiestaLottiNre() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.ricettadem.soap.richiestaLottiNre");
        return jaxb2Marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplateInvioPrescritto() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2MarshallerInvioPrescritto());
        webServiceTemplate.setUnmarshaller(jaxb2MarshallerInvioPrescritto());
        ClientInterceptor[] interceptors =
                new ClientInterceptor[]{new LogHttpHeaderClientInterceptor()};
        webServiceTemplate.setInterceptors(interceptors);

        // set a HttpComponentsMessageSender which provides support for basic authentication
        webServiceTemplate.setMessageSender(httpComponentsMessageSender());
        return webServiceTemplate;
    }

    @Bean
    public WebServiceTemplate webServiceTemplateAnnullaPrescritto() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2MarshallerAnnullaPrescritto());
        webServiceTemplate.setUnmarshaller(jaxb2MarshallerAnnullaPrescritto());
        ClientInterceptor[] interceptors =
                new ClientInterceptor[]{new LogHttpHeaderClientInterceptor()};
        webServiceTemplate.setInterceptors(interceptors);

        // set a HttpComponentsMessageSender which provides support for basic authentication
        webServiceTemplate.setMessageSender(httpComponentsMessageSender());
        return webServiceTemplate;
    }

    @Bean
    public WebServiceTemplate webServiceTemplateRichiestaLottiNre() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2MarshallerRichiestaLottiNre());
        webServiceTemplate.setUnmarshaller(jaxb2MarshallerRichiestaLottiNre());
        ClientInterceptor[] interceptors =
                new ClientInterceptor[]{new LogHttpHeaderClientInterceptor()};
        webServiceTemplate.setInterceptors(interceptors);

        // set a HttpComponentsMessageSender which provides support for basic authentication
        webServiceTemplate.setMessageSender(httpComponentsMessageSender());
        return webServiceTemplate;
    }

    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() throws Exception {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setConnectionTimeout(60000);
        httpComponentsMessageSender.setReadTimeout(60000);
        httpComponentsMessageSender.setHttpClient(httpClient());

        return httpComponentsMessageSender;
    }


    public HttpClient httpClient() throws Exception {
        Header header = new BasicHeader(HttpHeaders.AUTHORIZATION, "Basic " + createCredentials());
        List<Header> headers = new ArrayList<>();
        headers.add(header);

        return HttpClientBuilder.create()
                .addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor())
                .setSSLSocketFactory(sslConnectionSocketFactory())
                .setDefaultHeaders(headers)
                .build();
    }

    public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
        // NoopHostnameVerifier essentially turns hostname verification off as otherwise following error
        // is thrown: java.security.cert.CertificateException: No name matching localhost found
        return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
    }

    public SSLContext sslContext() throws Exception {
        KeyStore ks = KeyStore.getInstance("JKS");
        CertificateFactory cf = CertificateFactory.getInstance("X509");

        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileInputStream fisCertificate = null;
        FileInputStream fisDpcmCertificate = null;
        try{
            // load the keystore
            fis = new FileInputStream(trustStore);
            ks.load(fis, trustStorePassword.toCharArray());

            if(!ks.containsAlias("ricetta-dem-cert")){
                // load the certificate
                fisCertificate = new FileInputStream(certificateFilePath);

                X509Certificate certificate = (X509Certificate) cf.generateCertificate(fisCertificate);
                ks.setCertificateEntry("ricetta-dem-cert", certificate);

            }
            if(!ks.containsAlias("ricetta-dpcm-dem-cert")){
                // load the DPCM certificate
                fisDpcmCertificate = new FileInputStream(dpcmCertificateFilePath);

                X509Certificate dpcmCertificate = (X509Certificate) cf.generateCertificate(fisDpcmCertificate);
                ks.setCertificateEntry("ricetta-dpcm-dem-cert", dpcmCertificate);
            }
            fos = new FileOutputStream(trustStore);
            ks.store(fos, trustStorePassword.toCharArray());

        } catch(Exception e){
            logger.error("Error creating ssl context", e);
            throw e;
        } finally {
            if(fis != null){
                fis.close();
            }
            if(fisCertificate != null){
                fisCertificate.close();
            }
            if(fisDpcmCertificate != null){
                fisDpcmCertificate.close();
            }
            if(fos != null){
                fos.close();
            }
        }

        return SSLContextBuilder.create()
                .loadTrustMaterial(trustStore, trustStorePassword.toCharArray()).build();
    }

    private String createCredentials() throws Exception{
        logger.info("Reading credentials...");

        String base64Credentials = "";

        List<String> list = new ArrayList<>();

        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(credentialsFilePath))) {

            while ((line = br.readLine()) != null) {
                list.add(line);

            }

        } catch (IOException e) {
            logger.error("Error reading file", e);
            throw e;
        }

        String credentials = list.get(0);
        credentials = credentials.replace(";", ":");

        logger.info("Credentials retrieved: " + credentials);

        base64Credentials = DatatypeConverter.printBase64Binary(credentials.getBytes("utf-8"));

        return base64Credentials;
    }
}
