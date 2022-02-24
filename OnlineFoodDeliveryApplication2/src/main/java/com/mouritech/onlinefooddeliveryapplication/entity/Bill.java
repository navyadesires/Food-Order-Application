package com.mouritech.onlinefooddeliveryapplication.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "billid")
	private String billId;
	@Column(name = "billdate")
	private LocalDateTime billDate;
	@Column(name = "totalitem")
	private int totalItem;
	@Column(name = "totalcost")
	private double totalCost;

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name ="order_id" )
    //private Order order;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public LocalDateTime getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDateTime billDate) {
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

	//public Order getOrder() {
		//return order;
	//}

	//public void setOrder(Order order) {
		//this.order = order;
	//}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billDate=" + billDate + ", totalItem=" + totalItem + ", totalCost="
				+ totalCost + "]";
	}

}
