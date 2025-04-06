package com.aliek.JwtSecurity.respository;

import com.aliek.JwtSecurity.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
