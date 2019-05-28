package com.ricettadem.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

@Component
public class EncryptDecryptHelper {

    private static Logger logger = LoggerFactory.getLogger(EncryptDecryptHelper.class);

    public String encrypt(String plainText, String fileCerPath) throws Exception{
        String result = plainText;

        Path path = Paths.get(ClassLoader.getSystemResource(fileCerPath).toURI());

        FileInputStream fis = new FileInputStream(path.toFile());
        CertificateFactory cf = CertificateFactory.getInstance("X509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(fis);
        PublicKey publicKey = cert.getPublicKey();

        Cipher encryptCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] cipherText = encryptCipher.doFinal(plainText.getBytes(UTF_8));

        result = Base64.getEncoder().encodeToString(cipherText);

        return result;
    }
}
