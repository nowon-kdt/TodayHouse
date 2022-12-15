package com.green.nowon.domain.dto;

import java.time.LocalDateTime;

import com.green.nowon.domain.entity.ItemEntity;

import lombok.Setter;

@Setter
public class ItemInsertDTO {

	private long ino;
	private String title;
	private String detail;
	private long price;
	private int stock;
	private String category;
	private LocalDateTime createdDate;
	
	public ItemEntity toItemEntity() {
		return ItemEntity.builder()
				.ino(ino)
				.title(title)
				.detail(detail)
				.price(price)
				.stock(stock)
				.category(category)
				.createdDate(createdDate)
				.build();
	}

}
