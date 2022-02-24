package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantDto;
import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;

public interface RestaurantService {

	void addRestaurantInformation(Restaurant restaurant);

	ResponseEntity<?> updaterestaurantinfobyname(Restaurant restaurant);

	boolean findRestaurantByEmailAndPassword(String restaurantEmail, String restaurantPassword);

	ResponseEntity<?> checkRestauramtEmailAndPassword(RestaurantDto restaurantDto);

	ResponseEntity<?> insertItems(RestaurantItemsDto restaurantItemsDto);
	
	Restaurant addRestaurant(Restaurant restaurant);

	List<Restaurant> getAllRestaurant();

	Restaurant getById(Long restaurantId) throws RestaurantNotFound;

	Restaurant updateRestaurantById(Long restaurantId, Restaurant restaurant) throws RestaurantNotFound;

	Restaurant deleteRestaurant(Long restaurantId) throws RestaurantNotFound;

	Restaurant AddItems(Long restaurantId, Restaurant restaurant) throws RestaurantNotFound;

}