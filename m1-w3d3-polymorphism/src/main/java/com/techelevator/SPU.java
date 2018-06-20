package com.techelevator;

import java.util.Scanner;

public class SPU implements DeliveryDrive {
	private double fourDay;
	private double twoDay;
	private double oneDay;
	
	public SPU(){
		fourDay = 0;
		twoDay = 0;
		oneDay = 0;
	}


	public void calculateRate(double distance, int weightInOZ) {
		Scanner input = new Scanner(System.in);
		System.out.println("1 for Four-Day Ground Rate:");
		System.out.println("2 for Two-Day Business Rate:");
		System.out.println("3 for Next-Day Rate:");
		Integer rateX = input.nextInt();
		if(rateX == 1)
		{
			fourDay = (weightInOZ * 0.0050) * distance;
		}
		else if(rateX == 2)
		{
			twoDay =(weightInOZ * 0.050) * distance;
		}
		else if(rateX == 3)
		{
			oneDay = (weightInOZ * 0.075) * distance;
		}
	}

	public double getFourDay() {
		System.out.println("Four-Day Ground Rate: " + fourDay);

		return fourDay;
	}

	public double getTwoDay() {
		System.out.println("Two-Day Business Rate: " + twoDay);

		return twoDay;
	}

	public double getOneDay() {
		System.out.println("Next Day Rate: " + oneDay);

		return oneDay;
	}
	public static double getFirst()
	{
		return 0;
	}
	public static double getSecond()
	{
		return 0;
	}
	public static double getThird()
	{
		return 0;
	}
	public static double getRate()
	{
		return 0;
	}
	
}
