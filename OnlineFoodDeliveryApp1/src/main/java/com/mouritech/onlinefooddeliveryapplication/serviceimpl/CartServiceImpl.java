package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.service.CartService;

public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartService cartService;

	public FoodCart addItemToCart(FoodCart cart, Item item) {
		return cartService.addItemToCart(cart, item);
	}

	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity) {
		return cartService.increaseQuantity(cart, item, quantity);
	}

	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {
		return cartService.reduceQuantity(cart, item, quantity);
	}

	public FoodCart removeItem(FoodCart cart, Item item) {
		return cartService.removeItem(cart, item);
	}

	public FoodCart clearCart(FoodCart cart) {
		return cartService.clearCart(cart);
	}

}
