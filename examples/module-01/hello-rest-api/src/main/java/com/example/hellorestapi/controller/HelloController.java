package com.example.hellorestapi.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is the first Spring Boot example project.";
    }

    @GetMapping("/profile")
    public Map<String, String> profile() {
        return Map.of(
            "name", "Favour",
            "course", "Spring Boot Foundations",
            "level", "Beginner"
        );
    }
}
