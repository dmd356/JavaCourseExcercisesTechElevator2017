package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 1;
		int b = 0;
		int temp;
		int num = (int) ((Math.random() * 10) + 1);
		
		while (num >= 0){
		    temp = a;
		    a = a + b;
		    b = temp;
		    num--;
		    System.out.print(temp + ", ");
		    
		    if (num == 1){
		    	System.out.println("Please insert the next integer. Only numbers, no characters.");
		    	int answer = input.nextInt();
		    	if (answer ==  (a+b)){
		    		System.out.println("Correct!");
		    		}
		    	else {
		    		System.out.println("Goodbye;");
		    	}
		    	
		    	
		    	
		    }
		    
		  }
				
				
			}
				
		
	}


