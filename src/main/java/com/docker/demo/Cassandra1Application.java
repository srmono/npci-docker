package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Cassandra1Application {
	
	@GetMapping("/api/message")
	public String message() {
		return "I Love Spring Boot App";
	}

	public static void main(String[] args) {
		SpringApplication.run(Cassandra1Application.class, args);
		
	}

}
