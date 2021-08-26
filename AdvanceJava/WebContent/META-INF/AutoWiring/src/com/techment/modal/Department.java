package com.techment.modal;

public class Department {

	String hodName;
	
	
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}


	void deptDetails()
	{
		System.out.println("this is department details");
		System.out.println("minimum 6 dept should be there");
		System.out.println("hod name="+hodName);
	}
}
