package com.mouritech.onlinefooddeliveryapplication.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;
import com.mouritech.onlinefooddeliveryapplication.exception.CustomerNotFound;


public interface CustomerService {

	void addCustomerInformation(Customer customer);

	//boolean findCustomerByEmailAndPassword(String customerEmail, String customerPassword);
	Customer findCustomerByEmailAndPassword(String customerEmail, String customerPassword);

	ResponseEntity<?> updatecustomerinfobyname(Customer customer);

	Customer deleteCustomer(Long customerId) throws CustomerNotFound;
	
	List<Customer> getAllCustomer();
	Customer addCustomer(Customer customer);
}