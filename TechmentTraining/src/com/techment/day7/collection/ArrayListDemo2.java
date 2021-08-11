package com.techment.day7.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("Raji");
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		
		ArrayList<String> a3 = new ArrayList<String>(100);
		a3.add("Hello");

	}

}
