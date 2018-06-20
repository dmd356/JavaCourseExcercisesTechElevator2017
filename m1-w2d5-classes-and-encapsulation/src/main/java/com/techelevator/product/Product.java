package com.techelevator.product;

public class Product {

	/*
	 
	 The Product class has the following properties
	 	name
	 	price
	 	weightInOunces
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in ProductTest.java to verify the functionality of the Product class.  
	 (Please see notes in ProductTest.java for further instructions.)
	 
	 */

	//
	// Write your code below
	//
	
	
	
	private String name;
	private float price;
	private float weightInOunces;
	
	public Product(){
		name = new String();
		price = 0;
		weightInOunces = 0;
	}
	public String getName() {
		

		return name;
	}
	public void setName(String name) {
		System.out.println("Name: " +name);
		this.name = name;
	}
	public float getPrice() {
		System.out.println("Get Price: $" + price);
		return price;
	}
	public void setPrice(float price) {
		if(price > 0){
			System.out.println("Set Price: $" + price);
			this.price = price;
		}
	}
	public float getWeightInOunces() {
		System.out.println("Weight: " + weightInOunces + "oz");

		return weightInOunces;
	}
	public void setWeightInOunces(float weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	
	
}
