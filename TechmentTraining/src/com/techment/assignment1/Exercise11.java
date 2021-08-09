package com.techment.assignment1;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
