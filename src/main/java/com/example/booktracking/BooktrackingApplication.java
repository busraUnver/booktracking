package com.example.booktracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class BooktrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooktrackingApplication.class, args);
	}

}
