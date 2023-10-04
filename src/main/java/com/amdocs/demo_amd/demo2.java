package com.amdocs.demo_amd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo2 {
	@GetMapping("/in")
	public String show() {
		return "Welcome to Amdocs";
	}
}
