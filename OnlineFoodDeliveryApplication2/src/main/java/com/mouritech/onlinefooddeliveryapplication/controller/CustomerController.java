package com.mouritech.onlinefooddeliveryapplication.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.exception.CustomerNotFound;
import com.mouritech.onlinefooddeliveryapplication.exception.RestaurantNotFound;
import com.mouritech.onlinefooddeliveryapplication.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addcustomerinfo")
	public ResponseEntity<?>addCustomerInformation(@RequestBody Customer customer)
	{
		customerService.addCustomerInformation(customer);
		
		return ResponseEntity.ok().body("all customer information inserted");
		
		
	}
	
	@GetMapping("/getcustomerbyemailandpassword/{customerEmail}/{customerPassword}")
	public ResponseEntity<?> findCustomerByEmailAndPassword(@PathVariable(value = "customerEmail") String customerEmail,
			@PathVariable(value ="customerPassword") String customerPassword){
		
		boolean result = customerService.findCustomerByEmailAndPassword(customerEmail,customerPassword);
		if(result==true) {
			return ResponseEntity.ok().body("login successful");
		}
	
		else {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resourse not found please sign in first");
			
		}
		
	}
	
	
	@PutMapping("/updatecustomerinfobyname")
	public ResponseEntity<?>updatecustomerinfobyname(@RequestBody Customer customer){
		
		ResponseEntity<?> result = customerService.updatecustomerinfobyname(customer);
		return result;
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomer(){
		List<Customer> listcus = customerService.getAllCustomer();
		return listcus;
	}
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	public Customer deleteCustomer(@PathVariable(value = "customerId") Long customerId) throws CustomerNotFound {
		return customerService.deleteCustomer(customerId);
	}
}