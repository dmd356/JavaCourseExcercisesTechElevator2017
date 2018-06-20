package com.techelevator.dog;

/**
 * This class represents a dog that can sleep, wake, and make a sound, so it's pretty much like most dogs,
 * with a few essential methods missing. Thankfully.
 */
public class Dog {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	
	private boolean sleepStatus; //true for asleep, false for awake
	private boolean isWake;
	private String bark;
	private String zZZ;
	
	public Dog() {
		sleepStatus = false;
		bark = new String();
			
	}
	
	/**
	 * @return "woof!" if the dog is awake, otherwise "Zzzz..."
	 */
	public String makeSound() {
		if(sleepStatus == false){
			return bark = "woof!";
		}
		else
			return bark = "Zzzz...";
	}
	
	/**
	 * Puts the dog to sleep
	 */
	public void sleep() {
		if(sleepStatus == false){
			 sleepStatus = true;
			
		}
	}
	
	/**
	 * Wakes the dog up
	 */
	public void wakeUp() {
		if(sleepStatus == true){
			sleepStatus = false;
		}
	}
	
	/**
	 * @return true if the dog is sleeping, otherwise false
	 */
	public boolean isSleeping() {
		if(sleepStatus == true){
			return true;
		}return false;
	}
}
