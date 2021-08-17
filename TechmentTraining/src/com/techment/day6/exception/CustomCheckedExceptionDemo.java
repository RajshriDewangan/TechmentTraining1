package com.techment.day6.exception;

class LateException extends Exception
{
	
	public LateException(String msg) {
		super(msg);
	}
	
}
class Student
{
	void login(int time) throws LateException
	{
		if(time>9)
			throw new LateException("You are absent");
		else
			System.out.println("you are present");
	}
}

public class CustomCheckedExceptionDemo {

	public static void main(String[] args) {
 
		Student student = new Student();
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}

}
