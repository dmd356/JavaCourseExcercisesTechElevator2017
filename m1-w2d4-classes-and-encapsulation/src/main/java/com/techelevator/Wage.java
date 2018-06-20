package com.techelevator;

public class Wage {
	private int employeeId;
	private String name;
	private String department;
	private double salary;
	
public Wage(){
		employeeId = 0;
		salary = 0.00;
		name = new String();
		department = new String();
	}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	if(name != null && !name.isEmpty()){
		this.name = name;
	}
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	if(department != null && !department.isEmpty()){
	this.department = department;
	}
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	if(salary > 0.00f){
	this.salary = salary;
	}
}

public double raiseSalary(double percent){
	double percentage = (double)percent/salary;
	double finalPercent = percentage * salary;
	return salary += finalPercent;
	
	
}


	
	
	
	
}
