package com.example.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring_app.service.HelloWorldService;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired //indica que precisa injentar a dependencia
    private HelloWorldService helloWorldService;

    // public HelloWorldController(HelloWorldService helloWorldService) {
    //     this.helloWorldService = helloWorldService;
    // }
    //indica que responde a requisicoes do tipo GET
    @GetMapping
    public String helloWorld(){
        // return "Hello World";
        return helloWorldService.helloWorld("Vinicius");
    }
}
