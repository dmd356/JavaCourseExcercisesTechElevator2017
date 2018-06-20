package com.techelevator;
//its done


public class MainVehicle {
	
public static void main(String[] args) {
	 final int randomNum = (int)((Math.random() * 240) +1);
		System.out.println("Nums : " + randomNum);

	 final Car lambo = new Car(true);
	 final Truck chevy = new Truck(8);
	 final Tank tank = new Tank();
	
	 
		VehicleInterface[] vehicleTolls = new VehicleInterface[] { lambo, chevy, tank };
		System.out.println("Welcome to tollbooth. You need the distance and ability to tell cars from truck etc.");
		
		
		
		for(VehicleInterface tolls : vehicleTolls ){
			lambo.calculateToll(randomNum);
			chevy.calculateToll(randomNum);
			tank.calculateToll(randomNum);
			double finalToll;
				if(tolls.getToll() == lambo.getToll())
				{
					finalToll = lambo.getToll();
					System.out.println("Car Toll : " + finalToll);
				}
				else if(tolls.getToll() == chevy.getToll())
				{
					chevy.calculateToll(4);
					finalToll = chevy.getToll();
					System.out.println("Truck Toll : " + finalToll);
				}
				else if(tolls.equals(tank))
				{
					System.out.println("Tank toll : 0");
				}

		}
	}

}
