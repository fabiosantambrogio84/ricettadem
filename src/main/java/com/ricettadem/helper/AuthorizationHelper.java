package com.ricettadem.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorizationHelper {

    private static Logger logger = LoggerFactory.getLogger(AuthorizationHelper.class);

    public static String createCredentials(String credentialsFilePath) throws Exception{
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
