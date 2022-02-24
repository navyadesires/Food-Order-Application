package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;
import com.mouritech.onlinefooddeliveryapplication.exception.OrderNotFound;


public interface OrderService {
	
	public OrderDetails saveOrder(OrderDetails orderDetails);
	public int generateOrderId();
	public List<OrderDetails> getAllOrders();
	ResponseEntity<OrderDetails> updateOrders(int orderId) throws OrderNotFound;
	ResponseEntity<?> removeOrder(int orderId) throws OrderNotFound;
	ResponseEntity<OrderDetails> getOrderById(int orderId) throws OrderNotFound;

/*
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(OrderDetails order);
	public OrderDetails viewOrder(OrderDetails order);
    public List<OrderDetails> viewAllOrders(Restaurant res);
    public List<OrderDetails> viewAllOrders(Customer customer);
	ResponseEntity<?> removeOrder(int orderId) throws OrderNotFound;
	
	OrderDetails saveOrderDetails(OrderDetails orderDetails);

	List<OrderDetails> getAllOrders();

	ResponseEntity<OrderDetails> updateOrders(String orderId, @Valid OrderDetails orderDetails) throws OrderNotFound;

	ResponseEntity<?> deleteOrder(String orderId) throws OrderNotFound ;

	ResponseEntity<OrderDetails> getOrderById(String orderId) throws OrderNotFound;
	
	*/

}
