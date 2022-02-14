package com.mouritech.onlinefooddeliveryapplication.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordersapp")
public class Order{
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;
	
	@Column(name = "order_date")
	private LocalDateTime orderDate;
		
//	@OneToOne(cascade = CascadeType.PERSIST)
	//@JoinColumn(name = "cart_id")
	//private FoodCart cart;
	
	@Column(name = "oreder_status")
	private String orderStatus;
	
		
	public Order() {
		super();
	}
	
	

	public Order(int orderId, LocalDateTime orderDate, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	//public FoodCart getCart() {
		//return cart;
	//}
	
	//public void set(FoodCart  cart) {
		//this.cart = cart;
	//}
	//public String getCustomerId() {
	//	return customerId;
	//}

	//public void setCustomerId(String customerId) {
		//this.customerId = customerId;
	//}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus
				+ ", orderDate=" + orderDate + ", "
						//+ "cart =" + cart +""
								+ "]";
	}

	
}