package com.techment.practise;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("Enter any number to multiply:");
		Scanner scanner = new Scanner(System.in);
		
		int number= scanner.nextInt();
		
		System.out.println("Enter limit:");
		int limit = scanner.nextInt();
		
		for(int i=1;i<=limit;i++) {
			System.out.println(number +" * "+i + "=" +number*i);
		}

	}
}
