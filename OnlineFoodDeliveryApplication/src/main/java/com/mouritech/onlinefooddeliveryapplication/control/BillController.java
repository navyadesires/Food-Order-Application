package com.mouritech.onlinefooddeliveryapplication.control;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.Bill;
import com.mouritech.onlinefooddeliveryapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefooddeliveryapplication.repository.BillRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
@RequestMapping("/api/v1")
public class BillController {
	
	@Autowired
	private BillRepository billRepository;
	
	//save an bill
	@PostMapping("/bills")
	public Bill saveBill(@Valid @RequestBody Bill bill)
	{
		return billRepository.save(bill);
	}
	
	//get all bills
	@GetMapping("/bills")
	public List<Bill> getAllBills()
	{
		return billRepository.findAll();
	}
	
	//update bills
	@PutMapping("/bills/{id}")
	public ResponseEntity<Bill> updatebill(@PathVariable(value = "id") String billId,
	         @Valid @RequestBody Bill billDetails) throws ResourceNotFoundException {
		Bill bill = billRepository.findById(billId)
	        .orElseThrow(() -> new ResourceNotFoundException("Bill not found for this id :: " + billId));

	        // bill.setCustomerId(billDetails.getCustomerId());
		//bill.setBillDate(bill.getBillDate());
		bill.setTotalItem(bill.getTotalItem()); 
		bill.setTotalCost(bill.getTotalCost());
	        
	        final Bill updateBill = billRepository.save(bill);
	        return ResponseEntity.ok(updateBill);
	    }	
	
	
	//delete bill
	@DeleteMapping("/bills/{billId}")
	public ResponseEntity<?> deleteBill( 
			@PathVariable(value = "billId") String billId)
	throws ResourceNotFoundException
	{
		return billRepository.findById(billId).map(bill -> {
			billRepository.delete(bill);
		return ResponseEntity.ok().build();
		}).orElseThrow(()->new ResourceNotFoundException("bill not found"));
	}
	
	//get bill by billId
	@GetMapping("/bills/{id}")
    public ResponseEntity<Bill> getBillById(@PathVariable(value = "id") String billId)
        throws ResourceNotFoundException {
		Bill bill = billRepository.findById(billId)
          .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + billId));
        return ResponseEntity.ok().body(bill);
    }
	
}
