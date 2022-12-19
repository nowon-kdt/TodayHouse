package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopBasketControlloer {

	//장바구니사이트로 이동
	@GetMapping("/shoppingbascket")
	public String bascket() {
		return "shop/bascket/bascket";
	}
	
	
}
