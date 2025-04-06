package com.aliek.JwtSecurity.respository;

import com.aliek.JwtSecurity.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
