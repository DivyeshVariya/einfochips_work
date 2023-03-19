package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Day29Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day29Assignment1Application.class, args);
	}

}
