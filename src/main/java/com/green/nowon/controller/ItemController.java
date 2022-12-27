package com.green.nowon.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.green.nowon.dto.AdminGoodsListDTO;
import com.green.nowon.dto.ItemInsertDTO;
import com.green.nowon.entity.ItemEntity;
import com.green.nowon.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService service;
	
	//item 저장 
	@PostMapping("/admin/goods")
	public String goodsReg(ItemInsertDTO itemDto) {
		service.saveItem(itemDto);
		return "redirect:/admin/goods";		
	}
	
	//파일업로드
	@ResponseBody
	@PostMapping("/admin/temp-upload") //file업로드
	public  Map<String,String> tempUpload(MultipartFile gimg) {
		System.out.println("원본사진이름>>>>>>>" + gimg.getOriginalFilename());
		return service.fileTempUpload(gimg);
	}
	
	
	//item 리스트 담은
	@GetMapping("/admin/goods")
	public String goodsList(Model model) {
		service.adminGoodsListShow(model);
		return "admin/adminGoodsList";
	}
	
	@GetMapping("/admin/goods/{ino}")
	public String goodsDetail(@PathVariable long ino, Model model) {
		service.adminGoodsDetail(ino, model);
		return "admin/adminGoods";
	}
	
	@GetMapping("/admin/goods/reg")
	public String goodsRegPage() {
		return "admin/adminGoodsReg";
	}
	
}
