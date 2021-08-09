package com.techment.assignment1;

import java.util.Scanner;

public class Exercise48 {

	public static void main(String[] args) {

		System.out.println("Enter number in binar form:");
		
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		int temp,rem,i=0,sum=0;
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=(int)(sum+(rem*Math.pow(2, i)));
			i++;
			temp=temp/10;
		}
		System.out.println("Integer value of "+num+" is:"+sum);
	}

}
