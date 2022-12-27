package com.green.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.green.nowon.service.ItemService;

@Controller
public class StoreController {

	@Autowired
	private ItemService service;
	
	//스토어로 이동
	@GetMapping("/store")
	public String storemove(Model model) {
		service.adminGoodsListShow(model);
		return "store/store";
	}
	
	@GetMapping("/detail/goods/{ino}")
	public String detail(@PathVariable long ino, Model model) {
		service.adminGoodsDetail(ino, model);
		return "store/detail";
	}
	
	
}
