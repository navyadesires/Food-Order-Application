/*package com.mouritech.onlinefooddeliveryapplication.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;
import com.mouritech.onlinefooddeliveryapplication.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void addCustomerInformation(OrderDetails customer) {
		
		orderRepository.save(customer);
		
	}

	
	@Override
	public ResponseEntity<?> updatecustomerinfobyname(OrderDetails order) {
		
		Order cust = orderRepository.findByCustomerName(customer.getCustomerName());
		if(cust==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resourse not you can't update");
		}
		else {
			cust.setCustomerName(customer.getCustomerName());
			
			cust.setCustomerPassword(customer.getCustomerPassword());
			cust.setCustomerCity(customer.getCustomerCity());
			cust.setCustomerState(customer.getCustomerState());
			cust.setCustomerCountry(customer.getCustomerCountry());
			cust.setCustomerPincode(customer.getCustomerPincode());
			cust.setCustomerMobileNumber(customer.getCustomerMobileNumber());
			cust.setCustomerEmail(customer.getCustomerEmail());
			
			final Customer customerfinal = orderRepository.save(cust);
			
			 return ResponseEntity.ok(customerfinal);
		}
}


}*/