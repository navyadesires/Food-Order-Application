package com.mouritech.onlinefooddeliveryapplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;
import com.mouritech.onlinefooddeliveryapplication.exception.OrderNotFound;


@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

	
	OrderDetails saveOrder(OrderDetails order);

	List<OrderDetails> getAllOrders();

	ResponseEntity<OrderDetails> updateOrders(int orderId, OrderDetails orderDetails) throws OrderNotFound;

	ResponseEntity<?> deleteOrder(int orderId) throws OrderNotFound ;

	ResponseEntity<OrderDetails> getOrderById(int orderId) throws OrderNotFound;
    
	
}