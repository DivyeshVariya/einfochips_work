package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
public class HomeController {
	WebClient wc=WebClient.create();
	
	@RequestMapping("home")
	public ResponseEntity<String> getindex()
	{
		RestTemplate rt=new RestTemplate();
		return rt.getForEntity("http://localhost:8081/index",String.class);
	}
	
	@RequestMapping("/ractivetrainees")
	public Flux<String> getreact() {
		return wc.get().uri("http://localhost:8081/index").retrieve().bodyToFlux(String.class);
	}
	 
}
