package com.techment.assignment1;

import java.util.Scanner;

public class Exercise40 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row value:");
		int row = sc.nextInt();
		System.out.println("Enter column value:");
		int column = sc.nextInt();
		
		int array1[][]=new int [row][column];

		System.out.println("Enter values of array:");
		for(int i=0; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
			 array1[i][j]=sc.nextInt();
			}

		}
		
		System.out.println("original matrix:");
		for(int i=0; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
				System.out.print(array1[i][j]+" ");
			
			System.out.println();
		}

		
		System.out.println("mirror matrix:");
		for(int i=0; i<row ; i++)
		{
			for(int j=column ; j>0 ; j--)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();

		}


	}

}
