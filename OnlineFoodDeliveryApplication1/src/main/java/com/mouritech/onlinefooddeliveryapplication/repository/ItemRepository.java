package com.mouritech.onlinefooddeliveryapplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.Item;

@Repository
public  interface ItemRepository extends JpaRepository<Item, Long> {
	//Optional<Item> findByItemId(String itemId);
	//List<Item> findByItemName(String itemId);
	}
