package com.techment.assignment2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in array1:");
		int num1=sc.nextInt();
		System.out.println("Enter number of elements in array2:");
		int num2=sc.nextInt();
		
		int num3=num1+num2;

		int array1[] = new int[num1];
		int array2[] = new int[num2];
		int array3[] = new int[num3];

		for(int i=0; i<num1;i++)
		{
				array1[i]=sc.nextInt();
		}
		for(int j=0; j<num2;j++)
		{
				array2[j]=sc.nextInt();
		}

		for(int i=0; i<num1 ; i++)
			array3[i]=array1[i];
		for(int i=num1,j=0; i<num3 ; i++,j++)
			array3[i]=array2[j];

		for(int i=0;i<num3;i++)
		{
			System.out.print(array3[i]+" ");
		}
	}
}
