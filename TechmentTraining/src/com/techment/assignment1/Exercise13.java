package com.techment.assignment1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		System.out.println("Enter number of products:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max,pos=0;
		
		int quantity[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter quantity of product "+ (i+1) +": " );
			quantity[i]=sc.nextInt();
			
		}
		
		max=quantity[0];
		for(int i=0; i<n ; i++)
		{
			for(int j=i; j<n; j++)
			{
				if(quantity[i]>max)
				{
					max=quantity[i];
					pos=i+1;
				}
			}
		}
		System.out.println("product "+pos+ " has maximum quantity :"+max);
	}

}
