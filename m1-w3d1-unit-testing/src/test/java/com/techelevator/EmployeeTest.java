package com.techelevator;
//DONE
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class EmployeeTest {
	private Employee employee;
	
	@Before
	public void setup(){
		employee = new Employee(1, "Devin", "Distelhorst", 100.00, "Google");
	}
	
	
	@Test
	public void get_name_salary_id(){
		Assert.assertEquals(100.00, employee.getAnnualSalary(), Math.abs(100.00));
		Assert.assertEquals(1, employee.getEmployeeId());
		Assert.assertEquals("Devin" + " " + "Distelhorst", employee.fullName());
		Assert.assertEquals("Google", employee.getDepartment());
	}
	
	@Test
	public void get_negative_salary_id(){
		employee = new Employee(-20, "Devin", "Distelhorst", -100.00, "Google");
		Assert.assertEquals(0, employee.getAnnualSalary(), Math.abs(0));
		Assert.assertEquals(0, employee.getEmployeeId());
	}
	@Test
	public void raise_salary_positive(){
		employee.RaiseSalary(15);
		Assert.assertEquals(115, employee.getAnnualSalary(), Math.abs(115.00));
	}
	@Test
	public void raise_salary_negative(){
		employee.RaiseSalary(-15);
		Assert.assertEquals(100.00, employee.getAnnualSalary(), Math.abs(100.00));
	}
	
//	@Test
//	public void set_dept{
//	
	
	
}
