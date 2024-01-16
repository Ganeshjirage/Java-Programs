package com.practice.questions.exception_handling_problems;

public class InsufficientFundException extends RuntimeException {
	private String message;

	public InsufficientFundException(String message) {
		super(message);
		this.message = message;
	}

}
