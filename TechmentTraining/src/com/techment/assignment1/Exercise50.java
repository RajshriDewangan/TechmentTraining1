package com.techment.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise50 {

	public static void main(String[] args) {
		
		boolean equal=true;
		
		System.out.println("Enter two strings:");
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");

		
		if(str1.length()==str2.length())
		{
			char arr1[]=str1.toLowerCase().toCharArray();
			char arr2[]=str2.toLowerCase().toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			equal=Arrays.equals(arr1, arr2);
			
		}
		else
		{
			equal=false;
			System.out.println("string length not same");
		}
		if(equal)
			System.out.println("Anagram");
		
		else
			System.out.println("Not Anagram");
		
	}

}
