/*package com.mouritech.onlinefooddeliveryapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "foodcart")
public class FoodCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartid")
	private String cartId;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	//@OneToMany(mappedBy = "foodcart")
	//private List<Item> itemList;
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)

	// @OnDelete(action = OnDeleteAction.CASCADE)
	// @JoinColumn(name = "itemt_id", nullable = false)
	// private Item item;

	// @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	// @JoinColumn(name = "order_id")

	// private Order orderDetails;

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

	//public List<Item> getItemList() {
		//return itemList;
	//}

	//public void setItemList(List<Item> itemList) {
		//this.itemList = itemList;
	//}

	// public Item getItem() {
	// return item;
//	}

	// public void setItem(Item item) {
	// this.item = item;
	// }

	// public Order getOrderDetails() {
	// return orderDetails;
	// }

	// public void setOrderDetails(Order orderDetails) {
	// this.orderDetails = orderDetails;
	// }

	public FoodCart(Customer customer) {
		//List<Item> itemList
		super();
		//this.cartId = cartId;
		this.customer = customer;
		//this.itemList = itemList;

	}

	// @Override
	// public String toString() {
	// return "FoodCart [cartId=" + cartId + ", customer=" + customer + ",
	// itemList=" + itemList + ", orderDetails="
	// + orderDetails + "]";
	// }

}*/