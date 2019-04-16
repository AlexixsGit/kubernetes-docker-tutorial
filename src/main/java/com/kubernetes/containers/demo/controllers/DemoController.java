package com.kubernetes.containers.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/getMessage")
	public String getMessage() {
		System.out.println("Retrieving message");
		return "Hello world";
	}
}
