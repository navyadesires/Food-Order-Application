package com.onlinefooddeliveryapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.onlinefooddeliveryapp.controller.OrderDetails;

import java.time.LocalDateTime;

@Entity
public class Order {

	@Id
	private int orderId;
	private LocalDateTime orderDate;
	private String orderStatus;
	
	public Order() {
		
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setItemName(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setorderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	@Override
	public String toString() {
		return "Item [orderId=" + orderId + ", orderDate=" + orderDate 
				+ ", orderStatus=" + orderStatus + "]";
	}
}
