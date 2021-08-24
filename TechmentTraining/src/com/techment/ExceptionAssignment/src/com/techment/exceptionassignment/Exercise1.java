package com.techment.exceptionassignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter num1:");
		int num1 = scanner.nextInt();
		System.out.println("Enter num2:");
		int num2 = scanner.nextInt();
		
		double num3 = num1/num2;
		
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("only Integers are allowed");
		}
	}

}
