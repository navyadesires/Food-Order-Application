package com.mouritech.onlinefooddeliveryapplication.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;
import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;
import com.mouritech.onlinefooddeliveryapplication.repository.CartRepository;

@RestController
@RequestMapping("/cart")
public class CartController {
  
	@Autowired
	private CartRepository cartRepository;
	
		
	@PostMapping("/addfoodcart")
	public ResponseEntity<?>addItemToCart(@RequestBody FoodCart cart, Item item)
	{
		cartRepository.addItemToCart(cart, item);
		
		return ResponseEntity.ok().body("all food cart information inserted");
		
		
	}
	
	//@GetMapping("/getcartitem/{cartid}")
	//public ResponseEntity<?> findCartByID(@PathVariable(value = "cartid") String cartId)
		//	{
		
		//boolean result = cartRepository.findById(cartId);
		//if(result==true) {
			//return ResponseEntity.ok().body("login successful");
		//}
	
	//	else {
			// return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resourse not found please sign in first");
			
	//	}
		
	//}
	/*@PutMapping("/updatecustomerinfobyname")
	public ResponseEntity<?>updatecustomerinfobyname(@RequestBody FoodCart cart){
		
		ResponseEntity<?> result = cartRepositoryv.updatecartinfobyname(cart);
		return result;
	}*/

}
