package com.techment.exceptionassignment;

public class Customer {

	private String custNo;
	private String custName;
	private String category;
	
	
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
		
		if(!custNo.startsWith("c") || !custNo.startsWith("C"))
		{
			throw new InvalidInputException("InvalidInputException");
		}
		else if(custName.length()<3)
		{
			throw new InvalidInputException("InvalidInputException");
		}
		else if(category != "platinum" || category!="silver" || category!="gold")
		{
			throw new InvalidInputException("InvalidInputException");
		}
		System.out.println("working");
	}


	public String getCustNo() {
		return custNo;
	}


	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
}
