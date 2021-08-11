package com.techment.codingPractiseTest1;

class Animal
{
	public void shout()
	{
		System.out.println("All animals shout");
	}
}
class Dog extends Animal
{
	public void shout()
	{
		System.out.println("Dogs Bark");
	}

}
class Horse extends Animal
{
	public void shout()
	{
		System.out.println("Horse neigh ");
	}

}
class Cat extends Animal
{
	public void shout()
	{
		System.out.println("Cats meow");
	}

}

public class Solution4 {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		animal1.shout();
		
		Animal animal2 = new Dog();
		animal2.shout();
		
		Animal animal3 = new Horse();
		animal3.shout();
		
		Animal animal4 = new Cat();
		animal4.shout();

	}

}
