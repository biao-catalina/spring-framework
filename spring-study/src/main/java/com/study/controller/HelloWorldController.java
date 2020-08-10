package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@GetMapping
	public String sayHello() {
		return "Hello from Spring 5 and embedded Tomcat 8!";
	}

	@GetMapping("/{name}")
	public String hi(@PathVariable String name) {
		return "hhh" +name;
	}
}
