package com.techment.modal;

import org.springframework.stereotype.Component;



public class GoodDayGreeting implements IGreeting {

	String greeting = "Have a good day.";
	
	public String greet() {
		return greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	
	
}
