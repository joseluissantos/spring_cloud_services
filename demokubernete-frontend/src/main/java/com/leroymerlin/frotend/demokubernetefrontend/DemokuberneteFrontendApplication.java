package com.leroymerlin.frotend.demokubernetefrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.leroymerlin.*")
public class DemokuberneteFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemokuberneteFrontendApplication.class, args);
	}
}
