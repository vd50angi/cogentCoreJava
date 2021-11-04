package com.cogent.ecommerce.exception;

import lombok.ToString;

@ToString
	public class IdNotFoundException extends RuntimeException {
		public IdNotFoundException(String message) {
			super(message);
		}
	}




