package com.example.deplordemo121.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StuController {
	//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
	
	@GetMapping("/gi")
	public String hi() {
		return "hii da dei";
	}

}
