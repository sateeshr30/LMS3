package com.neosoft.libapigateway;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootLibraryapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryapigatewayApplication.class, args);
	}

}
