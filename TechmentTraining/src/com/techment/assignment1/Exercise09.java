package com.techment.assignment1;

import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args)
	{
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of n:");
		int n = scanner.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			System.out.print((i*i*i)+ " ,");
		}
	}
}
