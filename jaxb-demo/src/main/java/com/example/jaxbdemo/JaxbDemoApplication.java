package com.example.jaxbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JaxbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxbDemoApplication.class, args);
	}

}

