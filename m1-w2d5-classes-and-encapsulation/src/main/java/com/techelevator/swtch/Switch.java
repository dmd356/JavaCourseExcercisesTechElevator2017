package com.techelevator.swtch; // "swtch" misspelling intentional, "switch" is a Java keyword, and not allowed in package name.

/**
 * This class represents an on-off switch. It turns on. It turns off. And, you can even ask if it's on, or off.
 */
public class Switch {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods.
	//
	private boolean on;

	public Switch() {
		on = false;
	}
	
	/**
	 * Turns the switch on.
	 */
	public void turnOn() {
		if(on == false)
			on = true;
		
		
	}
	
	/**
	 * Turns the switch off.
	 */
	public void turnOff() {
		if(on == true)
			on = false;
	}
	
	/**
	 * @return true if the switch is currently on, otherwise false
	 */
	public boolean isOn() {
		if(on == false){
			return false;
		}
		
		return true;
	}
	
	/**
	 * @return true if the switch is currently off, otherwise false
	 */
	public boolean isOff() {
		if(on == false){
			return true;
		}
			return false;
	}
	
}
