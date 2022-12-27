package com.green.nowon.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.green.nowon.dto.AdminGoodsDetailDTO;
import com.green.nowon.dto.AdminGoodsListDTO;
import com.green.nowon.dto.ItemInsertDTO;
import com.green.nowon.entity.ItemEntity;
import com.green.nowon.repository.ItemEntityRepository;
import com.green.nowon.repository.ItemListImgRepository;
import com.green.nowon.service.ItemService;
import com.green.nowon.utils.FileUtils;

@Service
public class ItemServiceProcess implements ItemService {

	@Autowired
	private ItemEntityRepository itemRepo;
	
	@Autowired
	private ItemListImgRepository itemListImgRepository;
	
	@Value("${file.location.upload}")
	private String locationUpload;
	
	@Value("${file.location.temp}")
	private String locationTemp; 
	
	@Override
	public void saveItem(ItemInsertDTO itemDto) {
	  ItemEntity entity = itemRepo.save(itemDto.toItemEntity());

	 itemDto.toItemListImgs(entity, locationUpload).forEach(itemListImgRepository::save);	
	
	}

	@Override
	public Map<String, String> fileTempUpload(MultipartFile gimg) {
		return FileUtils.fileUpload(gimg, locationTemp);
	}

	@Transactional
	@Override
	public void adminGoodsListShow(Model model) {
		
		model.addAttribute("items", itemRepo.findAll().stream().map(AdminGoodsListDTO::new)
				.collect(Collectors.toList()));
	
	}

	@Transactional
	@Override
	public void adminGoodsDetail(long ino, Model model) {
		model.addAttribute("detail", itemRepo.findById(ino)
				.map(AdminGoodsDetailDTO::new)
				.orElseThrow());
	}

	
}
