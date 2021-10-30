package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {//<Table name,primary_key>

    Optional<Student> findStudentByEmail(String email); // Select * from student where email=?

}
