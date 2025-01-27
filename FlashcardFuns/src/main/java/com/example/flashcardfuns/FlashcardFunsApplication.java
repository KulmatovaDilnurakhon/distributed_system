package com.example.flashcardfuns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;  // Import the correct annotation

@EnableDiscoveryClient  // Replace @EnableEurekaClient with @EnableDiscoveryClient
@SpringBootApplication
public class FlashcardFunsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardFunsApplication.class, args);
	}

}
