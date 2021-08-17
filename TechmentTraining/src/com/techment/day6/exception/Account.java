package com.techment.day6.exception;

public class Account {

	int balance=5000;
	
	String withdraw(int amount)
	{
		if(amount<balance)
			throw new InSufficientFundException("InSufficient Fund");
		else
			return "you have withdraw "+amount+" amount";
	}
}
