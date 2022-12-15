package com.green.nowon.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.green.nowon.domain.dto.ItemInsertDTO;
import com.green.nowon.domain.entity.ItemEntity;

public interface ItemService {

	void saveItem(ItemInsertDTO itemDto);

	List<ItemEntity> getList();

	

}
