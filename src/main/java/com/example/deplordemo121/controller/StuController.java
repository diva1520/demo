package com.example.deplordemo121.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StuController {
	
	
	@GetMapping("/gi")
	public String hi() {
		return "hii da dei";
	}

}
