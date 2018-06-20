package com.techelevator;

public class KataRomanNumerals {
	private int userNumber;
	private int userRemainder;
	private String result;


	public String makeRomanNum(int userInput){
		String[] lowerNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		String[] upperNumerals = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
		String[] highNumerals = { "", "", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M", "", "MM", "MMM"};

	
		result = "";
		userNumber = userInput;
		userRemainder = 0;
		 
		
			if(userInput < 11)
			{
				return this.result +=lowerNumerals[userInput];
			} 
			else 
			{
				for(int i = 0; i > userNumber;)
				{
				if(userInput % 10 == 0)
				{
					if(userInput > 999)
					{
					this.userRemainder = userRemainder / 1000;
					this.result += highNumerals[userRemainder + 10];
					}
					else if(userInput > 99)
					{
					this.userRemainder = userRemainder / 100;
					this.result += highNumerals[userRemainder];
					} 
					
					else
					{
					this.userRemainder = userRemainder / 10;
					this.result += highNumerals[userRemainder];
					}
				}	
				else if(userInput > 999)
				{
				this.userNumber = userNumber % 1000;
				this.userRemainder = userRemainder / 1000;
				this.result += highNumerals[userRemainder + 10];
				System.out.println("user number in t" + userNumber);
				}
				
				else if(userInput > 99)
				{
					this.userNumber = userNumber % 100;
					this.userRemainder = userInput / 100;
					this.result += highNumerals[userRemainder];
					System.out.println("user number in hundred" + userNumber);
					
				}
				else 
				{	
					this.userNumber = userNumber % 10;
					this.userRemainder = userInput / 10; 
					this.result += upperNumerals[userRemainder];
					this.result += lowerNumerals[userNumber];
					System.out.println("user number in ten" + userNumber);

				}
				
				
				}
		}
		
	
	return result;
}
	

}
