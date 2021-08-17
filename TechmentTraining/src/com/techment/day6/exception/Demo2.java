package com.techment.day6.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter number1");
			int num1=scanner.nextInt();
			
			System.out.println("Enter number2");
			int num2=scanner.nextInt();

			int result=num1+num2;
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
 
	}
}
