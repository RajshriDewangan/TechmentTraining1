package com.techment.day9.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception{

		Employee emp1 = new Employee(1, "abc");
		
		System.out.println("start");
		FileOutputStream fos = new FileOutputStream("hello.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp1);
		System.out.println("complete");
	}

}
