package com.mouritech.onlinefooddeliveryapplication.controller;


import java.util.List;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;
import com.mouritech.onlinefooddeliveryapplication.service.ItemService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/items")
public class ItemsController {
	//@Resource(name = "itemService")
	@Autowired
	private ItemService itemService;
	
	
	//@PostMapping("/add")
	//public Item addItems(@RequestBody Item items) {
		//Item itemsAdded = itemService.addItems(items);
		//return itemsAdded;
	//}

	@PostMapping("/addByRestaurantId/{restaurantId}")
	public Item addItems(@PathVariable(value = "restaurantId") Long restaurantId,@RequestBody Item items) throws RestaurantNotFound {
		return itemService.addItems(restaurantId,items);
	}
	
	@PutMapping("/update")
	public Item updateItems(@RequestBody Item items) throws RestaurantNotFound {
		return itemService.updateItems(items);
	}
	
	@PutMapping("/updateById/{itemId}")
	public Item updateById(@PathVariable(value = "itemId") Long itemId,@RequestBody Item items) throws RestaurantNotFound {
		return itemService.updateById(items,itemId);
	}
	
	@DeleteMapping("/deleteById/{itemId}")
	public Item deleteById(@PathVariable(value = "itemId") Long itemId) throws RestaurantNotFound {
		return itemService.deleteById(itemId);
	}
	
//	@DeleteMapping("/deleteByName/{itemName}")
//	public Item deleteByName(@PathVariable(value = "itemName") String itemName) throws RestaurantNotFound {
//		return itemService.deleteByName(itemName);
//	}
	
	@GetMapping("/getAll")
	public List<Item> getAll(){
		return itemService.getAllItems();
	}
	
//	@GetMapping("/getAll/{restaurantName}")
//	public List<Item> getAll(){
//		return itemService.getAllItems();
//	}
	
	@GetMapping("/getItems/{restaurantName}")
    public List<Item> getItemsByRestaurantName(@PathVariable(value = "restaurantName") String restaurantName){

        return itemService.getItemsByRestaurantName(restaurantName);
    }
	
	@GetMapping("/getByItemId/{itemId}")
	public Item getById(@PathVariable(value = "itemId") Long itemId) throws RestaurantNotFound{
		return itemService.findById(itemId);
	}
	
	@PostMapping("addItems/{restaurantName}")
	public Item AddItemsByRestName(@PathVariable(value = "restaurantName") String restaurantName,@RequestBody Item items) {
		return itemService.AddItemsByRestName(restaurantName,items);
	}
	
//	@DeleteMapping("deleteItems/{restaurantName}")
//	public Item deleteItemsByRestName(@PathVariable(value = "restaurantName") String restaurantName,@RequestBody Item items) {
//		return itemService.deleteItemsByRestName(restaurantName,items);
//	}
}