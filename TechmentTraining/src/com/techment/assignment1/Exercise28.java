package com.techment.assignment1;
import java.util.Scanner;

public class Exercise28 {
	public static void main(String[] args) {
		Exercise28 v = new Exercise28();
		v.valpin();
		
	}
	public int valpin() {
	System.out.print("Enter your PIN:");
	Scanner sc = new Scanner(System.in);
	int pin = sc.nextInt();
	if(pin==12345) {
		System.out.print("PIN Accepted");

	}
	else {
		valpin();
	}
	return 0;
}

}
