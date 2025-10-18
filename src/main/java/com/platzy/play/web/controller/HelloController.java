package com.platzy.play.web.controller;

import com.platzy.play.domain.service.AIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final AIService aiService;

    public HelloController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.aiService.generateGreeting();
    }
}
