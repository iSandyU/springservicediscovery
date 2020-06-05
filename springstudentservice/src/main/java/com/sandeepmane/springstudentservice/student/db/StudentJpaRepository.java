package com.sandeepmane.springstudentservice.student.db;

import com.sandeepmane.springstudentservice.student.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {
    
}