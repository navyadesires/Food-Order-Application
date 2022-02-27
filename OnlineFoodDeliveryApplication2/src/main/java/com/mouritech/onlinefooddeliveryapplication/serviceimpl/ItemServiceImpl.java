package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;
import com.mouritech.onlinefooddeliveryapplication.repository.ItemsRepository;
import com.mouritech.onlinefooddeliveryapplication.repository.RestaurantRepository;
import com.mouritech.onlinefooddeliveryapplication.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	ItemsRepository itemsRepository;

	@Override
	public Item addItems(Long restaurantId, Item item) throws RestaurantNotFound {
		Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new RestaurantNotFound(" restaurant not Found"));
		item.setRestaurant(restaurant);
		Item finalItems = itemsRepository.save(item);
		return finalItems;
	}
	
	@Override
	public Item addItems(Item items) {
		return itemsRepository.save(items);
	}

	@Override
	public Item updateItems(Item items) throws RestaurantNotFound {
	Item existingItems = itemsRepository.findById(items.getItemId()).orElseThrow(() -> new RestaurantNotFound(" restaurant Not found"));
	existingItems.setItemName(items.getItemName());
	existingItems.setItemPrice(items.getItemPrice());
	existingItems.setItemQuantity(items.getItemQuantity());
	existingItems.setItemDescription(items.getItemDescription());
	itemsRepository.save(existingItems);
	return existingItems;
	
	}

	@Override
	public Item updateById(Item items, Long itemId) throws RestaurantNotFound {
		Item existingItems = itemsRepository.findById(itemId).orElseThrow(() -> new RestaurantNotFound(" restaurant Not found"));
		existingItems.setItemName(items.getItemName());
		existingItems.setItemPrice(items.getItemPrice());
		existingItems.setItemQuantity(items.getItemQuantity());
		existingItems.setItemDescription(items.getItemDescription());
		itemsRepository.save(existingItems);
		return existingItems;
	}

	@Override
	public Item deleteById(Long itemId) throws RestaurantNotFound {
		Item existingItems = itemsRepository.findById(itemId).orElseThrow(() -> new RestaurantNotFound(" restaurant Not found"));
		itemsRepository.delete(existingItems);
		return existingItems;
	}

//	@Override
//	public Item deleteByName(String itemName) throws RestaurantNotFound {
//		Item existingItems = itemsRepository.findByName(itemName).orElseThrow(() -> new RestaurantNotFound(" restaurant Not found"));
//		itemsRepository.delete(existingItems);
//		return existingItems;
//	}
	
	   //@Service("itemService")

	@Override
	public List<Item> getAllItems() {
		return itemsRepository.findAll();
	}

	 public List<Item> getItemsByRestaurantName(String restaurantName) {
		 
	        Restaurant restaurant = restaurantRepository.findByRestaurantName(restaurantName);
	 
	        List<Item> items = restaurant.getItems();
	        return items;
	    }
	@Override
	public Item findById(Long itemId) throws RestaurantNotFound {
		Item existingItems = itemsRepository.findById(itemId).orElseThrow(() -> new RestaurantNotFound(" restaurant Not found"));
		return existingItems;
	}
	

	@Override
	public Item AddItemsByRestName(String restaurantName, Item items) {
		Restaurant restaurant = restaurantRepository.findByRestaurantName(restaurantName);
		items.setRestaurant(restaurant);
		Item finalItems = itemsRepository.save(items);
		return finalItems;
	}
	

//	@Override
//	public Item deleteItemsByRestName(String restaurantName, Item items) {
//		Restaurant restaurant = restaurantRepository.findByRestaurantName(restaurantName);
//		items.setRestaurant(restaurant);
//		Item finalItems = itemsRepository.save(items);
//		return finalItems;
//	}

//	@Override
//	public Item deleteByName(String itemName) throws RestaurantNotFound {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Item deleteByName(Long itemId) throws RestaurantNotFound {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Item findByName(String itemName) throws RestaurantNotFound {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public Item findByItemId(Long itemId) throws RestaurantNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item findByName(String itemName) throws RestaurantNotFound {
		// TODO Auto-generated method stub
		return null;
	}

}