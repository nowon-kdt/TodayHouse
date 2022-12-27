package com.green.nowon.dto;

import com.green.nowon.entity.ItemListImg;

import lombok.Getter;

@Getter
public class ItemDetailImgDTO {
	
	private long no;
	private String newName;
	private String orgName;
	private String url;
	private boolean defImg;
	
	//편의필드
	private String imgUrl;

	public ItemDetailImgDTO(ItemListImg e) {
		this.no = e.getNo();
		this.newName = e.getNewName();
		this.orgName = e.getOrgName();
		this.url = e.getUrl();
		this.defImg = e.isDefImg();
		
		this.imgUrl = url+newName;
	}
	
	

}
