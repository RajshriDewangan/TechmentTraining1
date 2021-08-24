package com.techment.abstraction;

interface Bank1
{
	void rateOfInt();
}
class Idfc implements Bank1
{

	@Override
	public void rateOfInt() {
		System.out.println("4%");		
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {

		Bank1 bank1 = new Idfc();
		bank1.rateOfInt();
		
		Idfc idfc = new Idfc();		
		idfc.rateOfInt();
	}

}
