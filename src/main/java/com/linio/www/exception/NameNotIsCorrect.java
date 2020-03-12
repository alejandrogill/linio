package com.linio.www.exception;

@SuppressWarnings("serial")
public class NameNotIsCorrect extends AssertionError{
	public static final String MESSAGE="The product name is not as expected";
	
	public NameNotIsCorrect(String message, Throwable cause) {
		super(message, cause);
	}

}