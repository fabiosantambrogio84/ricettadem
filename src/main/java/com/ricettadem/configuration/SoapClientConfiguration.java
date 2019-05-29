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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


@Configuration
public class SoapClientConfiguration {

    @Value("${ws.username}")
    private String username;

    @Value("${ws.password}")
    private String password;

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
        String credentials = username + ":" + password;
        String asB64 = Base64.getEncoder().encodeToString(credentials.getBytes("utf-8"));


        Header header = new BasicHeader(HttpHeaders.AUTHORIZATION, "Basic " + asB64);
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
}
