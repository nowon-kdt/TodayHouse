package com.green.nowon.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name="TH_itemEntity")
@Entity
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private long ino;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String detail;
	
	@Column(nullable = false)
	private long price;
	
	@Column(nullable = false)
	private int stock;
	
	@Column(nullable = false)
	private String category;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime createdDate;
	
	@Builder.Default
	@OneToMany(mappedBy = "item")//mappedBy = @ManyToOne적용된 필드이름
	private List<ItemListImg> imgs=new ArrayList<>();
	
	
	public ItemListImg defImg() {
		for(ItemListImg img:imgs) {
			if(img.isDefImg()) return img;
				
		}
		return imgs.get(0);//만약에 대표이지미지 없으면 첫번째이미지로
	}
	
	
	

}
