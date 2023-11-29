package com.example.demo.controller;

import com.example.demo.model.Fact;
import com.example.demo.service.FactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fact")
public class FactController {
    private final FactService factService;

    public FactController(FactService factService) {
        this.factService = factService;
    }

    @GetMapping
    public Fact getFact() {
        return factService.getFact();
    }
}
