package com.neosoft.libserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootLibrarysubscr1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibrarysubscr1Application.class, args);
	}

}
