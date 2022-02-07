package com.onlinefooddeliveryapp.service;

import java.util.List;

import com.onlinefooddeliveryapp.entity.Order;
import com.onlinefooddeliveryapp.repository.OrderRepository;

public class OrderService {
	ItemRepository orderRepository = new orderRepository();
public List<Order> getAllOrder() {
		
		return orderRepository.getAllOrder();
	}

	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.addOrder(order);
	}

	public String removeorder(String orderid) {
		// TODO Auto-generated method stub
		return orderRepository.removeOrder(orderid);
	}

	public Order updatetem(String orderid,Item order) {
		// TODO Auto-generated method stub
		return orderRepository.updateOrder(orderid,order);
	}

	public Order getOrderById(String orderid) {
		// TODO Auto-generated method stub
		return orderRepository.getOrderById(orderid);
	}
}
