package com.techment.practise;

class Animal
{
	int legs;
	
	public void display(int legs, int horn)
	{
		System.out.println("legs:"+legs);
		System.out.println("horn: "+horn);
	}

}
class Cow extends Animal
{
	private int horn;
	protected String tail;


}

public class AccessModifiers {

	public static void main(String[] args) {
		
		Cow c = new Cow();
		c.display(4,2);
		Animal a = new Animal();
		a.display(4, 1);
	}
}
