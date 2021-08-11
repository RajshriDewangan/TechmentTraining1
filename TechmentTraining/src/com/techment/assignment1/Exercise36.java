package com.techment.assignment1;
import java.util.Scanner;

public class Exercise36 {
	public static void main(String[] args) {
		System.out.print("Enter values n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		
		for(int i=0 ; i<n ; i++) {
			
			for(int j=1;j<=n-i;j++) {
			System.out.print(j);
			}
			if(temp!=n)
				System.out.print(" ");
			
			for(int k=n-i;k>=1;k--) {
				System.out.print(k);

			}
			System.out.println();
		temp--;
		}
		
	}

}
