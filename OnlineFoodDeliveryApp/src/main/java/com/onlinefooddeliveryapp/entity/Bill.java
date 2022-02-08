package com.onlinefooddeliveryapp.entity;

import javax.xml.ws.ServiceMode;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Bill {
	@Id
	private String billId;
	private LocalDateTime billDate;
	private int totalItem;
	private double totalCost;
	public Bill() {
		
	}
	public String getBillId() {
		return billId;
	}
	public void setOrderId(String billId) {
		this.billId = billId;
	}
	public LocalDateTime getBillDate() {
		return billDate;
	}
	public void setItemName(LocalDateTime billDate) {
		this.billDate = billDate;
	}
	public int gettotalItem() {
		return totalItem;
	}
	public void setorderStatus(int totalItem) {
		this.totalItem = totalItem;
	}
	public double gettotalCost() {
		return totalCost;
	}
	public void settotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	@Override
	public String toString() {
		return "Item [billId=" + billId + ", billDate=" + billDate 
				+ ", totalItem=" + totalItem + ", totalCost=" + totalCost + "]";
	}
}
