package com.techment.assignment2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int array[] = new int[10];
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter element "+i+ ":");
			array[i]=sc.nextInt();
		}
		for(int i=0 ; i<10; i++)
		{
			for(int j=0; j<10-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting:");
		for(int i=0;i<10;i++)
		{
			System.out.print(array[i]+",");
		}

	}
}
