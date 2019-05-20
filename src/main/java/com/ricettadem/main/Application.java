package com.ricettadem.main;

import com.ricettadem.csv.CsvParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ricettadem")
public class Application {

    @Autowired
    private CsvParser csvParser;

    public static void main(String[] args) throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application app = context.getBean(Application .class);

        app.run();

    }

    private void run() throws Exception{
        csvParser.readCsv("mirricettainvio.txt");
    }
}
