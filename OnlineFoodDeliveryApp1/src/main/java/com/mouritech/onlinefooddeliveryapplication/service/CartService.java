package com.mouritech.onlinefooddeliveryapplication.service;

import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;

public interface CartService {

	public FoodCart addItemToCart(FoodCart cart, Item item);
	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity);
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);
	public FoodCart removeItem(FoodCart cart, Item item);
	public FoodCart clearCart(FoodCart cart);
}
