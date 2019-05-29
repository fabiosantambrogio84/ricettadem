package com.ricettadem.main;

import com.ricettadem.helper.RequestHelper;
import com.ricettadem.helper.CsvHelper;
import com.ricettadem.model.Ricetta;
import com.ricettadem.services.RicettaService;
import com.ricettadem.soap.InvioPrescrittoRicevuta;
import com.ricettadem.soap.InvioPrescrittoRichiesta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

@ComponentScan(basePackages = "com.ricettadem")
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private RicettaService ricettaService;


    public static void main(String[] args) throws Exception{
        logger.info("Application start");
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application app = context.getBean(Application .class);

        logger.info("Application running");

        String arg1 = null;
        try{
            arg1 = args[0];
                app.run(arg1);
            if(arg1 == null){
                throw new RuntimeException("Specify the type of application to run");
            }
        } catch(Exception e){
            logger.error("No argument was specified. Unable to run the application.");
            throw e;
        }




        logger.info("Application closed");
    }

    private void run(String type) throws Exception{
        if(type.toLowerCase().equals("invio-ricetta")){
            try {
                ricettaService.invia();
            }catch(Exception e){
                logger.error("Error during execution of 'INVIO-RICETTA'", e);
                throw e;
            }
        }
    }

}
