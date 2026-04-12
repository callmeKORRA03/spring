package com.example.layeredapp.service;

import org.springframework.stereotype.Service;

@Service
public class GradeService {

    public String checkGrade(int score) {
        if (score >= 70) {
            return "Excellent";
        }

        if (score >= 50) {
            return "Pass";
        }

        return "Fail";
    }

    public String getWelcomeMessage() {
        return "Welcome to the layered Spring Boot demo";
    }
}
