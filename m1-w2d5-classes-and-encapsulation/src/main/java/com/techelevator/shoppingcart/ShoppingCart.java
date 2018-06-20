package com.techelevator.shoppingcart;

/**
 * This class represents a shopping cart that you can add different priced items to.  
 */
public class ShoppingCart {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	private int totalNumberOfItems;
	private float totalAmountOwed;
	private double average;
	
	
	public ShoppingCart() {
		 totalNumberOfItems = 0;
		 totalAmountOwed = 0.0f;
		 average = 0f;
		 
		 
		
	}
	
	/**
	 * Adds items to the cart.
	 * 
	 * @param numberOfItems the number of items being added to the cart
	 * @param pricePerItem the price per item being added to the cart
	 */
	public void addItems(int numberOfItems, double pricePerItem) {
		if (numberOfItems > 0 && pricePerItem > 0.0f){
			totalNumberOfItems += numberOfItems;
			totalAmountOwed += pricePerItem * numberOfItems;
			average += pricePerItem/numberOfItems;
			
		}
	}
	
	/**
	 * @return the total number of items that have been added to this cart
	 */
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	
	/**
	 * @return the total price of all items that have been added to the cart
	 */
	public double getTotalAmountOwed() {
		return totalAmountOwed;
		
	}
	
	/**
	 * The average price of all items that have been added to the cart.  This should be equal to 
	 * the totalAmountOwed divided by the totalNumberOfItems.
	 * 
	 * @return the average price of items added to the cart
	 */
	public double getAveragePricePerItem() {
		if(average > 0){
		average = totalAmountOwed/totalNumberOfItems;
		return average;
		}
		return average;
	}

	/**
	 * Removes all items from this cart.
	 */
	public void empty() {
		totalNumberOfItems *=0;
		totalAmountOwed *=0;
		if(average > 0f){
		average *= 0;
	}
	}
}
