package com.techment.day8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(4);
		hs.add(1);
		hs.add(20);
		hs.add(3);
		hs.add(5);
		hs.add(10);

		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(4);
		lhs.add(1);
		lhs.add(20);
		lhs.add(4);
		lhs.add(5);
		lhs.add(10);
		lhs.add("xyz");

		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(1);
		ts.add(5);
		ts.add(20);
		ts.add(0);
		//ts.add("xyz");


		System.out.println(ts);
	}

}
