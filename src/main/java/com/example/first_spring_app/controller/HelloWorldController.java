package com.example.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    //indica que responde a requisicoes do tipo GET
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
