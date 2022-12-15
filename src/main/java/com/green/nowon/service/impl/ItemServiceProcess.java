package com.green.nowon.service.impl;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.nowon.domain.dto.ItemInsertDTO;
import com.green.nowon.domain.entity.ItemEntity;
import com.green.nowon.domain.entity.ItemRepository;
import com.green.nowon.service.ItemService;

@Service
public class ItemServiceProcess implements ItemService{
	
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public void saveItem(ItemInsertDTO itemDto) {
		
		itemRepo.save(itemDto.toItemEntity());		
	}

	@Override
	public List<ItemEntity> getList() {
		return itemRepo.findAll();
	}
	
	

}
