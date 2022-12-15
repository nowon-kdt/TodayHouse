package com.green.nowon.controller;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.nowon.domain.dto.ItemInsertDTO;
import com.green.nowon.domain.entity.ItemEntity;
import com.green.nowon.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService service;
	
	@PostMapping("/admin/goods")
	public String goodsReg(ItemInsertDTO itemDto) {
		service.saveItem(itemDto);
		return "redirect:/admin/goods";		
	}
	
	@GetMapping("/admin/goods")
	public String goodsList(Model model) {
		List<ItemEntity> items = service.getList();
		model.addAttribute("items",items);
		return "admin/adminGoodsList";
	}
	
	@GetMapping("/admin/goods/gno")
	public String goodsDetail() {
		return "admin/adminGoods";
	}
	
	@GetMapping("/admin/goods/reg")
	public String goodsRegPage() {
		return "admin/adminGoodsReg";
	}

}
