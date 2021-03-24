package com.stackroute.consumerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/")
public class QuotationClientController {

    private RestTemplate restTemplate;

    //@value to get value from application.yml file
    @Value("${app.url}")
    private String url;


    @Autowired
    public QuotationClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // getProducerMessage method is to consume and return the message from quotation-service using RestTemplate
    @GetMapping("message")
    public String getProducerMessage() {
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}