package com.example.demowithpostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

// we need to add rest controller to serve REST endpoints
@RestController
public class DemoWithPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWithPostgresqlApplication.class, args);
	}

	// a simple method to say Hello World
	// in order for it to be recongised as a REST endpoint, it needs to be annotated with @GetMappin as we want to get something out of the server
	@GetMapping ("/hello")
	public List<String> hello(){

		return List.of( "Hello", "World");
	}

}
