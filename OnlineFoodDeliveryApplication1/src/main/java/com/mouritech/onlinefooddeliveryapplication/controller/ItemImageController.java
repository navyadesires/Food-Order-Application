/*package com.mouritech.onlinefooddeliveryapplication.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.mouritech.onlinefooddeliveryapplication.entity.ItemImage;
import com.mouritech.onlinefooddeliveryapplication.exception.ItemNotFoundException;
import com.mouritech.onlinefooddeliveryapplication.service.ItemImageService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/itemimage/")
public class ItemImageController {

    @Autowired
    private ItemImageService itemimageService;
    
  //add image for corresponding item
  	@PostMapping("/menu/{itemId}/itemImages")
  	public Optional<ItemImage> addImage(@PathVariable(value = "itemId") String itemId,
  			@RequestParam("itemImage") MultipartFile file) throws IOException{
  		
  		return itemimageService.addImage(itemId,file);
  		
  	}
    
    

  	//get corresponding image for item id
  	@GetMapping("/menu/{itemId}/itemImages")
  	public ItemImage getImageByItemId(@PathVariable(value = "itemId") String itemId)
  	{
  		return itemimageService.getImageByItemId(itemId);
  	}

  	//get all images
  	@GetMapping("/menu/images")
  	public List<ItemImage> getAllImages()
  	{
  		
  		return itemimageService.getAllImages();
  		
  	}
  	
  	//update responding image by itemId
  	@PutMapping("/menu/{itemId}/itemImages")
  	public Optional<Object> updateImage(@PathVariable(value = "itemId") String itemId,
  			@RequestParam("itemImage") MultipartFile file) throws IOException
  	{
  	 return itemimageService.updateImage(itemId,file);
  		
  		
  	}
  	
  	//delete image for corresponding itemId
  	@DeleteMapping("/menu/{itemId}/itemImages/{imageId}")
      public ResponseEntity<?> deleteImage(@PathVariable(value = "itemId") String itemId, @PathVariable(value = "imageId") Long imageId)
           throws ItemNotFoundException {
  	
  		return itemimageService.deleteImage(itemId,imageId);
        
  	}
  	
 
    
}*/
