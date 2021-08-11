package com.techment.day8.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Student student1 = new Student(1, 17, "abc");
		Student student2 = new Student(1, 17, "abc");
		
		System.out.println(student1.hashCode());
		System.out.println(student1.hashCode());

		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student(1, 17, "abc"), "cse");
		hm.put(new Student(1, 17, "abc"), "cse");

		for(Entry<Student, String> stu : hm.entrySet())
		{
			System.out.println(stu);
		}
	}

}
