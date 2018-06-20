package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class TruckTesrt {
	// its done
	@Test
	public void init_Truck(){
		Truck lorena = new Truck(4);
		Assert.assertEquals(.4, lorena.calculateToll(10), 1);
	}
	@Test
	public void init_wrong_wheel(){
		Truck lorena = new Truck(1);
		Assert.assertEquals(0, lorena.calculateToll(10), .001);
	}
	@Test
	public void init_wheel_six(){
		Truck lorena = new Truck(6);
		Assert.assertEquals(.45, lorena.calculateToll(10), .001);
	}
	@Test
	public void init_wheel_eight(){
		Truck lorena = new Truck(8);
		Assert.assertEquals(.48, lorena.calculateToll(10), .001);
	}
}
