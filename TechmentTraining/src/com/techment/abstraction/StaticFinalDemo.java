package com.techment.abstraction;

class Employee
{
	static String dept;
	final int id=1;
}

public class StaticFinalDemo {

	public static void main(String[] args)
	{

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.dept="hr";
		e2.dept="developer";
		
		System.out.println(e1.dept);
		System.out.println(e2.dept);
	}

}
