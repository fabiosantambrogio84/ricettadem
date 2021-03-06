package com.ricettadem.main;

import com.ricettadem.services.AnnullaRicettaService;
import com.ricettadem.services.RicettaService;
import com.ricettadem.services.RichiestaLottiNreService;
import com.ricettadem.services.certificatiMalattia.AnnullaCertificatoMalattiaService;
import com.ricettadem.services.certificatiMalattia.CertificatoMalattiaService;
import com.ricettadem.services.dpcm.RicettaMirService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ricettadem")
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private RicettaService ricettaService;

    @Autowired
    private RichiestaLottiNreService richiestaLottiNreService;

    @Autowired
    private AnnullaRicettaService annullaRicettaService;

    @Autowired
    private RicettaMirService ricettaMirService;

    @Autowired
    private CertificatoMalattiaService certificatoMalattiaService;

    @Autowired
    private AnnullaCertificatoMalattiaService annullaCertificatoMalattiaService;

    public static void main(String[] args) {
        logger.info("Application start");
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application app = context.getBean(Application .class);

        logger.info("Application running");

        String arg1;
        String arg2 = null;
        try{
            arg1 = args[0];
            if(arg1 == null){
                throw new RuntimeException("Specify the type of application to run");
            }
            if(args.length > 1){
                arg2 = args[1];
            }
            app.run(arg1, arg2);
        } catch(Exception e){
            logger.error("Error during the execution of the application", e);
            System.exit(1);
        }

        logger.info("Application closed");
        System.exit(0);
    }

    private void run(String type, String region) throws Exception{
        if(region != null && !region.equals("")){
            logger.info("Executing program for region '" + region + "'");
        }
        if(type.equalsIgnoreCase("invio-ricetta")){
            try {
                ricettaService.invia(region);
            }catch(Exception e){
                logger.error("Error during execution of 'invio-ricetta'", e);
                throw e;
            }
        } else if(type.equalsIgnoreCase("richiesta-lotti-nre")){
            try{
                richiestaLottiNreService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'richiesta-lotti-nre'", e);
                throw e;
            }
        } else if(type.equalsIgnoreCase("annulla-ricetta")){
            try{
                annullaRicettaService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'annulla-ricetta'", e);
                throw e;
            }
        } else if(type.equalsIgnoreCase("invio-ricetta-dpcm")){
            try{
                ricettaMirService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'invio-ricetta-dpcm'", e);
                throw e;
            }
        } else if(type.equalsIgnoreCase("invio-certificato-malattia")){
            try{
                certificatoMalattiaService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'invio-certificato-malattia'", e);
                throw e;
            }
        } else if(type.equalsIgnoreCase("annulla-certificato-malattia")){
            try{
                annullaCertificatoMalattiaService.invia();
            } catch(Exception e){
                logger.error("Error during execution of 'annulla-certificato-malattia'", e);
                throw e;
            }
        }
    }

}
