package com.mouritech.onlinefooddeliveryapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;
import com.mouritech.onlinefooddeliveryapplication.entity.Restaurant;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByCustomerEmailAndCustomerPassword(String customerEmail, String customerPassword);

	Customer findByCustomerName(String customerName);


	Customer findByCustomerEmail(String customerEmail);

	Customer findByCustomerPassword(String customerPassword);

}
