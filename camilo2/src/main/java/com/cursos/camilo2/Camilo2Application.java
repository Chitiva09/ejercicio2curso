package com.cursos.camilo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class Camilo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Camilo2Application.class, args);
	}

}
