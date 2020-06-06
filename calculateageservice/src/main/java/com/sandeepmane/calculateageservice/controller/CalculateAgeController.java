package com.sandeepmane.calculateageservice.controller;

import com.sandeepmane.calculateageservice.service.CalculateAgeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateAgeController {
    
    @Autowired
    CalculateAgeService calculateAgeService;

    @RequestMapping(path = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
    public int calculateAge(@RequestParam(name = "name") String name)
    {
        int age;

        age = calculateAgeService.calculateAge(name);

        return age;
    }
}