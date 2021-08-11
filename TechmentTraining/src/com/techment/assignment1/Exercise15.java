package com.techment.assignment1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int flag=1;
		
		System.out.println("Enter number of elements in array1:");
		int num1=sc.nextInt();
		System.out.println("Enter number of elements in array2:");
		int num2=sc.nextInt();
		
		int array1[] = new int[num1];
		int array2[] = new int[num2];

		for(int i=0; i<num1;i++)
		{
				array1[i]=sc.nextInt();
		}
		for(int j=0; j<num2;j++)
		{
				array2[j]=sc.nextInt();
		}
		for(int i=0,j=0; (i<num1 && j<num2) ;i++,j++)
		{
			if(array1[i]==array2[j])
				continue;
			else
				flag=0;
		}
		if(flag==1)
			System.out.println("Both arrays are same");
		else
			System.out.println("Both arrays are not same");

	}

}
