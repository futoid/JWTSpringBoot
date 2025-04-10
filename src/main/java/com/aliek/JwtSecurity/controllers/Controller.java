package com.aliek.JwtSecurity.controllers;

import com.aliek.JwtSecurity.models.Student;
import com.aliek.JwtSecurity.models.Users;
import com.aliek.JwtSecurity.respository.StudentRepository;
import com.aliek.JwtSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.saveUser(user);
    }

}
