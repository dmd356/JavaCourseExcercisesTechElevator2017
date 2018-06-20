package com.techelevator.person;

public class Person {

	/*
	 
	 The Person class has the following properties
	 	firstName
		lastName
		fullName * 
		age
	 	adult **
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * fullName is derived (i.e. calculated), and does not need a setter.
	  
	 ** adult is derived (i.e. calculated), and does not need a setter. Any person whose age is 18 or greater is an adult.
	 
	 */

	//
	// Write your code below
	//

	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	private String adult;
	
	public Person(){
		firstName = new String();
		lastName = new String();
		fullName = new String();
		age = 0;
		adult = new String();
	}


	public void setFirstName(String firstName) {
		System.out.println("Set first.");
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		System.out.println("Set last.");
		this.lastName = lastName;
	}

	public void getAdult() {
		if(age >= 18)
			System.out.println("You are an Adult!");
		else
		System.out.println("You are a Child!");
	}

	public void setAge(int age) {
		if(age > 0){
			System.out.println("Set age to: " + age);
			this.age = age;
		}
	}


	public void getFullName() {
		System.out.println(firstName + "" + lastName);
	}

	
	
}
