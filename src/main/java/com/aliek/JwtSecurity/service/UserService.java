package com.aliek.JwtSecurity.service;

import com.aliek.JwtSecurity.models.Users;
import com.aliek.JwtSecurity.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

}
