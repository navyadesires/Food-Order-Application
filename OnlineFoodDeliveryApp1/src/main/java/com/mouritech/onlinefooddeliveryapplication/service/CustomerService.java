package com.mouritech.onlinefooddeliveryapplication.service;


import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;

public interface CustomerService {

	void addCustomerInformation(Customer customer);

	boolean findCustomerByEmailAndPassword(String customerEmail, String customerPassword);

	ResponseEntity<?> updatecustomerinfobyname(Customer customer);

}