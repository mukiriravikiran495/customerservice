package com.customerservice.exceptions;

public class InvalidRequestException extends Exception {
	
	private static final long serialVersionUID = -8994117841815446393L;

	public InvalidRequestException(String message) {
		super(message);
	}
}
