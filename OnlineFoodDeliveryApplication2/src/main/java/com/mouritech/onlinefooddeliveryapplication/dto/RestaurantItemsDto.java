package com.mouritech.onlinefooddeliveryapplication.dto;

import java.util.List;

import com.mouritech.onlinefooddeliveryapplication.entity.Item;

public class RestaurantItemsDto {
	
	private String restaurantPassword;

	private String restaurantEmail;
	
	private List<Item> items;

	public String getRestaurantPassword() {
		return restaurantPassword;
	}

	public void setRestaurantPassword(String restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}

	public String getRestaurantEmail() {
		return restaurantEmail;
	}

	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public RestaurantItemsDto(String restaurantPassword, String restaurantEmail, List<Item> items) {
		super();
		this.restaurantPassword = restaurantPassword;
		this.restaurantEmail = restaurantEmail;
		this.items = items;
	}

	public RestaurantItemsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

		
}
