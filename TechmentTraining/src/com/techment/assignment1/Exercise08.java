package com.techment.assignment1;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		System.out.println("Enter any number:");
		
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int newnum=0;

		int temp=n;
		while(n!=0) {
			int rem=n%10;
			newnum = newnum + (rem*rem*rem);
			n=n/10;
		}
		if(temp==newnum)
			System.out.println(temp+" is an armstrong number");
		
		else
			System.out.println(temp+" is not an armstrong number");
		
	}
}
