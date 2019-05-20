package com.ricettadem.core;

import com.ricettadem.model.Ricetta;
import com.ricettadem.soap.InvioPrescrittoRichiesta;
import org.springframework.stereotype.Component;

@Component
public class RequestHelper {

    public InvioPrescrittoRichiesta createInvioPrescrittoRichiesta(Ricetta ricetta){
        InvioPrescrittoRichiesta request = null;
        request.setPinCode(ricetta.getPincode());

        return request;
    }
}
