package com.mouritech.onlinefooddeliveryapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.mouritech.onlinefooddeliveryapplication.dto.ItemDto;
import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantDto;
import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;
import com.mouritech.onlinefooddeliveryapplication.service.ItemService;
import com.mouritech.onlinefooddeliveryapplication.service.RestaurantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/addrestaurantinfo")
	public ResponseEntity<?>addRestaurantInformation(@RequestBody Restaurant restaurant)
	{
		restaurantService.addRestaurantInformation(restaurant);
		
		return ResponseEntity.ok().body("all restaurant information inserted");
		
		
	}
	
	@GetMapping("/getrestaurantbyemaiandpassword/{restaurantEmail}/{restaurantPassword}")
	public ResponseEntity<?> findRestaurantByEmailAndPassword(@PathVariable(value = "restaurantEmail") String restaurantEmail,
			@PathVariable(value ="restaurantPassword") String restaurantPassword){
		
		boolean result = restaurantService.findRestaurantByEmailAndPassword(restaurantEmail,restaurantPassword);
		if(result==true) {
			return ResponseEntity.ok().body("login successful");
		}
	
		else {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resourse not found please sign in first");
			
		}
		
	}
	@PutMapping("/updaterestaurantinfobyname")
	public ResponseEntity<?>updaterestaurantinfobyname(@RequestBody Restaurant restaurant){
		
		ResponseEntity<?> result = restaurantService.updaterestaurantinfobyname(restaurant);
		return result;
	}
	
@GetMapping("/getrestaurantbyemailandpasswordcheck")
public ResponseEntity<?>checkRestauramtEmailAndPassword(@RequestBody RestaurantDto restaurantDto){
	if(restaurantDto==null) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please Enter Email and password");
	}
	else {
		
		ResponseEntity<?> ckeckLogin = restaurantService.checkRestauramtEmailAndPassword(restaurantDto);
		return ckeckLogin;
		
	}
	
}

@PostMapping("/insertitemsByrestaurantemaiandpassword")
public ResponseEntity<?>insertItems(@RequestBody RestaurantItemsDto restaurantItemsDto){
	
	if(restaurantItemsDto==null) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please Enter Email and password, items");
	}
	else {
		
		ResponseEntity<?> itemsInsert = restaurantService.insertItems(restaurantItemsDto);
		return itemsInsert;
		
	}

}

//Adding  restaurant details using entity class
@PostMapping("/add")
public  Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
	
	Restaurant newRestaurant = restaurantService.addRestaurant(restaurant);
	
	return newRestaurant;
}

@GetMapping("/getAll")
public List<Restaurant> getAllRestaurant(){
	List<Restaurant> listRest = restaurantService.getAllRestaurant();
	return listRest;
}

@GetMapping("/getByRestaurantId/{restaurantId}")
public Restaurant getRestaurantById(@PathVariable(value = "restaurantId") Long restaurantId) throws RestaurantNotFound {
	
	return restaurantService.getById(restaurantId);
}

@PutMapping("/updateRestaurant/{restaurantId}")
public Restaurant updateRestaurantById(@PathVariable(value = "restaurantId") Long restaurantId,@RequestBody Restaurant restaurant) throws RestaurantNotFound {
	
	return restaurantService.updateRestaurantById(restaurantId,restaurant);
}

@DeleteMapping("/deleteRestaurant/{restaurantId}")
public Restaurant deleteRestaurant(@PathVariable(value = "restaurantId") Long restaurantId) throws RestaurantNotFound {
	return restaurantService.deleteRestaurant(restaurantId);
}

@PostMapping("/addItems/{restaurantId}")
public Item addItems(@PathVariable Long restaurantId,@RequestBody Item item) throws RestaurantNotFound {
	return itemService.addItems(restaurantId,item);
}

}