package com.green.nowon.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.green.nowon.entity.ItemEntity;
import com.green.nowon.entity.ItemListImg;
import com.green.nowon.utils.FileUtils;

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
	
	private String[] newName;//이미지는 따로 받는다 ?
	private String[] orgName;//이미지는 따로 받는다 ?
	
	public List<ItemListImg> toItemListImgs(ItemEntity item,String url) {
		List<ItemListImg> imgs= new ArrayList<>();
		for(int i=0; i<orgName.length; i++) {
			if(orgName[i].equals("") || orgName[i]==null)continue;
			
			boolean defImg =false;
			if(i==0)defImg=true;
			
			   ItemListImg ent=ItemListImg.builder()
		               .url(url)
		               .orgName(orgName[i])
		               .newName(newName[i])
		               .defImg(defImg)
		               .item(item) //fk 설정을 위한 
		               .build();      
		         imgs.add(ent);
		}
		  FileUtils.MoveUploadLocationFromTemp(newName, url);
	      return imgs;

	}
	
	
	
	
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

