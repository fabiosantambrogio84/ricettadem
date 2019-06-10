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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class SoapClientConfiguration {

    private static Logger logger = LoggerFactory.getLogger(SoapClientConfiguration.class);

//    @Value("${ws.username}")
//    private String username;
//
//    @Value("${ws.password}")
//    private String password;

    @Value("${ws.credentials.file-path}")
    private String credentialsFilePath;

    @Value("${ws.ssl.truststore}")
    private File trustStore;

    @Value("${ws.ssl.truststore-password}")
    private String trustStorePassword;

    @Bean
    Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.ricettadem.soap");

        return jaxb2Marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2Marshaller());
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
//        webServiceTemplate.setDefaultUri(defaultUri);
        // register the LogHttpHeaderClientInterceptor
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
        // set the basic authorization credentials
//        httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());
        httpComponentsMessageSender.setHttpClient(httpClient());
        httpComponentsMessageSender.setConnectionTimeout(60000);
        httpComponentsMessageSender.setReadTimeout(60000);

        return httpComponentsMessageSender;
    }

//    @Bean
//    public UsernamePasswordCredentials usernamePasswordCredentials() {
//        // pass the user name and password to be used
//        return new UsernamePasswordCredentials(username, password);
//    }

    public HttpClient httpClient() throws Exception {
//        CredentialsProvider provider = new BasicCredentialsProvider();
//        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(username, password);
//        provider.setCredentials(AuthScope.ANY, credentials);

        Header header = new BasicHeader(HttpHeaders.AUTHORIZATION, "Basic " + createCredentials());
        List<Header> headers = new ArrayList<>();
        headers.add(header);

        return HttpClientBuilder.create()
                .addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor())
                .setSSLSocketFactory(sslConnectionSocketFactory())
//                .setDefaultCredentialsProvider(provider)
                .setDefaultHeaders(headers)
                .build();
    }

    public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
        // NoopHostnameVerifier essentially turns hostname verification off as otherwise following error
        // is thrown: java.security.cert.CertificateException: No name matching localhost found
        return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
    }

    public SSLContext sslContext() throws Exception {
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
