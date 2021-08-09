package com.techment.assignment1;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		 
		System.out.println("Enter number of lines:");
		
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=0 ; i<n; i++)
		{
			int temp=i;
			for(int j=1 ; j<=n-i; j++)
			{
				System.out.print(j);
			}
			for(int k=n-i-1 ; k>=1; k--)
			{
				System.out.print(k);
			}
			System.out.println();
			
			while(temp!=0)
			{
				System.out.print(" ");
				temp--;
			}
		}
		
	}
}
