package com.mouritech.onlinefooddeliveryapplication.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.service.RestaurantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping("/addrestaurantinfo")
	public ResponseEntity<?>addRestaurantInformation(@RequestBody Restaurant restaurant)
	{
		restaurantService.addRestaurantInformation(restaurant);
		
		return ResponseEntity.ok().body("all restaurant information inserted");
		
		
	}
	
	@PostMapping("/getrestaurantbyidandpassword/{restaurantName}/{restaurantPassword}")
	public ResponseEntity<?> findRestaurantByNameAndPassword(@PathVariable(value = "restaurantName") String restaurantName,
			@PathVariable(value ="restaurantPassword") String restaurantPassword){
		
		boolean result = restaurantService.findRestaurantByNameAndPassword(restaurantName,restaurantPassword);
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
	


}