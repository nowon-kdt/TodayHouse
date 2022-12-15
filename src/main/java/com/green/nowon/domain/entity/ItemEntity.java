package com.green.nowon.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
	
	

}




