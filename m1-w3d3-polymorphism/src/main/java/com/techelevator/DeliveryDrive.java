package com.techelevator;

public interface DeliveryDrive {

	public static double calculateRate(double distance, int weightInOZ)
	{
		return 0.0;
	}
	public static double getRate()
	{
		return DeliveryDrive.getRate();
	}
	public static double getFirst()
	{
		return DeliveryDrive.getFirst();
	}
	public static double getSecond()
	{
		return DeliveryDrive.getSecond();
	}
	public static double getThird()
	{
		return DeliveryDrive.getThird();
	}
	public static double getFourDay() 
	{
		return DeliveryDrive.getFourDay();
	}
	public static double getTwoDay() 
	{
		return DeliveryDrive.getTwoDay();
	}
	public static double getOneDay() 
	{
		return DeliveryDrive.getOneDay();
	}
	
}
