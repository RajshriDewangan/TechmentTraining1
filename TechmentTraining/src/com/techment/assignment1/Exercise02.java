package com.techment.assignment1;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		System.out.print("Enter date between 1 to 31 :");
		
		Scanner scanner = new Scanner(System.in);
		int date = scanner.nextInt();
		
		if(date<=31) {
			
			if(date%2==0)
				System.out.println("Cars with even registration numbers are permitted today");
			
			else
				System.out.println("Cars with odd registration numbers are permitted today");

		}
		else if(date==0 || date>31 || date<0)
			System.out.println("INVALID INPUT-Enter correct date between 1 to 31");
		
	}

}
