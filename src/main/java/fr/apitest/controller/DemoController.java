package fr.apitest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private String saveMyValue= "rien";

    @RequestMapping(value = "/getDemo", method = RequestMethod.GET)
    public String getDemo(){
        return saveMyValue;
    }

    @RequestMapping(value = "/po stDemo/{value}", method = RequestMethod.POST)
    public String postDemo(@PathVariable() String value){
        saveMyValue = value;
        return saveMyValue;
    }

    @RequestMapping(value = "/putDemo/{value}", method = RequestMethod.PUT)
    public String putDemo(@PathVariable() String value){
        if("rien".equals(saveMyValue)) {
            return "erreur: valeur vide";
        }
        saveMyValue = value;
        return value;
    }

    @RequestMapping(value = "/deleteDemo", method = RequestMethod.DELETE)
    public String deleteDemo(){
        saveMyValue= "rien";
        return saveMyValue;
    }
}
