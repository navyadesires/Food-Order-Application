package com.mouritech.onlinefooddeliveryapplication.exception;

//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CartNotFound extends RuntimeException {

	



	/**
	 * 
	 */
	private static final long serialVersionUID = -4397246848137372578L;

	public CartNotFound(String msg) {
		
		super(msg);
	}
}
