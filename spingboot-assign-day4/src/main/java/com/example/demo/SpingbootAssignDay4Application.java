package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpingbootAssignDay4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootAssignDay4Application.class, args);
	}

}
