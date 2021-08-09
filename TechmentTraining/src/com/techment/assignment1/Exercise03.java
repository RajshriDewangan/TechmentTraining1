package com.techment.assignment1;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weight of horse 1 :");
		int horse1 = scanner.nextInt();

		System.out.println("Enter weight of horse 2 :");
		int horse2 = scanner.nextInt();

		System.out.println("Enter weight of horse 3 :");
		int horse3 = scanner.nextInt();
		
		
		if(horse1==horse2 || horse2==horse3 || horse1==horse3)
			System.out.println("Entered weights are not distinct values");
		
		else if(horse1>horse2 && horse1>horse3)
			System.out.println("horse1 is best");
		
		else if(horse2>horse1 && horse2>horse3)
			System.out.println("horse2 is best");

		else if(horse3>horse2 && horse3>horse1)
			System.out.println("horse3 is best");


	}
}
