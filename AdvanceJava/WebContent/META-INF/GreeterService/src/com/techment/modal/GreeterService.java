package com.techment.modal;

public class GreeterService {

	IGreeting greeting;

	public void printGreeting() {

		System.out.println(greeting.greet());
	}

	public IGreeting getGreeting() {
		return greeting;
	}

	public void setGreeting(IGreeting greeting) {
		this.greeting = greeting;
	}

}
