package com.green.nowon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.green.nowon.entity.ItemListImg;

@Repository
public interface ItemListImgRepository extends JpaRepository<ItemListImg, Long> {

}
