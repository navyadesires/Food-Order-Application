package com.onlinefooddeliveryapp.service;

import java.util.List;

import com.onlinefooddeliveryapp.entity.Item;
import com.onlinefooddeliveryapp.repository.ItemRepository;

public class ItemService {

	ItemRepository itemRepository = new ItemRepository();
	public List<Item> getAllItem() {
			
			return itemRepository.getAllItem();
		}

		public Item addItem(Item item) {
			// TODO Auto-generated method stub
			return itemRepository.addItem(item);
		}

		public String removeItem(String itemid) {
			// TODO Auto-generated method stub
			return itemRepository.removeItem(itemid);
		}

		public Item updateItem(String itemid,Item item) {
			// TODO Auto-generated method stub
			return itemRepository.updateItem(itemid,item);
		}

		public Item getItemById(String itemid) {
			// TODO Auto-generated method stub
			return itemRepository.getItemById(itemid);
		}
}
