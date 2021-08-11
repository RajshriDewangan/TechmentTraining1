package com.techment.day7.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(100);
		a2.add(101);
		a2.add(5);
		a2.add(102);
		a2.add(1);
		a2.addAll(a1);
		System.out.println(a2);

		//a2.removeAll(a1);
		//a2.retainAll(a1);
		//System.out.println(a2);
		
		Collections.sort(a2);
		System.out.println(a2);

	}

}
