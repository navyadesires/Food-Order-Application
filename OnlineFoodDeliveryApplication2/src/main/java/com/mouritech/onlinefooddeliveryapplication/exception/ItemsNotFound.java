package com.mouritech.onlinefooddeliveryapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ItemsNotFound extends RuntimeException {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemsNotFound(String message) {
		super(message);
	}
}
