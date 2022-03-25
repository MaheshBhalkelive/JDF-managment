package com.yashtech.jdfmanagement.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class DealerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DealerNotFoundException(String message) {
		super(message);
	}
	
	public DealerNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
