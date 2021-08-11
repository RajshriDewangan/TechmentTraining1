package com.techment.codingPractiseTest1;

class Employee1
{
	private String firstName;
	private String lastName;
	
	public Employee1(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void validation()
	{
		if(this.getFirstName()==null||this.getLastName()==null)
		{
			throw new NullPointerException("Entry Missing");
		}

		else if(this.getFirstName().length()<3||this.getFirstName().length()<3)
		{
			throw new NameLengthException("name should be minimum 3 character");
		}

	}
}


class NameLengthException extends Exception{
	
	String msg;

	public NameLengthException(String msg) throws NameLengthException{
		super();
		this.msg = msg;
	}
}
public class Solution3 {

	public static void main(String[] args) throws NameLengthException, NullPointerException {
			
		Employee1 e1=new Employee1("raji ","dewangan");		
		
		e1.validation();
		
		
	}

}