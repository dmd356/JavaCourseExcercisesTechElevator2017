package com.techelevator.company;

public class Company {

	/*
	 
	 The Company class has the following properties
		name
		numberOfEmployees
		revenue
		expenses
	 	companySize * 
	 	profit **	 

	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * companySize is derived (i.e. calculated), and does not need a setter. A company is "small" if less than 50 employees,
	  	"medium" if between 51 and 250 employees, "large" if greater than 250 employees.
	  	
	 ** profit is derived (i.e. calculated), and does not need a setter. Profit equals revenue minus expenses.
	 
	 */

	//
	// Write your code below
	//
	
	
	private String name;
	private int numberOfEmployees;
	private int revenue;
	private int expenses;
	private String companySize; //noSet
	private int profit; //noSet
	
	public Company(){
		numberOfEmployees = 0;
		revenue = 0;
		expenses = 0;
		companySize = "";
		profit = 0;
		name = new String();
	}

	public String getName() {
		System.out.println("Hello" + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		System.out.println("Number of Employees: " + numberOfEmployees);
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		System.out.println("Set Number of Employees: " + numberOfEmployees);

		this.numberOfEmployees = numberOfEmployees;
	}

	public int getExpenses() {
		System.out.println("Expenses: " + expenses);

		return expenses;
	}

	public void setExpenses(int expenses) {
		System.out.println("Set Expenses: " + expenses);

		this.expenses = expenses;
	}

	public String getCompanySize() {
		System.out.println(companySize);

		return companySize;
	}

	public String companySizeCalc(){
		if(numberOfEmployees < 50){
			return companySize += "Company is Small.";
			
		}else if(numberOfEmployees >= 51 && numberOfEmployees <= 250){
			 return companySize += "Company is Medium.";
		}
		else{
			return companySize += "Company is Large.";
		}
		
	}
	public void calcProfit() {
		int profet = revenue - expenses;
		profit +=profet;
		System.out.println("Profit: " + profit);
	}

	public int getRevenue() {
		System.out.println("Revenue: " + revenue);

		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	

}
