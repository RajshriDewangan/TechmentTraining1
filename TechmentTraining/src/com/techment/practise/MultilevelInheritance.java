package com.techment.practise;

class Employee
{

	Employee()
	{
		System.out.println("Inside Employee");
	}
}
class Programmer extends Employee
{
	Programmer()
	{
		System.out.println("Inside Programmer");

	}
}
class juniorprogrammer extends Programmer
{
	juniorprogrammer() 
	{
		System.out.println("Inside juniorprogrammer");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		juniorprogrammer jp = new juniorprogrammer();
	}
}
