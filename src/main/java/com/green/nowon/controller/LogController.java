package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogController {

	@GetMapping("/login")
	public String login() {
		return "log/login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "log/signup";
	}
	
}
