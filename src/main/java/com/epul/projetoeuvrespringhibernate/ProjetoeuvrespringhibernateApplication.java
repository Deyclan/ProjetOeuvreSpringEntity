package com.epul.projetoeuvrespringhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.epul")
@SpringBootApplication
public class ProjetoeuvrespringhibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoeuvrespringhibernateApplication.class, args);
	}
}
