package com.techment.modal;

import org.springframework.stereotype.Component;


public class MorningGreeting implements IGreeting {


	String greeting= "Good Morning." ;
	
	public String greet() {
		return greeting ;
	}


	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
