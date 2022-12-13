package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeMainController {
	
	//main2 더보기 입력시 이동
	@GetMapping("/main2-more")
	public String moremove() {
		return "moredetail/main2-more";
	}
	
	//노하우 정보 글페이지로 이동
	@GetMapping("/main2-detail")
	public String detailmove() {
		return "moredetail/main2-detail";
	}
	
	
}
