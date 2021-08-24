package com.techment.practise;

class Parent
{
	String name;
	int age;
	
}

class Child extends Parent
{
	int standard;

	public void display(String name, int age, int standard)
	{
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("standard : "+standard);
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.display("Raji",20,5);
	}
}
