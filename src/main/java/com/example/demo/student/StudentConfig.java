package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ikbal = new Student(
                    "ikbal",
                    "miarslan.ikb@gmail.com",
                    LocalDate.of(1996, Month.MARCH,1)
            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,25)
            );

            repository.saveAll(
                    List.of(ikbal,alex)
            );

            //System.out.println("age: " + ikbal.getAge());
        };
    }
}
