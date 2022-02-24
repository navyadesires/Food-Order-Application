

/*package com.mouritech.onlinefooddeliveryapplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.FoodCart;
import com.mouritech.onlinefooddeliveryapplication.exception.CartNotFound;
import com.mouritech.onlinefooddeliveryapplication.exception.ItemsNotFound;
import com.mouritech.onlinefooddeliveryapplication.repository.CartRepository;
import com.mouritech.onlinefooddeliveryapplication.service.CartService;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/foodcart")
public class CartController {

	@Autowired
	private CartService cartService;

	@Autowired
	CartRepository cartRepo;

	@PostMapping("Cart")
	public FoodCart insertCart(@RequestBody FoodCart newCart) {

		return cartService.insertCart(newCart);

	}

	@GetMapping("Cart")
	public List<FoodCart> showAllCarts() {
		return cartService.showAllCarts();

	}

	@GetMapping("Cart/{cid}")

	public FoodCart showCartById(@PathVariable("cid") String CartId) throws CartNotFound {
		return cartService.showCartById(CartId);

	}

	@PutMapping("Cart/{cid}")
	public FoodCart updateCartById(@PathVariable("cid") String CartId, @RequestBody FoodCart Cart)
			throws ItemsNotFound {
		return cartService.updateCartById(CartId, Cart);

	}

	@DeleteMapping("Cart/{cid}")
	public String deleteCartById(@PathVariable("cid") String CartId) throws CartNotFound {
		cartService.deleteCartById(CartId);
		return "deleted the Cart";

	}

	@GetMapping("/Carts/{itemid}")
	public ResponseEntity<List<FoodCart>> getAllCartsBySellerId(@PathVariable("itemid") long itemId)
			throws ItemsNotFound {
		return cartService.getAllCartsByprodId(itemId);
	}

	@PostMapping("/Carts/{itemid}/item")
	public ResponseEntity<FoodCart> createCart(@PathVariable("itemid") long itemId, @RequestBody FoodCart newCart)
			throws ItemsNotFound {
		return cartService.createCart(itemId, newCart);

	}

}
*/