package com.techment.assignment4.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Patient
{
	private int id,age;
	private String name;
	
	public Patient(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public  String toString() {
		return "Patient [id=" + id + "age="+age+ ", name=" + name +"]" ;
	}

}
class NameSorting implements Comparator<Patient>
{
	public int compare(Patient o1, Patient o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
}
class AgeSorting implements Comparator<Patient>
{
	@Override
	public int compare(Patient o1, Patient o2)
	{
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		return -1;
	}
}


public class TestPatientList {

	public static void main(String[] args) {

		ArrayList<Patient>	list = new ArrayList<Patient>();
		list.add(new Patient(1, 20 , "abc"));
		list.add(new Patient(2, 19 , "xyz"));
		list.add(new Patient(3, 23 , "rbc"));

		for(Patient patient : list)
		{
			System.out.println(patient);
		}
		
		System.out.println("--------sorted by name--------");
		
		Collections.sort(list, new NameSorting());
		for(Patient patient : list)
		{
			System.out.println(patient);
		}

		System.out.println("-------sorted by age-------");
		Collections.sort(list, new AgeSorting());
		for(Patient patient : list)
		{
			System.out.println(patient);
		}
		
		TreeSet<Patient> tree = new TreeSet<Patient>(list);
		//tree.add(new Patient(1, 20 , "abc"));
		//tree.add(new Patient(2, 19 , "xyz"));
		//tree.add(new Patient(3, 23 , "rbc"));
		
		for(Patient patient : tree)
		{
			System.out.println(patient);
		}
		
	}

}
