package com.sandeepmane.springstudentservice.student.service;

import java.util.List;
import java.util.Optional;

import com.sandeepmane.springstudentservice.student.db.StudentJpaRepository;
import com.sandeepmane.springstudentservice.student.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    StudentJpaRepository studentJpaRepository;

    public boolean createStudent(Student student)
    {
        try {
            studentJpaRepository.save(student);
        } catch (Exception e) {
            System.out.println("Exception Caught!!!!");
            return false;
        }
        
        return true;
    }

    public Student getStudent(int id)
    {
        System.out.println("*******************Here getStudent!!!!");
        Optional<Student> studentDB = studentJpaRepository.findById(id);
        return (Student) studentDB.get();
    }


    public List<Student> getStudents(){
        System.out.println("*******************Here getStudents***********");
        return studentJpaRepository.findAll();

    }

}