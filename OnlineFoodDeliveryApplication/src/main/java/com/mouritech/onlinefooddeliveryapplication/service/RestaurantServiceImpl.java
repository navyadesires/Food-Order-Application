	/*package com.mouritech.onlinefooddeliveryapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public void addRestaurantInformation(Restaurant restaurant) {
		
		restaurantRepository.save(restaurant);
		
	}

	@Override
	public boolean findRestaurantByEmailAndPassword(String restaurantEmail, String restaurantPassword) {
		boolean flag =false;
		
		Restaurant restaurant = restaurantRepository.findByRestaurantEmailAndRestaurantPassword(restaurantEmail,restaurantPassword);
		if(restaurant==null) {
			return flag;
		}
		else {
			return flag=true;
		}

	}

@Override
	public ResponseEntity<?> updaterestaurantinfobyemail(Restaurant restaurant) {
		
		//Restaurant rest = restaurantRepository.findByRestaurantEmail(restaurant.getRestaurantEmail());
		if(rest==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resourse not you cant update");
		}
		else {
			rest.setRestaurantName(restaurant.getRestaurantName());
			rest.setRestaurantPassword(restaurant.getRestaurantPassword());
			rest.setRestaurantCity(restaurant.getRestaurantCity());
			rest.setRestaurantState(restaurant.getRestaurantState());
			rest.setRestaurantcountry(restaurant.getRestaurantcountry());
			rest.setRestaurantPincode(restaurant.getRestaurantPincode());
			rest.setRestaurantManagerFirstName(restaurant.getRestaurantManagerFirstName());
			rest.setRestaurantManagerLastName(restaurant.getRestaurantManagerLastName());
			rest.setRestaurantManagerNumber(restaurant.getRestaurantManagerNumber());
			rest.setRestaurantManagerEmail(restaurant.getRestaurantManagerEmail());
			
			final Restaurant restaurantfinal = restaurantRepository.save(rest);
			
			 return ResponseEntity.ok(restaurantfinal);
		}
}
}*/