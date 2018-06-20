package com.techelevator;

public class Employee {

	private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

    /**
     * Creates a new employee 
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param salary
     */
    public Employee(int employeeId, String firstName, String lastName, double salary, String department) {
    	if(salary > 0.00f && employeeId > 0){
    	this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
        this.department = department;
    	}
    }

    /**
     * Employee Id
     * @return employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Employee first name
     * @return firstname
     */
    public String fullName() {
        return firstName + " " + lastName;
    }

    /**
     * Employee last name
     * @return lastName
     */
    

    /**
     * Department
     * @return department
     */
    public String getDepartment() {
        return department;
    }

   
    /**
     * Annual Employee Salary 
     * @return
     */
    public double getAnnualSalary() {
        return annualSalary;        
    }

    /**
     * Provides the employee a percentage-based raise. Raise cannot be negative. 
     * @param percentage number-based percentage (where 1% = 1.0, 2% = 2.0)
     */
    public void RaiseSalary(double percentage) {
    	if(percentage > 0 && percentage < 101)
    	{
        double raiseAmount = annualSalary * percentage/100;
        annualSalary += raiseAmount;
    	}
    }
    
    
    
}
