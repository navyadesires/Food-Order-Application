/*package com.mouritech.onlinefooddeliveryapplication.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;
	
	@Column(name = "order_date")
	private LocalDateTime orderDate;
		
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cart_id")
	private Carts cart;
	
	@Column(name = "oreder_status")
	private String orderStatus;
	
		
	public OrderDetails() {
		super();
	}
	
	

	public OrderDetails( LocalDateTime orderDate, String orderStatus) {
		super();
		
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Carts getCart() {
		return cart;
	}
	
	public void set(Carts  cart) {
		this.cart = cart;
	}
	//public String getCustomerId() {
		//return customerId;
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

} */