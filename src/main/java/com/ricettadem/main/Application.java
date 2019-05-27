package com.ricettadem.main;

import com.ricettadem.core.RequestHelper;
import com.ricettadem.csv.CsvParser;
import com.ricettadem.model.Ricetta;
import com.ricettadem.soap.InvioPrescrittoRicevuta;
import com.ricettadem.soap.InvioPrescrittoRichiesta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.client.core.WebServiceTemplate;

@ComponentScan(basePackages = "com.ricettadem")
public class Application {

    private static Logger logger = LoggerFactory.getLogger(CsvParser.class);

    @Autowired
    private CsvParser csvParser;

    @Autowired
    private RequestHelper requestHelper;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    public static void main(String[] args) throws Exception{
        logger.info("Application start");
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application app = context.getBean(Application .class);

        logger.info("Application running");
        app.run();
        logger.info("Application closed");
    }

    private void run() throws Exception{
        logger.info("Parsing the file...");
        Ricetta ricetta = csvParser.readCsv("mirricettainvio.txt");
        logger.info("Ricetta retrieved from file: " + ricetta.toString());

        logger.info("Creating the soap request...");
        InvioPrescrittoRichiesta request = requestHelper.createInvioPrescrittoRichiesta(ricetta);
        logger.info("Soap request successfully created");

        logger.info("Performing the soap request...");
        InvioPrescrittoRicevuta response = (InvioPrescrittoRicevuta)webServiceTemplate.marshalSendAndReceive(request);
        logger.info("Soap response");

    }
}
