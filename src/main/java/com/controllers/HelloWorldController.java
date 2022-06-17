package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {


    @GetMapping( "/helloWorld" )
    public String helloWorld() {

        return "HelloWorld";
    }


    @GetMapping("/bye")
    @ResponseBody
    public String bye() {

        return "Bye Bye Siri lanka! ";
    }

}
