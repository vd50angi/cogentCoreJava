package com.cogent.ecommerce.exception;

import lombok.ToString;

@ToString
	public class InvalidUserIdException extends RuntimeException {
		public InvalidUserIdException(String message) {
			super(message);
		}
	}





