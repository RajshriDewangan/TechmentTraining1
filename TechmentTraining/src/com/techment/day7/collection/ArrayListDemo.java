package com.techment.day7.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		System.out.println("size:"+obj.size());
		obj.add(1);
		obj.add("Raji");
		obj.add(10.6);
		
		System.out.println("size after adding elements:"+obj.size());
		System.out.println(obj);
		
		obj.add(3, "hello");
		System.out.println(obj);
		
		obj.remove(Integer.valueOf(1));
		System.out.println(obj);
	}

}
