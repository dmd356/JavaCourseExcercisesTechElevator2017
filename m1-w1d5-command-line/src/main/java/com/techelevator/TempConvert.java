package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the tempature!");
		
		int temp = input.nextInt();
		input.nextLine();
		
		System.out.print("is temp (C) OR (f)");
		String scale = input.nextLine();
		
		if (scale.equals("C")) {
			int tempF = (int)(temp * 1.8 + 32);
			System.out.println(temp + "C is " + tempF +"F");
		}
		else {
			int tempC = (int)((temp - 32) / 1.8);
			System.out.println(temp + "F is " + tempC +"C");
			
		}
	
		
	}

}
