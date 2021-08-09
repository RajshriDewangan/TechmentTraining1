package com.techment.assignment1;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {

		System.out.println("Enter number of products:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%8==0 && number%3==0)
			System.out.println(number+" is divisible by both 8 and 3");
		
		else
			System.out.println(number+" is not divisible by both 8 and 3");

	}

}
