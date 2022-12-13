package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

	//스토어로 이동
	@GetMapping("/store")
	public String storemove() {
		return "store/store";
	}
	
	@GetMapping("/detail")
	public String detail() {
		return "store/detail";
	}
	
	
}
