package com.techelevator;

public class FexEd implements DeliveryDrive {
	
	private double rate;
	
	public FexEd(){
		rate = 20;
	}

	public double calculateRate(double distance, int weightInOZ) {
		if (distance > 500)
		{
			rate = rate + 5;
			System.out.println("rate : "+rate);
			return rate;
		}if(weightInOZ > 48)
		{
			rate = rate + 3;
			System.out.println("rate : "+rate);
			return rate;

		}
		else{
			System.out.println("rate : "+rate);
			return rate;
		}
		
	}

	public double getRate() {
		System.out.println("rate : "+rate);
		return rate;
	}
	
	public double getFirst(){
		return rate;
	}
	public  double getSecond(){
		return rate;
	}
	public double getThird(){
		return rate;
	}	
	public double getFourDay() {
		return rate;
	}
	public double getTwoDay() {
		return rate;
	}
	public double getOneDay() {
		return rate;
	}
	
}
