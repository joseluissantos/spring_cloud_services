package com.leroymerlin.backend.demokubernetebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.leroymerlin.*")
public class DemokuberneteBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemokuberneteBackendApplication.class, args);
	}
}
