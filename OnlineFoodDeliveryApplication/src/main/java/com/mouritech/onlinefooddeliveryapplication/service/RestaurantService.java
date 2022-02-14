package com.mouritech.onlinefooddeliveryapplication.service;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;

public interface RestaurantService {

	void addRestaurantInformation(Restaurant restaurant);

	boolean findRestaurantByNameAndPassword(String restaurantName, String restaurantPassword);

	ResponseEntity<?> updaterestaurantinfobyname(Restaurant restaurant);

}