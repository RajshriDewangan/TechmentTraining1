package com.techment.assignment1;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		System.out.println("Enter a two digit number:");
		
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int temp , val =n ,door=0, digit=0;
		
		while(val>0) {
			
			temp=val%10;
			++digit;
			val=val/10;
		}
		
		if(digit==2) {
			while(n!=0)
			{

			temp=n%10;
			door += temp;
			n=n/10;
		}
		System.out.println("Exit Door is:"+door);
		

		}
		else
			System.out.println("Incorrect Input");
		
		
	}
}
