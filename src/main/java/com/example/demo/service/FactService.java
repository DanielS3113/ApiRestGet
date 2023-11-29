package com.example.demo.service;

import com.example.demo.model.Fact;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FactService {
    private final RestTemplate restTemplate;
    private final String apiUrl = "https://catfact.ninja/fact"; 

    public FactService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Fact getFact() {
        Fact fact = restTemplate.getForObject(apiUrl, Fact.class);

        return fact;
    }
}
