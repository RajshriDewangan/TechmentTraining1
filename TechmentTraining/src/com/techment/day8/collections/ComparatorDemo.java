package com.techment.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int id,age;
	String name;
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public  String toString() {
		return "Student [id=" + id + "age="+age+ ", name=" + name +"]" ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
class AgeSorting implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		return -1;
	}
}
class NameSorting implements Comparator<Student>
{
	public int compare(Student o1, Student o2)
	{
		return o1.name.compareTo(o2.name);
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Student>	stulist = new ArrayList<Student>();
		stulist.add(new Student(1, 20 , "abc"));
		stulist.add(new Student(2, 19 , "xyz"));
		stulist.add(new Student(3, 23 , "rbc"));

		for(Student student : stulist)
		{
			System.out.println(student);
		}
		
		System.out.println("-----------------------");
		Collections.sort(stulist, new AgeSorting());
		for(Student student : stulist)
		{
			System.out.println(student);
		}
		
		System.out.println("-----------------------");

		Collections.sort(stulist, new NameSorting());
		for(Student student : stulist)
		{
			System.out.println(student);
		}


	}

}
