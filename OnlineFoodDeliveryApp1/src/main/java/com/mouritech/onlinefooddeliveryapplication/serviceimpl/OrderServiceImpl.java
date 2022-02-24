package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;
import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.exception.OrderNotFound;
import com.mouritech.onlinefooddeliveryapplication.repository.OrderRepository;
import com.mouritech.onlinefooddeliveryapplication.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	public OrderDetails saveOrder(OrderDetails orderDetails) {
		
		orderDetails.setOrderId(generateOrderId());
		return orderRepository.save(orderDetails);
	}


	public int generateOrderId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	        //generate random values from 0-254
	      int cId = (int) rand.nextInt(upperbound);
		return cId; 
	
	}
	
	@Override
	public List<OrderDetails> getAllOrders() {
		return  orderRepository.findAll();
	}


	@Override
	public  ResponseEntity<OrderDetails> updateOrders(int orderId) throws OrderNotFound {
		  OrderDetails order = orderRepository.findById(orderId)
        .orElseThrow(() -> new OrderNotFound("Order not found for this id :: " + orderId));

		
		 
		        order.setOrderStatus(order.getOrderStatus());
			        final OrderDetails updatedOrder = orderRepository.save(order);
			        return ResponseEntity.ok(updatedOrder);

	}


	@Override
	public ResponseEntity<?> removeOrder(int orderId) throws OrderNotFound {
		
		return orderRepository.findById(orderId).map(order -> {
			orderRepository.delete(order);
		return ResponseEntity.ok().build();
		}).orElseThrow(()->new OrderNotFound("order not found"));
	}


	@Override
	public ResponseEntity<OrderDetails> getOrderById(int orderId) throws OrderNotFound {
		OrderDetails order = orderRepository.findById(orderId)
		        .orElseThrow(() -> new OrderNotFound("order not found for this id :: " + orderId));
		      return ResponseEntity.ok().body(order);
	}


	

}
