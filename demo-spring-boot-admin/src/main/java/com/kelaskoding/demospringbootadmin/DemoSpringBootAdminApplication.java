package com.kelaskoding.demospringbootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class DemoSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootAdminApplication.class, args);
	}

}
