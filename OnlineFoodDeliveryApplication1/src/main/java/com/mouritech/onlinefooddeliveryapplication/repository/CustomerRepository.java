package com.mouritech.onlinefooddeliveryapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByCustomerEmailAndCustomerPassword(String customerEmail, String customerPassword);

	Customer findByCustomerName(String customerName);

}
