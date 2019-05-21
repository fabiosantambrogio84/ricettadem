package com.ricettadem.main;

import com.ricettadem.core.RequestHelper;
import com.ricettadem.csv.CsvParser;
import com.ricettadem.model.Ricetta;
import com.ricettadem.soap.InvioPrescrittoRicevuta;
import com.ricettadem.soap.InvioPrescrittoRichiesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.client.core.WebServiceTemplate;

@ComponentScan(basePackages = "com.ricettadem")
public class Application {

    @Autowired
    private CsvParser csvParser;

    @Autowired
    private RequestHelper requestHelper;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    public static void main(String[] args) throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application app = context.getBean(Application .class);

        app.run();
    }

    private void run() throws Exception{
        Ricetta ricetta = csvParser.readCsv("mirricettainvio.txt");

        InvioPrescrittoRichiesta request = requestHelper.createInvioPrescrittoRichiesta(ricetta);

        InvioPrescrittoRicevuta resp1 = (InvioPrescrittoRicevuta)webServiceTemplate.marshalSendAndReceive(request);
    }
}
