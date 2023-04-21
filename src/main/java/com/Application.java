package com;

import javax.persistence.Embeddable;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ("ecommerce.service.AdminService")
@Embeddable

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
