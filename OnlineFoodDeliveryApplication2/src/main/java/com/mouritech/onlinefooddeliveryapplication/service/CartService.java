/*
package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;
import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.exception.CartNotFound;
import com.mouritech.onlinefooddeliveryapplication.exception.ItemsNotFound;

import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;


public interface  CartService {

	FoodCart insertCart(FoodCart newCart);

	FoodCart showCartById(String cartId) throws CartNotFound;

	List<FoodCart> showAllCarts();



	FoodCart updateCartById(String cartId, FoodCart cart) throws CartNotFound;

	void deleteCartById(String cartId) throws CartNotFound;

	ResponseEntity<List<FoodCart>> getAllCartsByprodId(long itemId); //throws ItemNotFoundException;



	ResponseEntity<FoodCart> createCart(Long itemId, FoodCart newCart) throws ItemsNotFound;


Item addItems(Long restaurantId, Item item) throws RestaurantNotFound;




}
*/