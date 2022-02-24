package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.Bill;

import com.mouritech.onlinefooddeliveryapplication.exception.BillNotFound;
;

public interface BillService {
	Bill saveBill(Bill bill);

	List<Bill> getAllBills();

	ResponseEntity<Bill> updateBills(int billId) throws BillNotFound;

	ResponseEntity<?> deleteBill(int billId) throws BillNotFound ;

	ResponseEntity<Bill> getBillById(int billId) throws BillNotFound;

}
