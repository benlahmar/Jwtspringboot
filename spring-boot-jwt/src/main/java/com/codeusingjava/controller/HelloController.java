package com.codeusingjava.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getEmployees() {
        return "Hello World!";
    }
    
    
    @GetMapping(value = "/helloa")
    public String gethello() {
        return "Hello World!";
    }
}