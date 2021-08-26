package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //<bean id="e" class="com.techment.emlpoyee">
public class Employee {

	@Autowired
	Address address;
	
	public void displayDetails()
	{
		address.AddressDetails();
	}
}
