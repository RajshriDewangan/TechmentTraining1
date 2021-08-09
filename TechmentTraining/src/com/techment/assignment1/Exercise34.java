package com.techment.assignment1;

import java.util.Scanner;

public class Exercise34 {

	public static void main(String[] args) {

		System.out.println("Enter number of lines:");
		
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=0 ; i<n; i++)
		{
			for(int j=n ; j<=n-i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
