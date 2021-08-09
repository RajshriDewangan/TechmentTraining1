package com.techment.assignment1;
import java.util.Scanner;

public class Exercise52 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 sides of a number:");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		
		if((side1+side2) > side3)
			System.out.println("Triangle can be formed");
		
		else if((side1+side3) > side2)
			System.out.println("Triangle can be formed");
		
		else if((side2+side3) > side1)
			System.out.println("Triangle can be formed");
		
		else
			System.out.println("Triangle cannot be formed");

	}
}
