package com.mouritech.onlinefooddeliveryapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, String>{
	
	//List<Bill> findByCustomer_CustomerId(String custId);

}
