package com.mouritech.onlinefooddeliveryapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

	Restaurant findByRestaurantName(String restaurantName);

	Restaurant findByRestaurantEmailAndRestaurantPassword(String restaurantEmail, String restaurantPassword);

	Restaurant findByRestaurantEmail(String restaurantEmail);

	Restaurant findByRestaurantPassword(String restaurantPassword);

}
