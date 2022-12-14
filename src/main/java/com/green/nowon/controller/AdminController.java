package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin")
	public String admin() {
		return "admin/default";
	}
	
	@GetMapping("/admin/main1")
	public String main1() {
		return "admin/adminMain1";
	}
	
	@GetMapping("/admin/main2")
	public String main2() {
		return "admin/adminMain2";
	}
	
	@GetMapping("/admin/main3")
	public String main3() {
		return "admin/adminMain3";
	}
	
	@GetMapping("/admin/order")
	public String order() {
		return "admin/adminOrder";
	}
	
	@GetMapping("/admin/order/reg")
	public String reg() {
		return "admin/adminOrderReg";
	}
	
	@GetMapping("/admin/goodsList")
	public String goodsList() {
		return "admin/adminGoods";
	}
	
	@GetMapping("/admin/goodsList/reg")
	public String goodsListReg() {
		return "admin/adminGoodsReg";
	}
	
	@GetMapping("/admin/request")
	public String request() {
		return "admin/adminRequest";
	}
	
	@GetMapping("/admin/review")
	public String review() {
		return "admin/adminReview";
	}
	
	@GetMapping("/admin/interior")
	public String interior() {
		return "admin/adminInterior";
	}
	
	@GetMapping("/admin/member")
	public String member() {
		return "admin/adminMember";
	}

}
