package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WriteController {
	
	//글쓰기 페이지로이동 
	@GetMapping("/write")
	public String write() {
		return "write/writing";
	}
}
