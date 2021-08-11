package com.techment.assignment3.oops;

class Address
{
	String addressLine, city;

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddressDetails()
	{
		return getAddressLine()+","+getCity();
	}
}

class Customer
{
	private String customerName;
	private Address address;
	
	public Customer() {
		System.out.println("Inside Customer Constructor");
	}

	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void getCustomerDetails()
	{
		System.out.println(getCustomerName());
		System.out.println(address.getAddressDetails());
	}
}
public class Exercise1a {

	public static void main(String[] args) {

		Address address1 = new Address("Sector-6", "Bhilai");
		Address address2 = new Address("Greater Kailash", "New Delhi");
		Address address3 = new Address("Whtefield", "Bangalore");
		
//		System.out.println(address1.getAddressDetails());
//		System.out.println(address2.getAddressDetails());
//		System.out.println(address3.getAddressDetails());

		Customer customer1 = new Customer("John",address1);
		Customer customer2 = new Customer("Raji",address1);
		Customer customer3 = new Customer("Shejal",address1);

		customer1.getCustomerDetails();
		customer2.getCustomerDetails();
		customer3.getCustomerDetails();


	}

}
