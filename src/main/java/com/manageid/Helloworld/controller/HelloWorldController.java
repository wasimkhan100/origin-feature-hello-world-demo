package com.manageid.Helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		String helloMessage="Hello World Developer!!!";
		System.out.println("hello ");
		System.out.println("deploy");
	return helloMessage;
	
	}
}
