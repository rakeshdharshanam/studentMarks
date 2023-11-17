package com.rakesh.studentMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"security","com"})
public class StudentMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroServiceApplication.class, args);
	}

}
