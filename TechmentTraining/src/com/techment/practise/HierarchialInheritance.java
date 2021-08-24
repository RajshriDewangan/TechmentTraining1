package com.techment.practise;

class Employee1
{

	Employee1()
	{
		System.out.println("Employee");
	}
}
class Programmer1 extends Employee1
{
	Programmer1()
	{
		System.out.println("Programmer");

	}
}
class Hr extends Employee1
{
	Hr()
	{
		System.out.println("Human Resource ");

	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Hr h = new Hr();
		Programmer1 p = new Programmer1();
	}
}
