/*package com.mouritech.onlinefooddeliveryapplication.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.mouritech.onlinefooddeliveryapplication.entity.ItemImage;
import com.mouritech.onlinefooddeliveryapplication.exception.ItemNotFoundException;

public interface ItemImageService {

	Optional<ItemImage> addImage(String itemId, MultipartFile file) throws ItemNotFoundException, IOException;

	ItemImage getImageByItemId(String itemId);

	List<ItemImage> getAllImages();

	Optional<Object> updateImage(String itemId, MultipartFile file) throws IOException;

	ResponseEntity<?> deleteImage(String itemId, Long imageId) throws ItemNotFoundException;

}
*/