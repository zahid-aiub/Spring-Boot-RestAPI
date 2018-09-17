package com.example.StartSB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Hello...";
	}

}
