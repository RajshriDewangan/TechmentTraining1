package com.techment.day7.collection;

import java.util.ArrayList;

public class BatchDemo {

	public static void main(String[] args) {

		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("Sachin");
		batch1.add("Ravi");
		batch1.add("Kumar");
		batch1.add("Amit");
		
		ArrayList<String> batch2 = new ArrayList<String>();
		batch2.add("Kumar");
		batch2.add("Raji");
		batch2.add("Shejal");
		batch2.add("Sachin");
		batch2.add("Shreya");
		
		batch2.addAll(batch1);
		System.out.println("After adding both:"+batch2);
		
		batch2.retainAll(batch1);
		System.out.println("After retaining:"+batch2);
		
		

	}

}
