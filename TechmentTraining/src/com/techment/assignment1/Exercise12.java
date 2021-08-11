package com.techment.assignment1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int temp=n;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				while(--temp>0)
					System.out.print(" ");

				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
