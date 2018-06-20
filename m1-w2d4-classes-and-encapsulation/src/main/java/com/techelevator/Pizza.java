package com.techelevator;

public class Pizza {
	private boolean inOven;
	private int timer;
	private boolean isDoor;
	private boolean pizzaMade;
	private boolean pizzaCooked;
	private boolean pizzaBurned;

	private int ovenTemp;
	
	public Pizza(){
		inOven = false;
		pizzaCooked = false;
		timer = 0;
		isDoor = false;
		pizzaMade = false;
		ovenTemp = 0;
		
	}
	
	
	public void setTemp(){
		ovenTemp += 150;
		System.out.println("You set the Oven : " + ovenTemp);

	}
	
	public void makePizza(){
		ovenTemp += 150;
		pizzaMade = true;
		System.out.println("you made the pizza : " + pizzaMade);

	}
	
	public void openDoor(){
		if(isDoor == false){
			isDoor = true;
			System.out.println("you opened the door : " + isDoor);
			ovenTemp += 100;
		}
		else{
			isDoor = true;
			System.out.println("you opened the door already : " + isDoor);
		}
	}
	
	public void closeDoor(){
		if(isDoor == true){
			System.out.println("you closed the door : " + isDoor);
			isDoor = false;
		}			
		
		else {
		System.out.println("you closed the door already : " + isDoor);
		isDoor = false;
		}
	}
	
	public void pizzaInOven(){
		ovenTemp +=25;
		if(pizzaMade == true && isDoor == true && ovenTemp >= 425){
			timer += 25;
			inOven = true;
			System.out.println("you started the timer, be ready : " + timer + " minutes.");
		}else if(isDoor == false && ovenTemp == 425)
		System.out.println("You need to open the door : " + isDoor);
		else if(ovenTemp < 425)
			System.out.println("Oven tempature should be 425 : " + ovenTemp);
		else if(pizzaMade == false)
			System.out.println("pizza isnt made : " + pizzaMade);


	}
	
	public void passTime(){
		int determineTimer = (int)Math.random() * 3 + 1;
		if(determineTimer == 1){
			timer -= determineTimer + 4;
			System.out.println("you read a book and are at: " + timer + " minutes.");
			if(timer == 0){
				System.out.println("you are ready to take pizza out: " + timer + " minutes.");
				pizzaCooked = true;
			
			}else if(timer < 0){
				System.out.println("you are ready to take pizza out: " + timer + " minutes.");
				pizzaCooked = true;
				pizzaBurned = true;
			}
		}else if(determineTimer == 2){
			timer -= determineTimer + 3;
			System.out.println("you are just starving and are at: " + timer+ " minutes.");
			if(timer == 0){
				System.out.println("you are ready to take pizza out: " + timer+ " minutes.");
				pizzaCooked = true;
			
			}else if(timer < 0){
				System.out.println("you are ready to take pizza out: " + timer+ " minutes.");
				pizzaCooked = true;
				pizzaBurned = true;
			}
		}else if(determineTimer == 3){
			timer -= determineTimer + 2;
			System.out.println("You are looking at your iphone and are at: " + timer+ " minutes.");
			if(timer == 0){
				System.out.println("you are ready to take pizza out: " + timer+ " minutes.");
				pizzaCooked = true;
			
			}else if(timer < 0){
				System.out.println("you are ready to take pizza out: " + timer+ " minutes.");
				pizzaCooked = true;
				pizzaBurned = true;
			}
		}
	}
	
	
	public void removePizza(){
		if(isDoor == true && timer <= 0){
			inOven = false;
			if(pizzaBurned == true){
				System.out.println("you should pay more attention to the timer: " + timer);
				
			}else if(pizzaBurned == false){
				System.out.println("Looks delecious! Congrats, its not burnt!!!");

			}
		}
			
	}


	public boolean isInOven() {
		System.out.println("Oven is on: " + inOven);

		return inOven;
	}


	public int getTimer() {
		System.out.println("The timer is at : " + timer + " minutes.");

		return timer;
	}


	public boolean isDoor() {
		System.out.println("Is the door open: " + isDoor);

		return isDoor;
	}


	public boolean isPizzaMade() {
		System.out.println("Is Pizza Made : " + pizzaMade);

		return pizzaMade;
	}


	public boolean isPizzaCooked() {
		System.out.println("Is Pizza Cooked : " + pizzaCooked);

		return pizzaCooked;
	}


	public boolean isPizzaBurned() {
		System.out.println("Is Pizza Burned : " + pizzaBurned);

		return pizzaBurned;
	}


	public int getOvenTemp() {
		System.out.println("Oven Temp : " + ovenTemp +"f");

		return ovenTemp;
	}
}
