package com.green.nowon.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;

import com.green.nowon.entity.ItemEntity;

import lombok.Data;

@Data
public class AdminGoodsListDTO {
	
	private long ino;
	private String title;
	private long price;
	private int stock;
	private String detail;
	private String category;
	private LocalDateTime createdDate;
	
	//이미지 대표이미지
	private String defImgUrl;

	
	public AdminGoodsListDTO(ItemEntity e) {
		this.ino = e.getIno();
		this.title = e.getTitle();
		this.price = e.getPrice();
		this.detail = e.getDetail();
		this.stock = e.getStock();
		this.category = e.getCategory();
		this.createdDate=e.getCreatedDate();
		this.defImgUrl = e.defImg().getUrl()+e.defImg().getNewName();
	}
	
	
}
