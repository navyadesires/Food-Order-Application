package com.mouritech.onlinefooddeliveryapplication.repository;

//import java.time.LocalDate;
//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.onlinefooddeliveryapplication.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, String > {

	//public Bill addBill(Bill bill);
	//public Bill UpdateBill(Bill bill);
	//public Bill removeBill(Bill bill);
	//public Bill viewBill(Bill bill);
	//public List<Bill> viewBills(LocalDate startDate, LocalDate endDate);
	//public List<Bill> viewBills(String custId);
	//public double calculateTotalCost(Bill bill);
	
	Optional<Bill> findByBillId(int billId);
	
}
