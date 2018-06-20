package com.techelevator;
//its done


public class Truck implements VehicleInterface {
	private double toll;
	private int axles;
	
	public Truck(int axles){
		if(axles == 4 || axles == 6 || axles == 8){
			this.axles = axles;	
		}
	}

	




@Override
public double calculateToll(int distance)
	{	
	double rpm = 0;

		if(axles == 4 || axles == 6 || axles >= 8)
		{
			if(axles == 4)
			{	
				rpm = .04;
				this.toll = rpm * distance;
				System.out.println("Truck Distance : " +distance);
				System.out.println( "Truck Axles : "+axles);
				return toll;
			}
			else if(axles == 6){
				rpm = .045;
				toll = rpm * distance;
				System.out.println("Truck Distance : " +distance);
				System.out.println( "Truck Axles : "+axles);
				return this.toll;
			}
			else if(axles >= 8){
				rpm = .048;
				toll = rpm * distance;
				System.out.println("Truck Distance : " +distance);
				System.out.println( "Truck Axles : "+axles);
				return toll;
			}
			
		}
		else{
			return toll;
		}
		return toll;
	}





public double getToll() {
	return toll;
}
}

