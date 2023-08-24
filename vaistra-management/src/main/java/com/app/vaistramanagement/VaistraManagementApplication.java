package com.app.vaistramanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories( basePackages = {"com.*"} )
@ComponentScan
@RestController
@ComponentScan(basePackages = {"com.*"})

public class VaistraManagementApplication {





	public static void main(String[] args) {
		SpringApplication.run(VaistraManagementApplication.class, args);

		System.out.println("My application is running");
	}



}
