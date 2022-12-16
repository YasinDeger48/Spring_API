package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){

        return args -> {
            Student student1 = new Student(
                    1L,
                    "Yasin",
                    526,
                    "yasin.deger@virgosol.com",

                    "Virgosol"
            );

            Student student2 = new Student(
                    2L,
                    "Emel",
                    123,
                    "emel.deger@virgosol.com",
                    "Sağlık Bak"
            );

            Student student3 = new Student(
                    3L,
                    "John",
                    123,
                    "john.doe@virgosol.com",
                    "Virgosol"
            );
            repository.saveAll(
                    List.of(student1,student2,student3)
            );
        };

    }
}
