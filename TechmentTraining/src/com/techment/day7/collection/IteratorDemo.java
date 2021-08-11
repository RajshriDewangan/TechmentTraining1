package com.techment.day7.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		
		System.out.println(a1);

		Iterator<Integer> itr=a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
