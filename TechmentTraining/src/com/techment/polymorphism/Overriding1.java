package com.techment.polymorphism;

class Bank
{
	public void rateOfInterest()
	{
		System.out.println("3%");
	}
	public void openAccount()
	{
		
	}
}
class SBI extends Bank
{
	public void rateOfInterest()
	{
		System.out.println("5%");
	}
	public void loan()
	{
		System.out.println("yes");
	}
}
class Axis extends Bank
{
	public void rateOfInterest()
	{
		System.out.println("6%");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		 
		SBI sbi = new SBI();
		
		Bank b = new SBI(); //upcasting
		b.rateOfInterest();
		b.openAccount();
	}
}
