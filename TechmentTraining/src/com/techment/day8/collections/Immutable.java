package com.techment.day8.collections;

public class Immutable {

	public static void main(String[] args) {

		String courseName = "java";
		System.out.println("courseName : " +courseName);
		
		courseName.concat("programming");
		
		System.out.println(courseName);
		
		courseName = courseName.concat("prog");
		System.out.println(courseName);

	}

}
