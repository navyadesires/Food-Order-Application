package com.mouritech.onlinefooddeliveryapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.mouritech.onlinefooddeliveryapplication.entity.Category;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;

@Repository
public interface ItemsRepository extends JpaRepository<Item, String>{

	public Item addItem(Item item) ;
	public Item updateItem(Item item) ;
	public Item viewItem(Item item) ;
	public Item removeItem(Item item);
	
	//public List <Item> viewAllItems(Category cat);
	public List <Item> viewAllItems(Restaurant res);
	public List <Item> viewAllItemsByName(String name);
}
