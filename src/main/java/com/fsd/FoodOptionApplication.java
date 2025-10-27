package com.fsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.fsd.feign")
public class FoodOptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOptionApplication.class, args);
	}

}
