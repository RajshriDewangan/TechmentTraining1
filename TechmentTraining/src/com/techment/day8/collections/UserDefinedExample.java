package com.techment.day8.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id,age;
	String name,dept;
	
	public Employee(int id, int age, String name, String dept) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public  String toString() {
		return "Employee [id=" + id + ", name=" + name + ",dept=" +dept;
	}
	@Override
	public int compareTo(Employee o)
	{
		if(this.age>o.age)
			return 0;
		else if(this.age==o.age)
			return 1;
		else
			return -1;
	}
}
public class UserDefinedExample {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, 40, "shan", "hr"));
		employees.add(new Employee(2, 30, "ajit", "sde"));
		employees.add(new Employee(3, 24, "raji", "manager"));
		employees.add(new Employee(4, 33, "shejal", "techlead"));
		
		for(Employee emp : employees)
		{
			System.out.println(emp.id +" "+emp.age+" "+emp.name +" "+emp.dept);
		}
		Collections.sort(employees);

		System.out.println("after sorting");
		
		for(Employee emp : employees)
			System.out.println(emp.id +" "+emp.age+" "+emp.name +" "+emp.dept);

	}

}
