package com.techment.assignment2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		int max1 , max2 , low1 , low2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter element "+i+ ":");
			array[i]=sc.nextInt();
		}
		
		max1 = array[0];
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n; j++)
			{
				if(max1<array[i])
					max1=array[i];
			}
		}
		System.out.println("Largest element:"+max1);
		
		low1 = array[0];
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n; j++)
			{
				if(low1>array[i])
					low1=array[i];
			}
		}
		System.out.println("Smallest element:"+low1);

	}

}
