package com.techelevator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		final PostalService post = new PostalService();
		final SPU spu = new SPU();
		final FexEd fexed = new FexEd();
		DeliveryDrive[] drivers = new DeliveryDrive[]{ post, spu, fexed};
		System.out.println( );

		System.out.println("Please enter Distance : " );
		Scanner input = new Scanner(System.in);
		Integer y = input.nextInt();
		if(y > 0){
			System.out.println("Distance : " + y);
			
		}		
		System.out.println("Please enter weight in Ounces : " );
		Integer x = input.nextInt();
		System.out.println("Weight: " + x);
		post.calculateRate(x, y);
		spu.calculateRate(x, y);
		fexed.calculateRate(x, y);
		
		fexed.getRate();
		post.getFirstClass();
		post.getSecondClass();
		post.getThirdClass();
		spu.getFourDay();
		spu.getTwoDay();
		spu.getOneDay();
		System.out.println("First Class : " +post.getFirstClass());
		System.out.println("Second Class : " +post.getSecondClass());
		System.out.println("Third Class : " +post.getThirdClass());
		System.out.println("SPU Four Day : " + spu.getFourDay());			
		System.out.println("SPU Two Day : " + spu.getTwoDay());			
		System.out.println( "SPU One Day : " + spu.getOneDay());
		System.out.println("FexEd Four Day : " + spu.getFourDay());			
		System.out.println("FexEd Two Day : " + spu.getTwoDay());			
		System.out.println( "FexEd One Day : " + spu.getOneDay());
		
		 
		
		for(DeliveryDrive driver : drivers)
		{
			if(driver == post)
			{
				for(int i = 0; i < post.getRate().length; i ++)
				{
				System.out.println("First Class : " + post.getRate());
				System.out.println("Second Class : " + post.getRate());
				System.out.println("Third Class : " + post.getRate());
				}
			}
			if(driver == spu)
			{
				System.out.println("SPU Four Day : " + spu.getFourDay());			
				System.out.println("SPU Two Day : " + spu.getTwoDay());			
				System.out.println( "SPU One Day : " + spu.getOneDay());	
			}
			if(driver == fexed)
			{
				System.out.println("FexEd Four Day : " + spu.getFourDay());			
				System.out.println("FexEd Two Day : " + spu.getTwoDay());			
				System.out.println( "FexEd One Day : " + spu.getOneDay());
			}
			

		}
	}
	
}
