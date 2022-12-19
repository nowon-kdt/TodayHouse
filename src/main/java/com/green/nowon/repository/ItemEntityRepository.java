package com.green.nowon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.green.nowon.entity.ItemEntity;

@Repository
public interface ItemEntityRepository extends JpaRepository<ItemEntity, Long>{

}
