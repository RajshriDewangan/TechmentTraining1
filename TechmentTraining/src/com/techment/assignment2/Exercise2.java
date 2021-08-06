package com.techment.assignment2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		int array[]= {10,23,45,76,87,94};
		int flag=-1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element to find:");
		int n = sc.nextInt();
		
		for(int i=0; i<array.length; i++)
		{
			if(n==array[i])
				flag=i;
		}
		if(flag==-1)
			System.out.println(flag);
		
		else
			System.out.println("Element found at "+flag);
	}
}
