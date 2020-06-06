package com.employeemanagement.exception;

public class EmployeeDataNotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public EmployeeDataNotFoundException(String message) {
		super(message);
		
	}

}
