package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean convertMore = true;
		
		while(convertMore) {
			
		System.out.println("would you like to convert ? (1 for yes / 2 for no)");
		int yes = input.nextInt();
		input.nextLine();
		if(yes == 1) {		
			System.out.println("What are the measurements you'd like to convert?");

			String weights = input.nextLine();
			String[] weightStrings = weights.split(" ");
			
			for(int i = 0; i < weightStrings.length; i++) {
				int userEnter = Integer.parseInt(weightStrings[i]);
				int meter = (int)(userEnter * 0.3048);
				int foot = (int)(userEnter * 3.2808399);
				System.out.println(foot + "ft is " + meter + "m");
			}
		
		
			

		} else {
			convertMore = false;
			System.out.println("Thanks for using the foot to meter converter!");
		}
		
		
		}
		
	}

}
