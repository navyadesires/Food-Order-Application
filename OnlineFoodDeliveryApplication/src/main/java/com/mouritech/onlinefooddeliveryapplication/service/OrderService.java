package com.mouritech.onlinefooddeliveryapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefooddeliveryapplication.model.Order;
import com.mouritech.onlinefooddeliveryapplication.repository.OrderRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order saveOrder(Order order) {
		  return orderRepository.save(order);
		
	}

	public List<Order> getAllOrder() {
		return orderRepository.findAll();
		}
	
	/*public Order getByOrderId(int id) {
		Optional<Order>optional= orderRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
					
		}
		return null;
	}
	
	public Order getByOrderId(int id) {
		Optional<Order>optional= orderRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
					
		}
		return null;
	}
	
	public Object updateOrder( int orderId,Order order) throws Exception {
	Orderdborder=getByOrderId(orderId);
	if(dborder!=null) {
		dborder.setName(order.getName());
	dborder.setAuthorName(order.getAuthorName());
	  orderRepository.save(dborder);

	}else {
		throw new Exception("id is not existing in db");
	}
	return dborder;
	}
	
	public void deleteOrder(int bookId) {
		Order dborder=getByOrderId(orderId);
		if(dborder!=null) {
			orderRepository.delete(dborder);
			}
		}*/
	//public List<Order> getOrderList(List<Order> order) {
		
	//}
	//}
	//List<Order> getAllOrder();

	//void saveOrder(Order theNewSeller);

	//Order getSellerById(Long sellerid) throws SellerNotFoundException;

	//void updateSeller(Long , Seller theNewSeller);

	//void updateOrderDate(Long sellerid, String orderDate);

	//void updateOrderStatus(Long sellerid, Long orderStatus);

	//void deleteOrder(int orderid);
}

