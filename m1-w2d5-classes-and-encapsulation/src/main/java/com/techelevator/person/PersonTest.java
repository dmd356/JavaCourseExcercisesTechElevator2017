package com.techelevator.person;

public class PersonTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of the Person class
		Person me = new Person();
		me.setFirstName("Devin");
		me.setLastName("Distelhorst");
		me.getFullName();
		me.setAge(21);
		me.getAdult();
	}

}
