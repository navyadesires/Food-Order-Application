/*package com.mouritech.onlinefooddeliveryapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.ItemImage;

@Repository
public interface ItemImageRepository extends JpaRepository<ItemImage, Long> {



	Optional<ItemImage> findByItem_ItemId(String itemId);

	Optional<ItemImage> findByImageIdAndItem_ItemId(Long imageId, String itemId);

	
}*/