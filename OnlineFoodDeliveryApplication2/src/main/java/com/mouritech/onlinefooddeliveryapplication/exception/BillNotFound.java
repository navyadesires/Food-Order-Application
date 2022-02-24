package com.mouritech.onlinefooddeliveryapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BillNotFound extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8277654249610147250L;

	public BillNotFound(String message) {
		super(message);
}
}
