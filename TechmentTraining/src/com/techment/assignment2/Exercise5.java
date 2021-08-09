package com.techment.assignment2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row value:");
		int row = sc.nextInt();
		System.out.println("Enter column value:");
		int column = sc.nextInt();
		
		int array1[][]=new int [row][column];
		int array2[][]=new int [row][column];
		int array3[][]=new int [row][column];

		System.out.println("Enter values of array1:");
		for(int i=0; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
			 array1[i][j]=sc.nextInt();
			}

		}
		
		System.out.println("Enter values of array2:");
		for(int i=0; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
			 array2[i][j]=sc.nextInt();
			}

		}
		
		System.out.println("values of array3:");
		for(int i=0; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
			 array3[i][j]=array1[i][j] + array2[i][j];
			 System.out.print(array3[i][j]+"  ");

			}
			System.out.println();

		}

	}

}
