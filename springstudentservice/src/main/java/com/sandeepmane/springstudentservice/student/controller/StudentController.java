package com.sandeepmane.springstudentservice.student.controller;

import java.util.List;

import com.sandeepmane.springstudentservice.student.model.Student;
import com.sandeepmane.springstudentservice.student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController  {
    
    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    @PostMapping
    public boolean createStudent(@RequestBody Student student){
        System.out.println("************Received name:" + student.getName() + ", age:" +student.getAge());
        return studentService.createStudent(student);

    }

    @RequestMapping("/students")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}