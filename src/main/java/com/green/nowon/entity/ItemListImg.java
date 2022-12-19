package com.green.nowon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name ="TH_ItemListImg")
@Entity
public class ItemListImg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long no;
	private String newName;
	private String orgName;
	private String url;
	private boolean defImg;
	
	
	@JoinColumn
	@ManyToOne
	private ItemEntity item;

}