package com.demo.Eureka301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka301Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka301Application.class, args);
	}

}
