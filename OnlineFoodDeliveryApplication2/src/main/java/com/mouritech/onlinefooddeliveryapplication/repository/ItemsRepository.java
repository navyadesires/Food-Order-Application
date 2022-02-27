package com.mouritech.onlinefooddeliveryapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
//import com.mouritech.onlinefooddeliveryapplication.entity.Category;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
//import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Long>{

//	Item findByItemName(String itemName);
	//Item findByItemId(Long itemId);
	//public Item addItem(Item item) ;
//	public Item updateItem(Item item) ;
	//public Item viewItem(Item item) ;
	//public Item removeItem(Item item);
	
	//public List <Item> viewAllItems(Category cat);
	//public List <Item> viewAllItems(Restaurant res);
	//public List <Item> viewAllItemsByName(String name);
	//Optional<Item> findByCartId(String cartId);
	
	//Optional<Item>findByItemId(String itemId);
	//List<Item> findByItemName(String itemId);
	//List<Item> findByCategory(String catid);
	//Optional<Item> findByProdNameAndCategory(String catid, String productname);
	//List<Item> findByCategory_CatId(String catid);

	//Optional<Item> findByCategory_CatIdAndItemName(String catid, String itemname);
}