package com.techment.assignment1;
import java.util.Scanner;

public class Exercise29 {
	public static void main(String[] args) {
		System.out.print("Enter values of height, base and hypotenious:");
		Scanner sc = new Scanner(System.in);
		int height=sc.nextInt();
		int base = sc.nextInt();
		int hypo = sc.nextInt();

		int val1 = height*height + base*base ;
		int val2 = hypo*hypo;
		
		if(val1==val2)
			System.out.println("It is a Right Angle Triangle");
		else
			System.out.println("It is not a Right Angle Triangle");

	}

}
