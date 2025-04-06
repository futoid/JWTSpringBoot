package com.aliek.JwtSecurity.controllers;

import com.aliek.JwtSecurity.models.Student;
import com.aliek.JwtSecurity.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
