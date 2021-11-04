package com.cogent.ecommerce.exception;

import lombok.ToString;

@ToString
	public class InvalidProductIdException extends RuntimeException {
		public InvalidProductIdException(String message) {
			super(message);
		}
	}










