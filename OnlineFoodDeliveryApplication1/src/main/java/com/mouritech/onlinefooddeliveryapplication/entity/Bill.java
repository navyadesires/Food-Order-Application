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

}*/