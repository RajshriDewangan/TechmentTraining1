package com.techment.day6.exception;

public class Demo1 {

	public static void main(String[] args) {

		int arr[]=new int[4];
		
		System.out.println("Hello");
		System.out.println("welcome");
		try
		{
			System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont divide by zero");
		}
		try
		{
			arr[7]=34;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Thankyou");
	}

}
