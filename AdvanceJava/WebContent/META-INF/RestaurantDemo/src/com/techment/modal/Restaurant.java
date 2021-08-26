package com.techment.modal;

import java.util.List;

public class Restaurant {

	String restaurantName;
	IHotDrink hotDrink;
	ISoftDrink softDrink;
	List<String> employeesNames;
	
	public void setEmployeesNames(List<String> employeesNames) {
		this.employeesNames = employeesNames;
	}


	
	
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}


	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}


	public void displayRestaurantDetails()
	{
		System.out.println("Restaurant Name: "+restaurantName);
		hotDrink.drink();
		softDrink.drink();
	}
	
	

}
