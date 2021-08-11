package com.techment.assignment1;

import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		for( int i=1 ; i<=3; i++)
		{
		System.out.println("Enter your PIN:");
		int pin = sc.nextInt();
		
		if(pin == 89564)
		{
			System.out.println("PIN ACCEPTED, you now have access to your account");
			flag=true;
			break;
		}
		else
			continue;
		
		}
		if(!flag)
			System.out.println("you have run out of tries, ACCOUNT LOCKED");
	}
	
}
