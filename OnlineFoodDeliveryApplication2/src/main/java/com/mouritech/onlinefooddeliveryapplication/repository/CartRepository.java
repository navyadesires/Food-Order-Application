/*package com.mouritech.onlinefooddeliveryapplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;

//import com.mouritech.onlinefooddeliveryapplication.entity.Item;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Repository
public interface CartRepository extends JpaRepository<FoodCart, String> {
	
	//public FoodCart addItemToCart(FoodCart cart, Item item);
	//public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity);
	//public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);
	//public FoodCart removeItem(FoodCart cart, Item item);
	//public FoodCart clearCart(FoodCart cart);
 Optional<FoodCart> findById(String cartId);
	
	
	
	//List<FoodCart> findByItem(long itemId);

}*/