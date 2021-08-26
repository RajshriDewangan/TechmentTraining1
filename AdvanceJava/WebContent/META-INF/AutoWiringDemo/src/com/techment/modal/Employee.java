package com.techment.modal;

public class Employee {

	private Address address;
	private String empName;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", empName=" + empName + "]";
	}
	
}
