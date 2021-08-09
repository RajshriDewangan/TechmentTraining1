package com.techment.assignment1;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number1 :");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter number2 :");
		int num2 = scanner.nextInt();

		for(int i=num1; i<=num2; i++)
		{
			System.out.println( "soldier "+i+ " will go");
		}
	}
}
