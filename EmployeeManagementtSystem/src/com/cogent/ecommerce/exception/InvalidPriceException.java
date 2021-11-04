package com.cogent.ecommerce.exception;


import lombok.ToString;

@ToString
	public class InvalidPriceException extends RuntimeException {
		public InvalidPriceException(String message) {
			super(message);
		}
	}





