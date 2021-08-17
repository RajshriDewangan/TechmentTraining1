package com.techment.day5.oops;

class Car
{
	String carname,model;
	Engine engine;
	
	public Car(String carname, String model, Engine engine) {
		super();
		this.carname = carname;
		this.model = model;
		this.engine = engine;
	}
	public void displayCar()
	{
		System.out.println(carname);
		System.out.println(model);
		System.out.println(engine.engineId);
		System.out.println(engine.engineType);
	}
	
}
class Engine
{
	int engineId;
	String engineType;
	
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
}

public class HasARelationDemo {

	public static void main(String[] args) {

		Engine eng = new Engine(32, "xyz");
		
		Car car = new Car("XUV", "Vxi", eng);
		car.displayCar();
		
	}

}
