/*package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.Order;
import com.mouritech.onlinefooddeliveryapplication.exception.OrderNotFound;
import com.mouritech.onlinefooddeliveryapplication.repository.OrderRepository;
import com.mouritech.onlinefooddeliveryapplication.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
	public Order saveOrder(Order order) {
		
		order.setOrderId(generateOrderId());
		return orderRepository.save(order);
	}


	public int generateOrderId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	        //generate random values from 0-254
	      int cId = (int) rand.nextInt(upperbound);
		return cId; 
	
	}
	
	@Override
	public List<Order> getAllOrders() {
		return  orderRepository.findAll();
	}

	@Override
	public  ResponseEntity<Order> updateOrders(int orderId) throws OrderNotFound {
		  Order order = orderRepository.findByOrderId(orderId)
        .orElseThrow(() -> new OrderNotFound("Order not found for this id :: " + orderId));

		
		     
		        order.setOrderStatus(order.getOrderStatus());
			        final Order updatedOrder = orderRepository.save(order);
			        return ResponseEntity.ok(updatedOrder);

	}


	@Override
	public ResponseEntity<?> deleteOrder(int orderId) throws OrderNotFound {
		
		return orderRepository.findByOrderId(orderId).map(order -> {
			orderRepository.delete(order);
		return ResponseEntity.ok().build();
		}).orElseThrow(()->new OrderNotFound("order not found"));
	}


	@Override
	public ResponseEntity<Order> getOrderById(int orderId) throws OrderNotFound {
		 Order order = orderRepository.findByOrderId(orderId)
		        .orElseThrow(() -> new OrderNotFound("order not found for this id :: " + orderId));
		      return ResponseEntity.ok().body(order);
	}

}
*/