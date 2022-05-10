package com.example.demo.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args ->{
            Student mariam = new Student(
                    "Mariam",
                    "m.mariam@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 5),
                    21
            );

            Student karol = new Student(
                    "karol",
                    "karol@gmail.com",
                    LocalDate.of(2001, Month.JULY, 23),
                    21
            );
            repository.saveAll(
                    List.of(mariam, karol)
            );
        };
    }

}
