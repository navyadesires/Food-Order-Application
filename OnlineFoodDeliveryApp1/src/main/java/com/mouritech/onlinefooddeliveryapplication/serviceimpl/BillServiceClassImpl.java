package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mouritech.onlinefooddeliveryapplication.entity.Bill;
import com.mouritech.onlinefooddeliveryapplication.service.BillService;

public class BillServiceClassImpl implements BillService {

	@Autowired
	private BillService billService;

	@Override
	public Bill addBill(Bill bill) {
		return billService.addBill(bill);

	}

	@Override
	public Bill updateBill(Bill bill) {
		return billService.updateBill(bill);
	}

	@Override
	public Bill removeBill(Bill bill) {
		return billService.removeBill(bill);
	}

	@Override
	public Bill viewBill(Bill bill) {
		return billService.viewBill(bill);
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		return billService.viewBills(startDate, endDate);
	}

	@Override
	public List<Bill> viewBills(String custId) {
		return billService.viewBills(custId);
	}

}
