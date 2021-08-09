package com.techment.assignment1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {


				System.out.println("Enter number of products:");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				
				int sum=0;
				
				int quantity[] = new int[n];
				
				for(int i=0; i<n; i++)
				{
					System.out.println("Enter quantity of product "+ (i+1) +": " );
					quantity[i]=sc.nextInt();
					
				}
				int total = quantity.length;
				System.out.println("Total no of products:"+total);
				
				for(int i=0; i<n; i++)
				{
					sum=sum+quantity[i];
				}
				System.out.println("Total sum of quantity: "+sum);

	}

}
