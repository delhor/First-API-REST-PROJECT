package fr.apitest.controller;
//package net.javaguides.springboot.Springboothelloworldapplication;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


/*public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "HELLO " + name;
    }
}
*/
@RestController
public class HelloController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private String saveMyValue= "rien";

    @RequestMapping(value = "/pays/{label}", method = RequestMethod.GET)
    public String Hello(@PathVariable() String label){
        return label;
    }
    /*
    @RequestMapping(value = "/pays{result}", method = RequestMethod.POST)
    public String Bye(@PathVariable() String result ){
        return result;
    }*/

    @RequestMapping(value = "/greeting/{result}", method = RequestMethod.POST)
    public String Bye(@PathVariable() String result ){
        return result;
    }

    @RequestMapping("/toi")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "HELLO " + name;
    }
}



