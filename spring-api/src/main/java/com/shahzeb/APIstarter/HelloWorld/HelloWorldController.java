package com.shahzeb.APIstarter.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
}
