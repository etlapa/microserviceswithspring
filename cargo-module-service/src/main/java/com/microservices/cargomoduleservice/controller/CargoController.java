package com.microservices.cargomoduleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargo")
public class CargoController {

	@GetMapping
	public String getName() {
		return "Hello World";
	}
}
