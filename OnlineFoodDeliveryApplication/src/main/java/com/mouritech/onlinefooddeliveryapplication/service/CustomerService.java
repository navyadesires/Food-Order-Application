package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;
import com.mouritech.onlinefooddeliveryapplication.exception.ResourceNotFoundException;

public interface CustomerService {

	Customer insertCustomer(Customer newCustomer);

	Customer showCustomerById(String customerId) throws ResourceNotFoundException;

	List<Customer> showAllCustomers();



	Customer updateCustomerById(String customerId, Customer customer) throws ResourceNotFoundException;

	void deleteCustomerById(String customerId) throws ResourceNotFoundException;
//	ResponseEntity<List<Customer>> getAllCustomerByCartId(Long cartId) throws ResourceNotFoundException;



//	ResponseEntity<Customer> createCustomer(Long cartId, Customer newCustomer) throws ResourceNotFoundException;
}