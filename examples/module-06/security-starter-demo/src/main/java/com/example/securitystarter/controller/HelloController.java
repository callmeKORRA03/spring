package com.example.securitystarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello from the public endpoint";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Hello from the protected endpoint";
    }
}
