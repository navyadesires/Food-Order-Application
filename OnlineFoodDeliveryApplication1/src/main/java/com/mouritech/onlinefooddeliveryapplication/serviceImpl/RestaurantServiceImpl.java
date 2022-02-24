package com.mouritech.onlinefooddeliveryapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantDto;
import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.mapper.RestaurantItemsMapper;
import com.mouritech.onlinefooddeliveryapplication.mapper.RestaurantMapper;
import com.mouritech.onlinefooddeliveryapplication.repository.ItemRepository;
import com.mouritech.onlinefooddeliveryapplication.repository.RestaurantRepository;
import com.mouritech.onlinefooddeliveryapplication.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	ItemRepository itemsRepository;

@Autowired
RestaurantMapper restaurantMapper;

@Autowired
RestaurantItemsMapper restaurantItemsMapper;

	@Override
	public void addRestaurantInformation(Restaurant restaurant) {
		
		restaurantRepository.save(restaurant);
		
	}

	@Override
	public ResponseEntity<?> updaterestaurantinfobyname(Restaurant restaurant) {
		
		Restaurant rest = restaurantRepository.findByRestaurantName(restaurant.getRestaurantName());
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
	public ResponseEntity<?> checkRestauramtEmailAndPassword(RestaurantDto restaurantDto) {
	// Restaurant restaurant = restaurantMapper.convertDtoToEntity(restaurantDto);
	 Restaurant checkEmailExisting = restaurantRepository.findByRestaurantEmail(restaurantDto.getRestaurantEmail());
	 Restaurant checkpasswordExisting = restaurantRepository.findByRestaurantPassword(restaurantDto.getRestaurantPassword());
	 
	 if(checkEmailExisting==null) {
		 
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This email is not present in data base please check email or go to sign in");
		 
	 }
	 else if (checkpasswordExisting==null) {
		
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("password doesnt match");
	}
	
	 else {
		 return ResponseEntity.ok().body("login successful");
	 }
		
	}

	@Override
	public ResponseEntity<?> insertItems(RestaurantItemsDto restaurantItemsDto) {
		
		 Restaurant checkEmailExisting = restaurantRepository.findByRestaurantEmail(restaurantItemsDto.getRestaurantEmail());
	/*	 checkEmailExisting.setItems(null);*/
		 
		 
		 Restaurant checkpasswordExisting = restaurantRepository.findByRestaurantPassword(restaurantItemsDto.getRestaurantPassword());
		if(checkEmailExisting != null)
		 checkEmailExisting.setRestaurantId(checkpasswordExisting.getRestaurantId());
		
		 if(checkEmailExisting==null) {
			 
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This email is not present in data base please check email or go to sign in");
			 
		 }
		 else if (checkpasswordExisting==null) {
			
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("password doesnt match");
		}
		
		 else {
			 
			 Restaurant restaurant = restaurantItemsMapper.convertDtoToEntity(restaurantItemsDto);
			 
			 checkEmailExisting.setItem(restaurant.getItem());
			 
		
			 itemsRepository.saveAll(checkEmailExisting.getItem());
			 return ResponseEntity.ok().body("items inserted");
		 }
		
	}

}