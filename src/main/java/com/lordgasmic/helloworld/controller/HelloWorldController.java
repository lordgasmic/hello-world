package com.lordgasmic.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/v1/hello/world")
    public String get(){
        return "derp";
    }
}
