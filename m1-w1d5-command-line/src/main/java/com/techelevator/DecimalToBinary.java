package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		boolean convertMore = true;
		
		while(convertMore) {
			
		System.out.println("would you like to know what a number is in binary? (1 for yes / 2 for no)");
		int yes = input.nextInt();
		input.nextLine();
		if(yes == 1) {		
			System.out.println("What are the numbers you'd like to convert?");

			String weights = input.nextLine();
			String[] weightStrings = weights.split(" ");
			
			for(int i = 0; i < weightStrings.length; i++) {
				int userEnter = Integer.parseInt(weightStrings[i]);
				System.out.println(userEnter + " in binary is " + Integer.toBinaryString(userEnter));
			}
		
		
			

		} else {
			convertMore = false;
			System.out.println("Thanks for using the binary converter!");
		}
		
		
		
	}

	}
}
