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

import com.onlinefooddeliveryapp.entity.Item;
import com.onlinefooddeliveryapp.service.ItemService;


@Path("api/v1/item")
public class ItemController {
	ItemService itemService = new ItemService();
	
	@Path("/getallitem")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> getAllItem(){
		return itemService.getAllItem();
	}
	
	@Path("/getitembyid/{itemid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Item getItemById(@PathParam("itemid") String itemid){
		return itemService.getItemById(itemid);
	}
	
	@Path("/additem")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Item addItem(Item item){
		return itemService.addItem(item);
	}
	
	@Path("/removeitem/{itemid}")
	@DELETE
	public String deleteItem(@PathParam("itemid") String itemid){
		return itemService.removeItem(itemid);
	}
	
	@Path("/updateitem/{itemid}")
	@PUT
	public Item updateItem(@PathParam("itemid") String itemid,Item item){
		return itemService.updateItem(itemid,item);
	}
}

