package com.capg.pbms.passbook.exception;

public class InsufficientBalanceException extends RuntimeException{
	public   InsufficientBalanceException(String message) {
		super(message);
	}
}
