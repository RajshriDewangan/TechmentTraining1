package com.techment.practise;

public class Customer {
	
	int Id;
	String name;
	int contact;
	int minbalance;
	
	Customer(int Id, String name,int contact,int minbalance)
	{
		this.Id = Id;
		this.name = name;
		this.contact = contact;
		this.minbalance = minbalance;
	}

	public void customerdetails()
	{
		System.out.println("Customer Id=" +Id);
		System.out.println("Customer name=" +name);
		System.out.println("Customer contact=" +contact);
		System.out.println("Customer minbalance=" +minbalance);

	}
	
	public String accounttype()
	{
		
		if(minbalance==0)
			return "Zero Balance Account" ;
		
		else if(minbalance==1000)
			return "Savings Account" ;

		return "Current Account" ;

	}
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(101, "Raji", 987654321, 1000);
		Customer customer2 = new Customer(103, "Shejal", 765432871, 10000);
		Customer customer3 = new Customer(104, "Raj", 654321321, 0);
		
		customer1.customerdetails();
		System.out.println(customer1.accounttype());
		System.out.println("-----------------------------------");

		customer2.customerdetails();
		System.out.println(customer2.accounttype());
		System.out.println("-----------------------------------");

		customer3.customerdetails();
		System.out.println(customer3.accounttype());
		System.out.println("-----------------------------------");

	}
}
