package com.mouritech.onlinefooddeliveryapplication.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long> {
	
	OrderDetails findByRestaurantName(String restaurantName);

	
	OrderDetails findByRestaurantEmail(String restaurantEmail);

	OrderDetails findByRestaurantPassword(String restaurantPassword);

}







	
