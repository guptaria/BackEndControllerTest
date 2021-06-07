package com.example.TestProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

//@GetMapping("/home")
//    public String home(){
//        return "This is my home";
//    }


    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public  String greeting() {
        return "Hello Heroku";
    }

    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String sayHelloToName(@PathVariable String name) {
        return "Wghats happening , " +name;
    }

}
