package com.kdu.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
	@RestController
	class HelloController {
		@GetMapping("/")
		public String index() {

			return "Hello,Harsh Kachhawa KD Batch-24 Azure!";
		}
	}

}
