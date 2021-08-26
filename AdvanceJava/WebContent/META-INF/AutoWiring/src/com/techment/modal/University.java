package com.techment.modal;

public class University {

	Department department;
	int noOfStudents;
	
	
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void displayDeptDetails()
	{
		department.deptDetails();
		System.out.println("no of students="+noOfStudents);
	}

	
	
}
