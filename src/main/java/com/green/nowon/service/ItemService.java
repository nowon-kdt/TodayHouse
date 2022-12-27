package com.green.nowon.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.green.nowon.dto.AdminGoodsListDTO;
import com.green.nowon.dto.ItemInsertDTO;
import com.green.nowon.entity.ItemEntity;

public interface ItemService {

	void saveItem(ItemInsertDTO itemDto);

	Map<String, String> fileTempUpload(MultipartFile gimg);

	void adminGoodsListShow(Model model);

	void adminGoodsDetail(long ino, Model model);


}
