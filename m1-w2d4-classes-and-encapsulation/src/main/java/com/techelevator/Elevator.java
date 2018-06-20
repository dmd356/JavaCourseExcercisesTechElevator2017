package com.techelevator;

public class Elevator {
private int totalFloors;
private int currentLevel;
private boolean doorOpen;
private boolean isMoving;

public Elevator(){
	totalFloors = 0;
	doorOpen = false;
	currentLevel = 0;
	isMoving = false;
	
}

public int getTotalFloor() {
	return totalFloors;
}



public int getCurrentLevel(){
	System.out.println("You are on : " + currentLevel);
	return currentLevel;
}



public void setFloor(int floor) {
	if(floor > 0){
		this.totalFloors = floor;
		System.out.println("There are " + floor +" levels in this building.");

	}
}



public void openDoor(){
	if(doorOpen==false){
		doorOpen = true;
		System.out.println("You Opened the Door.");

	}
}



public void closeDoor(){
	if(doorOpen==true){
		doorOpen = false;
		System.out.println("You Closed the Door.");

	}
}



public boolean getDoorOpen() {
	System.out.println("the door is open : " + doorOpen);
	return doorOpen;
}



public void goingUp(int upLevel){
	if(doorOpen==false){
		if( upLevel+currentLevel <= totalFloors){
			isMoving = true;
			currentLevel = currentLevel + upLevel;
			System.out.println("going up to floor : " + currentLevel);

		}
		else{
			System.out.println("Floor invalid");
			isMoving = false;
		}
		

	}else{
		System.out.println("Please Close the Door First!");
		isMoving = false;
	}
}



public void goingDown(int downLevel){
	if(doorOpen==false){
		if(downLevel < currentLevel && currentLevel-downLevel >= 0){
			currentLevel = currentLevel - downLevel;
			isMoving = true;
			System.out.println("going down to floor : " + currentLevel);

		}
		else
		{
		System.out.println("Floor invalid");
		isMoving = false;
		}
	}
	else{
		System.out.println("Please Close the Door First!");
		isMoving = false;


	}
	
}

public boolean getIsMoving(){
	if(isMoving == true){
		System.out.println("You are able to move.");
		return isMoving;
	}
	System.out.println("You cannot move.");
	return false;
}
 

}
