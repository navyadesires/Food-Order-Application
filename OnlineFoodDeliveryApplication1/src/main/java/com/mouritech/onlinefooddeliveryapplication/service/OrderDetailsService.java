/*package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;
import com.mouritech.onlinefooddeliveryapplication.exception.OrderDetailsNotFoundException;

public interface OrderDetailsService {

	OrderDetails insertOrderDetails(String orderId, @Valid OrderDetails newOrderDetails) throws OrderDetailsNotFoundException;

	List<OrderDetails> findByOrder_OrderId(String orderId);

	ResponseEntity<?> deleteOrderDetails(String orderId)  throws OrderDetailsNotFoundException ;

	

	ResponseEntity<OrderDetails> updateOrderDetails(Long orderDetailsId, @Valid OrderDetails orderDetails) throws OrderDetailsNotFoundException;

}*/