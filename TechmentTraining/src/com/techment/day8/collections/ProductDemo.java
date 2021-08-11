package com.techment.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	int id,price,quantity;
	String name;
	
	public Product(int id, int price, int quantity, String name) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}

	@Override
	public  String toString() {
		return "Product [id=" + id + " , price=" +price+ " , quantity="+quantity+ " , name=" + name +"]" ;
	}
}

class PriceSorting implements Comparator<Product>
{
	@Override
	public int compare(Product o1, Product o2)
	{
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
			return 1;
		return -1;
	}
}

class QuantitySorting implements Comparator<Product>
{
	@Override
	public int compare(Product o1, Product o2)
	{
		if(o1.quantity==o2.quantity)
			return 0;
		else if(o1.quantity<o2.quantity)
			return 1;
		return -1;
	}
}

public class ProductDemo {

	public static void main(String[] args) {

		ArrayList<Product> prodlist = new ArrayList<Product>();
		
		prodlist.add(new Product(1, 1000, 50, "Pens"));
		prodlist.add(new Product(2, 500, 12, "Paper"));
		prodlist.add(new Product(3, 1200, 15, "Pencil"));
		
		for(Product product : prodlist)
		{
			System.out.println(product);
		}
		
		System.out.println("-----------------------");
		for(Product product : prodlist)
		{
			if(product.price>500)
				System.out.println(product);
		}
		System.out.println("-----------------------");
		Collections.sort(prodlist, new PriceSorting());
		for(Product product : prodlist)
		{
			System.out.println(product);
		}

		System.out.println("-----------------------");
		Collections.sort(prodlist, new QuantitySorting());
		for(Product product : prodlist)
		{
			System.out.println(product);
		}
		
	}

}
