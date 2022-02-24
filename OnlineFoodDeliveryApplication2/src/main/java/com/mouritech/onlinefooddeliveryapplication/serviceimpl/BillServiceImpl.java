package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefooddeliveryapplication.entity.Bill;
import com.mouritech.onlinefooddeliveryapplication.exception.BillNotFound;
import com.mouritech.onlinefooddeliveryapplication.repository.BillRepository;

public class BillServiceImpl {

	@Autowired
	private BillRepository billRepository;

	public Bill saveBill(Bill bill) {

		bill.setBillId(generateBillId());
		System.out.println("generateBillId");
		return billRepository.save(bill);
	}

	public String generateBillId() {
		Random rand = new Random(); // instance of random class
		int upperbound = 255;
		// generate random values from 0-254
		int cId = (int) rand.nextInt(upperbound);
		return cId + "Bill";

	}

	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}

	public ResponseEntity<Bill> updateBills(int billId) throws BillNotFound {
		Bill bill = billRepository.findByBillId(billId)
				.orElseThrow(() -> new BillNotFound("Bill not found for this id :: " + billId));

		bill.setBillDate(bill.getBillDate());
		// bill.setTotalItem(bill.getTotalItem());
		bill.setTotalCost(bill.getTotalCost());
		final Bill updatedBill = billRepository.save(bill);
		return ResponseEntity.ok(updatedBill);

	}

	public ResponseEntity<?> deleteBill(int billId) throws BillNotFound {

		return billRepository.findByBillId(billId).map(bill -> {
			billRepository.delete(bill);
			return ResponseEntity.ok().build();
		}).orElseThrow(() -> new BillNotFound("bill not found"));
	}

	public ResponseEntity<Bill> getBillById(int billId) throws BillNotFound {
		Bill bill = billRepository.findByBillId(billId)
				.orElseThrow(() -> new BillNotFound("Bill not found for this id :: " + billId));
		return ResponseEntity.ok().body(bill);
	}
}
