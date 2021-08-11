package com.techment.day7.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		l1.add(1);
		l1.add(2);
		l1.addLast(101);
		l1.add(3);
		l1.addFirst(00);
		l1.add(4);
		
		System.out.println(l1);

		l1.removeLast();
		System.out.println(l1);
	}

}
