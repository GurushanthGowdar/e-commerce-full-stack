package com.example.ecommercebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.spring")
@SpringBootApplication
public class ECommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBackendApplication.class, args);
	}

}
