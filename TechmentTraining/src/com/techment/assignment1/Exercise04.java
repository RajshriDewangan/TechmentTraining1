package com.techment.assignment1;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		System.out.println("Enter any year:");
		Scanner scanner= new Scanner(System.in);
		int year = scanner.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0)
			System.out.println(year+ " is a leap year");
		
		else
			System.out.println(year+" is not a leap year");
	}
}
