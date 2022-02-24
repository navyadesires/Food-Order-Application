/*package com.mouritech.onlinefooddeliveryapplication.controller;


import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.mouritech.onlinefooddeliveryapplication.exception.ItemNotFoundException;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;

import com.mouritech.onlinefooddeliveryapplication.service.ItemService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Items/")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@PostMapping("item")
	public Item insertItem(Item newitem) throws IOException {
		
		return itemService.insertItem(newitem);
		
	}
	
	@GetMapping("item")
	public List<Item> showAllItems(){
		return itemService.showAllItems();
		
	}
	
	@GetMapping("item/{pid}")
	public Item showItemById(@PathVariable("iid") String itemId) throws ItemNotFoundException{
		return itemService.showItemById(itemId);
		
	}
	
	@PutMapping("item/{pid}")
	public Item updateItemById(@PathVariable("iid") String itemId,@RequestBody Item item) throws ItemNotFoundException{
		return itemService.updateItemById(itemId,item);
		
	}
	
	@DeleteMapping("item/{pid}")
	public String deleteItemById(@PathVariable("iid") String itemId) throws ItemNotFoundException{
		itemService.deleteItemById(itemId);
		 return "deleted the item";
		
	}
	
}
	*/
	
	