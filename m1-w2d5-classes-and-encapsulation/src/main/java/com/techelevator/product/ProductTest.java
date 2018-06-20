package com.techelevator.product;

public class ProductTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of your Product class
		Product me = new Product();
		me.setName("Cheese");
		me.getName();
		me.setPrice(2.99f);
		me.getPrice();
		me.setWeightInOunces(1.30f);
		me.getWeightInOunces();
	}

}
