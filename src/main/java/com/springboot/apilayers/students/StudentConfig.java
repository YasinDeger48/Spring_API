package com.springboot.apilayers.students;


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
                    "Yasin Değer",
                    526,
                    "yasin.deger@virgosol.com",
                    "Virgosol"
            );

            Student student2 = new Student(
                    2L,
                    "Emel Değer",
                    123,
                    "emel.deger@virgosol.com",
                    "Virgosol"
            );

            Student student3 = new Student(
                    3L,
                    "John Doe",
                    123,
                    "john.doe@virgosol.com",
                    "Virgosol"
            );

            Student student4 = new Student(
                    4L,
                    "Basia Egle",
                    63293,
                    "begle0@wikispaces.com",
                    "Twitterwire"
            );
            Student student5 = new Student(
                    5L,
                    "Alana Janas",
                    22,
                    "ajanas1@europa.eu",
                    "Vinte"
            );
            Student student6 = new Student(
                    6L,
                    "Lexy Matijasevic",
                    87391,
                    "lmatijasevic2@typepad.com",
                    "Aimbu"
            );
            Student student7 = new Student(
                    7L,
                    "Adam Saylor",
                    580,
                    "asaylor4@usda.gov",
                    "PhotoList"
            );
            Student student8 = new Student(
                    8L,
                    "Shelby Hollier",
                    5,
                    "shollier5@wikia.com",
                    "Mudo"
            );
            Student student9 = new Student(
                    9L,
                    "Ambrose Bassindale",
                    1894,
                    "abassindale6@samsung.com",
                    "Edgepulse"
            );
            Student student10 = new Student(
                    10L,
                    "Chelsy Gopsell",
                    162,
                    "cgopsell7@github.com",
                    "Github"
            );
            repository.saveAll(
                    List.of(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10)
            );
        };

    }
}
