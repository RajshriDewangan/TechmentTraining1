package com.techment.assignment1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		
		int flag=0;
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=1; i<=num ; i++)
		{
			for(int j=2 ; j<i/2 ; j++)
			{
				if(i%j==0)
				{
					flag=1;
					if(flag==0)
						System.out.println(j+",");
				}
			}
		}

	}

}
