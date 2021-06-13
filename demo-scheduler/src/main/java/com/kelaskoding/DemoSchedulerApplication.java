package com.kelaskoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSchedulerApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoSchedulerApplication.class, args);
	}

}
