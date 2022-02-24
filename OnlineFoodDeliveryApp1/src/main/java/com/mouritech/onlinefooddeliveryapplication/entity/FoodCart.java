package com.mouritech.onlinefooddeliveryapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="foodcart")
public class FoodCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cartid")
	private String cartId;
	
	private Customer customer;
	private List<Item> itemList;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")

	private OrderDetails orderDetails;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	

	public FoodCart(String cartId, Customer customer, List<Item> itemList, OrderDetails orderDetails) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.itemList = itemList;
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "FoodCart [cartId=" + cartId + ", customer=" + customer + ", itemList=" + itemList + ", orderDetails="
				+ orderDetails + "]";
	}

	
}
