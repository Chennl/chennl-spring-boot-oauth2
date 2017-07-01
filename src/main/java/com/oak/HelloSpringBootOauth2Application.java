package com.oak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.oak")
public class HelloSpringBootOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootOauth2Application.class, args);
	}
}
