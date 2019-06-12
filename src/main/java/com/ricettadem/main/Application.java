package com.ricettadem.main;

import com.ricettadem.services.AnnullaRicettaService;
import com.ricettadem.services.RicettaService;
import com.ricettadem.services.RichiestaLottiNreService;
import com.ricettadem.services.dpcm.RicettaMirService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ricettadem")
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private RicettaService ricettaService;

    @Autowired
    private RichiestaLottiNreService richiestaLottiNreService;

    @Autowired
    private AnnullaRicettaService annullaRicettaService;

    @Autowired
    private RicettaMirService ricettaMirService;

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
            //logger.error("No argument was specified. Unable to run the application.");
            throw e;
        }

        logger.info("Application closed");
    }

    private void run(String type) throws Exception{
        if(type.toLowerCase().equals("invio-ricetta")){
            try {
                ricettaService.invia();
            }catch(Exception e){
                logger.error("Error during execution of 'invio-ricetta'", e);
                throw e;
            }
        } else if(type.toLowerCase().equals("richiesta-lotti-nre")){
            try{
                richiestaLottiNreService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'richiesta-lotti-nre'", e);
                throw e;
            }
        } else if(type.toLowerCase().equals("annulla-ricetta")){
            try{
                annullaRicettaService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'annulla-ricetta'", e);
                throw e;
            }
        } else if(type.toLowerCase().equals("invio-ricetta-dpcm")){
            try{
                ricettaMirService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'invio-ricetta-dpcm'", e);
                throw e;
            }
        }
    }

}
