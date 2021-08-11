package com.techment.assignment1;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight:");
		float weight=scanner.nextFloat();
		
		System.out.println("Enter height:");
		float height=scanner.nextFloat();
		
		float bmi=Exercise23.BmiCalculator( weight, height);
		
		if(bmi<18.5)
			System.out.println("you are underweight");
		
		else if(bmi>=18.5 && bmi<=25)
			System.out.println("you are normal");

		else if(bmi>25 && bmi<=30)
			System.out.println("you are overweight");

		else
			System.out.println("you are obese");

	}
	public static float BmiCalculator(float weight,float height)
	{
		float bmi=weight/(height*height);
		return bmi;
	}

}
