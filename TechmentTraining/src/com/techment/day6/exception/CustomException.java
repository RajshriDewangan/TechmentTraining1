package com.techment.day6.exception;

class AgeException extends RuntimeException
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
class IdNotFoundException extends Exception
{
	String msg;

	public IdNotFoundException(String msg) throws IdNotFoundException,AgeException {
		super();
		this.msg = msg;
	}
	
}

public class CustomException {

	public static void main(String[] args) throws IdNotFoundException, AgeException {

		//throw new AgeException("not a valid age");
		
		throw new IdNotFoundException("Id not found");
		
	}

}
