package com.lordgasmic.helloworld.controller;

import com.lordgasmic.helloworld.model.HW;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/v1/hello/world")
    public HW get(){
        HW hw = new HW();
        hw.setHello("derpsicile");
        return hw;
    }
}
