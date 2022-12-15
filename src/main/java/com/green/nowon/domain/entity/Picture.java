package com.green.nowon.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Picture {
	
	@Id
	private int pno;
	
	@Column
	private String url;
	
	@Column
	private String name;
	
	@Column
	private int size;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private ItemEntity item;

}
