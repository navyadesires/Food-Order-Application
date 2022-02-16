package com.mouritech.onlinefooddeliveryapplication.exception;

public class OrderNotFound extends Exception{

	private static final long serialVersionUID = 6169161480353483613L;

	public OrderNotFound(String message) {
		super(message);
	}
}
