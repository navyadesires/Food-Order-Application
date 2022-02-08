package com.onlinefooddeliveryapp.entity;

import javax.xml.ws.ServiceMode;

import com.onlinefooddeliveryapp.controller.Category;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private String itemId;
	private String itemName;
	private Category category;
	private int quantity;
	private double cost;
	public Item() {
		
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String ItemName) {
		this.itemName = ItemName;
	}
	public Category getcategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", ItemName=" + itemName + ", category=" + category
				+ ", quantity=" + quantity + ", cost=" + cost + "]";
	}
}