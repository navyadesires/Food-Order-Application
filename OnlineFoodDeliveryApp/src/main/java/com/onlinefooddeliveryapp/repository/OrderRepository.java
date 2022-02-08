package com.onlinefooddeliveryapp.repository;

import java.util.List;

import com.onlinefooddeliveryapp.entity.Order;
import com.onlinefooddeliveryapp.repository.OrderRepository;

public class OrderRepository {
	OrderRepository orderRepository = new OrderRepository();
	public List<Order> getAllOrder() {
			
			return orderRepository.getAllOrder();
		}

		public Order addOrder(Order order) {
			// TODO Auto-generated method stub
			return orderRepository.addOrder(order);
		}

		public int removeOrder(int orderid) {
			// TODO Auto-generated method stub
			return orderRepository.removeOrder(orderid);
		}

		public Order updateOrder(int orderid,Order order) {
			// TODO Auto-generated method stub
			return orderRepository.updateOrder(orderid,order);
		}

		public Order getOrderById(int orderid) {
			// TODO Auto-generated method stub
			return orderRepository.getOrderById(orderid);
		}
}
