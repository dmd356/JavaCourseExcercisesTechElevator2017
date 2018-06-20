package com.techelevator.company;

public class CompanyTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of the Company class

		Company myComp = new Company();
		myComp.setName("Devin Distelhorst");
		myComp.getName();
		myComp.setNumberOfEmployees(49);
		myComp.setRevenue(659352);
		myComp.getRevenue();
		myComp.setExpenses(1000);
		myComp.companySizeCalc();
		myComp.getCompanySize();
		myComp.calcProfit();
		System.out.println("A ba dab dab thats all folks!");
		
		
	}

}
