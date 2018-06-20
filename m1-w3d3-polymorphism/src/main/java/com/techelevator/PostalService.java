package com.techelevator;

public class PostalService implements DeliveryDrive {
	private int ounce;
	private int lbs;
	private double firstClass;
	private double secondClass;
	private double thirdClass;
	private double[] rates;

	
	public PostalService(){
		rates = new double[] { this.getFirstClass(), this.getSecondClass(), this.getFirstClass()};
		ounce = 0;
		lbs = 0;
		firstClass = 0;
		secondClass = 0;
		thirdClass = 0;
			
	}

	public double[] calculateRate(double distance, int weightInOZ)
	{
		for(int i = 0; i < weightInOZ; i++)
		{
			if(ounce == 16)
			{
				lbs++;
				ounce *=0;

			}			
				ounce++;
		}
		 double firstRateOZ = .035; 
		 double secondRateOZ = firstRateOZ * .1;
		 double thirdRateOZ = .002;
		 
		 double firstRateP = .195; 
		 double secondRateP = firstRateP * .1;
		 double thirdRateP = .015;
		
		if (ounce >= 0 && ounce <= 2 && lbs == 0)
		{
			this.firstClass = firstRateOZ;
			this.secondClass = secondRateOZ;
			this.thirdClass = (thirdRateOZ) *distance;
			return rates;
		}	
		if(ounce >= 3 && ounce < 9 && lbs == 0)
		{
			firstRateOZ = (firstRateOZ + .005) * distance;
			this.firstClass = firstRateOZ;
			this.secondClass = secondRateOZ;
			this.thirdClass = (thirdRateOZ + .0002) *distance;
			return rates;
		}
		
		if(ounce >= 9 && ounce < 16 && lbs == 0)
		{			
			firstRateOZ = (firstRateOZ + .012) * distance;
			this.firstClass = firstRateP;
			this.secondClass = secondRateOZ;
			this.thirdClass = (thirdRateOZ + .0004) * distance;
			return rates;
		}
		
		if(lbs < 4)
		{			
			firstRateP = firstRateP * distance;
			this.firstClass = firstRateP;
			System.out.println(firstRateP);
			this.secondClass = secondRateP;
			this.thirdClass = (thirdRateP) * distance;
			return rates;
		}
		
		if(lbs > 3 && lbs < 9)
		{
		
			firstRateP = (firstRateP + .255) * distance;
			this.firstClass = firstRateP;
			this.secondClass = secondRateP;
			secondClass = secondRateP;
			this.thirdClass = (thirdRateP + .001) * distance;
			return rates;
		}
		
		if(lbs >= 9)
		{
			firstRateP= (firstRateP + .305) * distance;
			this.firstClass = firstRateP;
			System.out.println(firstRateP);
			this.secondClass = secondRateP;
			System.out.println(secondRateP);
			this.thirdClass = (thirdRateP + .002) * distance;
			System.out.println(thirdRateP);
		}
		return rates;
		}
		
		
		
	
	
		
	


	public int getWeight(boolean ounces) {
		if(ounces == true){
		return ounce;
		}
		else{
			return lbs;
		}
	}


	public double getFirstClass() {
		return firstClass;
	}

	public double getSecondClass() {
		return secondClass;
	}


	public double getThirdClass() {
		return thirdClass;
	}
	public double[] getRate()
	{
		return rates;
	}
}
