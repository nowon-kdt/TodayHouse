package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CashController {

	@GetMapping("/cashlist")
	public String bascket() {
		return "shop/cash/cashlist";
	}
}
