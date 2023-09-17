package com.learning.globalException;

public class OrderResponseException extends RuntimeException {

	public OrderResponseException(String message) {
		super(message);
	}
}
