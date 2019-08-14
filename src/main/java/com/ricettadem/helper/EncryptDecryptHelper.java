package com.ricettadem.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import static java.nio.charset.StandardCharsets.UTF_8;

public class EncryptDecryptHelper {

    private static Logger logger = LoggerFactory.getLogger(EncryptDecryptHelper.class);

    public static String encrypt(String plainText, String fileCerPath) throws Exception{
        String result = plainText;

        FileInputStream fis = null;

        try{
            fis = new FileInputStream(fileCerPath);
            CertificateFactory cf = CertificateFactory.getInstance("X509");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(fis);
            //logger.info(cert.getSerialNumber().toString(16));
            PublicKey publicKey = cert.getPublicKey();

            Cipher encryptCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] cipherText = encryptCipher.doFinal(plainText.getBytes(UTF_8));

            result = DatatypeConverter.printBase64Binary(cipherText);
        } catch(Exception e){
            logger.error("Error encrypting the string '"+plainText+"'",e);
            throw e;
        } finally{
            fis.close();
        }

        return result;
    }
}
