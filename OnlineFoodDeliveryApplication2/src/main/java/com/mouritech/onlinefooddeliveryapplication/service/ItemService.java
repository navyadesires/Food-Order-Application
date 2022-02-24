package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;


public interface ItemService {

	Item addItems(Long restaurantId, Item item) throws RestaurantNotFound;

	Item addItems(Item items);

	Item updateItems(Item items) throws RestaurantNotFound;

	Item updateById(Item items, Long itemId) throws RestaurantNotFound;

	Item deleteById(Long itemId) throws RestaurantNotFound;

	List<Item> getAllItems();

	Item findById(Long itemId) throws RestaurantNotFound;
}
