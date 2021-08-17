package com.techment.day5.oops;

class Employee
{
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployee()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.doorNo);
		System.out.println(address.streetName);
		System.out.println(address.city);
		System.out.println(address.pincode);

	}
	
}
class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	
}
public class HasARelation {

	public static void main(String[] args) {
		
		Address address = new Address(2, "35", "Bhilai", 490000);
		
		Employee employee = new Employee(12, "Raji", address);
		employee.displayEmployee();
	}
}
