package com.example.layeredapp.controller;

import com.example.layeredapp.service.GradeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return gradeService.getWelcomeMessage();
    }

    @GetMapping("/grade")
    public String grade(@RequestParam int score) {
        return "Score: " + score + ", Result: " + gradeService.checkGrade(score);
    }
}
