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
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student Mariam = new Student(
        "Mariam",
        "mariam.jamal@gmail.com",
        LocalDate.of(1996, Month.JANUARY,5)
      );
      Student Jackson = new Student(
        "Jackson",
        "jackson.wang@gmail.com",
        LocalDate.of(2001, Month.MARCH,20)
      );

      repository.saveAll(
        List.of(Jackson, Mariam)
      );
    };
  }
}
