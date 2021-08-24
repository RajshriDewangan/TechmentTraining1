package com.techment.exceptionassignment;

class InvalidInputException extends Exception{
	
	String msg;
	
	public InvalidInputException(String msg) throws InvalidInputException{
		super();
		this.msg = msg;
	}
}


public class Exercise2 {

	public static void main(String[] args) throws InvalidInputException {

		Customer customer = new Customer("c12", "raji", "platinum");
		System.out.println(customer.getCustNo());
		System.out.println(customer.getCustName());
		System.out.println(customer.getCategory());
	}

}
