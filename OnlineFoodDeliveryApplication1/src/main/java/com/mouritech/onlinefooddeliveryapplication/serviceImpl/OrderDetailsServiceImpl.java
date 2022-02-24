/*package com.mouritech.onlinefooddeliveryapplication.serviceImpl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.entity.OrderDetails;
import com.mouritech.onlinefooddeliveryapplication.exception.OrderDetailsNotFoundException;
import com.mouritech.onlinefooddeliveryapplication.repository.OrderDetailsRepository;
import com.mouritech.onlinefooddeliveryapplication.repository.OrderRepository;
import com.mouritech.onlinefooddeliveryapplication.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	private OrderDetailsRepository orderdetailsRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public OrderDetails insertOrderDetails(String orderId, @Valid OrderDetails newOrderDetails)
			throws OrderDetailsNotFoundException {
		return orderRepository.findByOrderId(orderId).map(order -> {
			newOrderDetails.setOrder(order);
			return orderdetailsRepository.save(newOrderDetails);
		}).orElseThrow(() -> new OrderDetailsNotFoundException("order not found"));
	}

	@Override
	public List<OrderDetails> findByOrder_OrderId(String orderId) {
		
		return orderdetailsRepository.findByOrder_OrderId(orderId);
	}

	@Override
	public ResponseEntity<?> deleteOrderDetails(String orderId) throws OrderDetailsNotFoundException {
		List<OrderDetails> orderDetails = orderdetailsRepository.findByOrder_OrderId(orderId);
	    		for (OrderDetails oD : orderDetails)
		{
			orderdetailsRepository.delete(oD);
		}
		
		return ResponseEntity.ok().build();
	}

	

	@Override
	public ResponseEntity<OrderDetails> updateOrderDetails(Long orderDetailsId, @Valid OrderDetails orderDetails)
			throws OrderDetailsNotFoundException {
		 OrderDetails newOrderDetails = orderdetailsRepository.findById(orderDetailsId)
			        .orElseThrow(() -> new OrderDetailsNotFoundException("orderdetails not found for this id :: " + orderDetailsId));

			        newOrderDetails.setStatus(orderDetails.getStatus());
			        newOrderDetails.setComments(orderDetails.getComments());
			        
			        final OrderDetails updatedOrerDetails = orderdetailsRepository.save(newOrderDetails);
			        return ResponseEntity.ok(updatedOrerDetails);
	}

	
}*/