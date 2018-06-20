package com.techelevator;
// its done

public class Tank implements VehicleInterface {
	public double getToll() {
		return toll;
	}

	private double toll;
	
	public Tank()
	{
		toll = 0.00;
	}

	public double calculateToll(int distance)
	{
		System.out.println("Tank Distance :  "+distance);
		return toll;
	}
}
