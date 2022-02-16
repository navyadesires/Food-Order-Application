package com.mouritech.onlinefooddeliveryapplication.service;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantDto;
import com.mouritech.onlinefooddeliveryapplication.dto.RestaurantItemsDto;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;

public interface RestaurantService {

	void addRestaurantInformation(Restaurant restaurant);

	ResponseEntity<?> updaterestaurantinfobyname(Restaurant restaurant);

	boolean findRestaurantByEmailAndPassword(String restaurantEmail, String restaurantPassword);

	ResponseEntity<?> checkRestauramtEmailAndPassword(RestaurantDto restaurantDto);

	ResponseEntity<?> insertItems(RestaurantItemsDto restaurantItemsDto);

}