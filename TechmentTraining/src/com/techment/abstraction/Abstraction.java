package com.techment.abstraction;

abstract class Bank
{
	void Eligibility()
	{
		System.out.println("above 18 can open account");
	}
	abstract int rateOfInt(int interestRate);
	
}
class Axis extends Bank
{

	@Override
	int rateOfInt(int interestRate) {

		interestRate = 2*interestRate;
		return interestRate;
	}
}
class Kotak extends Bank
{

	@Override
	int rateOfInt(int interestRate) {
		System.out.println("kotak:"+interestRate);
		return interestRate;
	}
	
}

public class Abstraction
{
	public static void main(String[] args) {
		
		Bank bank = new Kotak();
		System.out.println(bank.rateOfInt(3));
		
		Bank bank1 = new Axis();
		System.out.println(bank1.rateOfInt(3));

	}
}
