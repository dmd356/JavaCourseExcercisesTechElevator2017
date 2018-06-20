package com.techelevator;

public class Car implements VehicleInterface{
	public double getToll() {
		return toll;
	}




	// its done
	private double toll;
	private boolean hasTrailer;
	
	public Car(boolean pullingTrailer){
		toll = 0.00;
		this.hasTrailer = pullingTrailer;
	}
	
	
	public boolean HasTrailer() {
		return hasTrailer;
	}

	


	public double calculateToll(int distance)
	{
		System.out.println("Car Distance :  "+distance);
		System.out.println("Car hasTrailer :  "+hasTrailer);
		toll = distance * 0.02f;
		if(hasTrailer == true)
		{
			 toll = toll + 1;
			return toll;	
		}
		return toll;
	}
	
}
