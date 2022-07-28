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
    CommandLineRunner commandLineRunner(StudentRepository repository ) {
        return args -> {
            Student kanchi = new Student(
                    "Kanchi",
                    "kanchi123@gmail.com",
                    LocalDate.of(2001, Month.NOVEMBER, 8)
            );

            Student naitik = new Student(
                    "naitik",
                    "naitik123@gmail.com",
                    LocalDate.of(2005, Month.FEBRUARY, 20)
            );

            repository.saveAll(
                    List.of(kanchi, naitik)
            );
        };
    }
}
