package com.sandeepmane.calculateageservice.service;

import java.util.Arrays;
import java.util.List;

import com.sandeepmane.calculateageservice.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculateAgeService {
    
    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public int calculateAge(String name)
    {
        //can't return List directly
        Student[] students = restTemplate.getForObject("http://studentservice/students", Student[].class);
        
        List<Student> studentList = Arrays.asList(students);

        int age;

        age = studentList.stream().filter(student -> student.getName().equalsIgnoreCase(name)).findFirst().get().getAge();
       
       return age;
    }

}