package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	// take a value from URL request and then map it as a parameter in the method
//	public String hello ()
	// user will be able to put in hello?name={some_name}
	public String hello (@RequestParam(value = "name", defaultValue = "World")
						 //then we need to define the datatype for this parameter & name the parameter:
						 String name
	){
		return String.format("Hello %s!", name);

	}

	@GetMapping("/person")
	public Person person (@RequestParam(value = "name", defaultValue = "World") String name){
		String greeting = String.format("Hello %s!", name);
		Person person = new Person();
		person.setName(name);
		person.setGreeting(greeting);
		return person;
	}
}

