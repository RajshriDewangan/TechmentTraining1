package com.techment.codingPractiseTest1;

class Employee
{
	String fname , lname;

	public Employee(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	@Override
	public String toString()
	{
		return "Employee [ FirstName=" +fname+ ", LastName=" +lname ;
	}
}

public class Solution2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Raji", "Dewangan");
		Employee employee2 = new Employee("Raji", "Dewangan");
		Employee employee3 = new Employee("Raji", "Dewangan");
		
		employee1.toString();

	}

}
