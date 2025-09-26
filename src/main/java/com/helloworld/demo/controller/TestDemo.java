package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testdemo")
public class TestDemo {
    
    @GetMapping("/hello") 
    public String getHelloWorld() {
        return "Hello world - World goodbye";
    }
}
