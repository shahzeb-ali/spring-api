package com.shahzeb.apistarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.shahzeb.students" })
public class APIstarter {

	public static void main(String[] args) {
		SpringApplication.run(APIstarter.class, args);

	}
}
