/*package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.exception.CartNotFound;
import com.mouritech.onlinefooddeliveryapplication.exception.ItemsNotFound;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;
import com.mouritech.onlinefooddeliveryapplication.repository.CartRepository;
import com.mouritech.onlinefooddeliveryapplication.repository.ItemsRepository;
import com.mouritech.onlinefooddeliveryapplication.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private ItemsRepository itemRepository;

	public FoodCart insertCart(FoodCart newCart) {
		// TODO Auto-generated method stub
		return cartRepository.save(newCart);
	}

	public FoodCart showCartById(String cartId) throws CartNotFound {
		// TODO Auto-generated method stub
		return cartRepository.findById(cartId).orElseThrow(
				() -> new CartNotFound("Cart not found with id " + cartId));
	}

	public List<FoodCart> showAllCarts() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	public FoodCart updateCartById(String cartId, FoodCart cart) throws CartNotFound {
		// TODO Auto-generated method stub

		FoodCart existingCart = cartRepository.findById(cartId).orElseThrow(()-> new CartNotFound("cart not found with id" + cartId));
		//existingCart.setItemList(cart.getItemList());
		//existingCart.setContent(cart.getContent());
		cartRepository.save(existingCart);
		return existingCart;
	}

	public void deleteCartById(String cartId) throws CartNotFound {
		FoodCart existingCart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFound("cart not found with id " + cartId));
						cartRepository.delete(existingCart);
		
	}

//	@Override
//	public ResponseEntity<List<Cart>> getAllCartsByItemId(String prodId){
//	
//		
//		List<Cart> carts = cartRepository.findByItem(itemId);
//		return new ResponseEntity<List<Cart>>(carts,HttpStatus.OK);
//	}

	//public ResponseEntity<FoodCart> createCart(String itemId, FoodCart newCart) throws ItemsNotFound {
		//FoodCart cart = itemRepository.findById(itemId).map(
			//	item ->{
				//	newCart.setItemList(item);
					
					//return cartRepository.save(newCart);
				//}).orElseThrow(()-> new ItemsNotFound("Item not found with id = "  + itemId));
		//return new ResponseEntity<FoodCart>(newCart,HttpStatus.CREATED);
//	}

	//public ResponseEntity<List<FoodCart>> getAllCartsByitemId(long itemId) {
		//List<FoodCart> carts = cartRepository.findByItem(itemId);
		//return new ResponseEntity<List<FoodCart>>(carts,HttpStatus.OK);
	//}

	@Override
	public ResponseEntity<List<FoodCart>> getAllCartsByprodId(long itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<FoodCart> createCart(Long itemId, FoodCart newCart) throws ItemsNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item addItems(Long restaurantId, Item item) throws RestaurantNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	

}*/
