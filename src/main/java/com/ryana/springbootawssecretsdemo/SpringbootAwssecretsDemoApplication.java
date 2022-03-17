package com.ryana.springbootawssecretsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@SpringBootApplication
public class SpringbootAwssecretsDemoApplication {

	private final Environment environment;

	@GetMapping("{key}")
	public String getEnvVar(@PathVariable String key) {
		return environment.getProperty(key);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwssecretsDemoApplication.class, args);
	}

}
