/*package com.mouritech.onlinefooddeliveryapplication.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bills")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String billId;
	
	@Column(name = "bill_date")
	private LocalDateTime billDate;
		
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "order_id")
	//private OrderDetails order;
	
	@Column(name = "totalitem")
	private int totalItem;
	
	@Column(name = "totalcost")
	private double totalCost;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "custId")
	//private Customer customer;

	public Bill() {
		super();
	}
	

	public Bill( LocalDateTime billDate,OrderDetails order, int totalItem, double totalCost) {
		super();
		
		this.billDate = billDate;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
	}

	
	
	public String getBillId() {
		return billId;
	}


	public void setBillId(String billId) {
		this.billId = billId;
	}


	public LocalDateTime getbillDate() {
		return billDate;
	}

	public void setbillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	//public Customer getCustomer() {
		//return customer;
	//}

	//public void setCustomer(Customer customer) {
		//this.customer = customer;
	//}

	@Override
	public String toString() {
		return "Coupon [billId=" + billId + ", billDate=" + billDate + ", totalItem=" + totalItem + ", "
				+ "totalCost=" + totalCost + ",]";
	}

}*/