package com.onlinefooddeliveryapp.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onlinefooddeliveryapp.entity.Order;
import com.onlinefooddeliveryapp.service.OrderService;


@Path("api/v1/order")

public class OrderDetails {

OrderService orderService = new OrderService();
	
	@Path("/getallorder")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getAllOrder(){
		return orderService.getAllOrder();
	}
	
	@Path("/getorderbyid/{orderid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrderById(@PathParam("orderid") int orderid){
		return orderService.getOrderById(orderid);
	}
	
	@Path("/addorder")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Order addorder(Order order){
		return orderService.addOrder(order);
	}
	
	@Path("/deleteorder/{orderid}")
	@DELETE
	public int removeOrder(@PathParam("orderid") int orderid){
		return orderService.removeOrder(orderid);
	}
	
	@Path("/updateorder/{orderid}")
	@PUT
	public Order updateOrder(@PathParam("orderid") int orderid,Order order){
		return orderService.updateOrder(orderid,order);
	}
}
