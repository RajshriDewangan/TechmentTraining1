package com.techment.day9.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("hello.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee)ois.readObject();
		System.out.println(e.id);
		System.out.println(e.name);

	}

}
