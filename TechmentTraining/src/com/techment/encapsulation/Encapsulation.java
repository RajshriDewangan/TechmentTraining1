package com.techment.encapsulation;

class Employees
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Employees emp = new Employees();
		
		emp.setId(1);
		System.out.println(emp.getId());
		
		emp.setName("raji");
		System.out.println(emp.getName());
	}
}
