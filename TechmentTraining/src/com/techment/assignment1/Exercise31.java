package com.techment.assignment1;
import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int mul;
		for(int i=1;i<=10;i++) {
			mul=n*i;
			System.out.println(n + "*" + i + "=" + mul);

		}

	}

}
