package com.project.postApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class PostApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApiApplication.class, args);
	}

}
