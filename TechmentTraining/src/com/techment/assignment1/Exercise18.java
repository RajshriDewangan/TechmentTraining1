package com.techment.assignment1;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		double num1 = sc.nextInt();
		
		System.out.println("Enter number 2:");
		double num2 = sc.nextInt();

		try {
			double val = num1/num2;
			System.out.println(val);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("inside finally block");
		}
	}
		// TODO Auto-generated method stub

}
