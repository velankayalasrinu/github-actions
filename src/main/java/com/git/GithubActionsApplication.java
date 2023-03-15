package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubActionsApplication {
	@GetMapping("/message")
	public String message() {
		return "welcome to git";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}
}
