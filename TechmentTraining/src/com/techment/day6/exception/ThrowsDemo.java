package com.techment.day6.exception;

import java.io.FileNotFoundException;

class Student
{
	void checkEligibility(int age) throws FileNotFoundException
	{
		if(age>=18)
			System.out.println("You can apply for loan");
		else
			throw new FileNotFoundException("you cannot apply ");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {

		Student student = new Student();
		student.checkEligibility(4);
	}

}
