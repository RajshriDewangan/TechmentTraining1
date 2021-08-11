package com.techment.codingPractiseTest1;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

		int children=0, adult=0,senior=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of people:");
		int people = sc.nextInt();

		int age[]=new int [people];

		System.out.println("Enter age of all:");
		for(int i=0; i<people ; i++)
		{
			age[i]=sc.nextInt();
			
			if(age[i] < 18)
				children++ ;
			
			else if(age[i]>=18 && age[i]<55)
				adult++ ;
			
			else if(age[i]>=55)
				senior++ ;
		}
		
		System.out.println("Children: "+children);
		System.out.println("Adult: "+adult);
		System.out.println("Senior Citizen: "+senior);
	}

}
