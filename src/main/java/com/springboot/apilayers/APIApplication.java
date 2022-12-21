package com.springboot.apilayers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class APIApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIApplication.class, args);
	}

}


