package com.stackroute.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Random;


@RestController
@RequestMapping("/api/v1/")
public class QuotationController {

    ArrayList<String> quotationList;

    //@value to get value from application.yml file
    @Value("${app.quotation1}")
    private String quotation1;

    @Value("${app.quotation2}")
    private String quotation2;

    @Value("${app.quotation3}")
    private String quotation3;

    @Value("${app.quotation4}")
    private String quotation4;

    @GetMapping("quotation")
    public String quotation() {
        quotationList = new ArrayList<>();
        quotationList.add(quotation1);
        quotationList.add(quotation2);
        quotationList.add(quotation3);
        quotationList.add(quotation4);
        /*
         * To get random quotation from ArrayList
         */
        Random random = new Random();
        //get random quotation from ArrayList
        return quotationList.get(random.nextInt(quotationList.size()));
    }
}