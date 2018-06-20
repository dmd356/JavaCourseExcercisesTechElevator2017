package com.techelevator;

public class FruitTree {
	private int piecesLeft;
	private String fruitType;

	
public FruitTree(){
	piecesLeft = 0;
	fruitType = new String();
			
}



public void setPiecesLeft(int piecesLeft) {
	if(piecesLeft > 0)
	this.piecesLeft = piecesLeft;
}
public int getPiecesLeft() {
	return piecesLeft;
}
public void setFruitType(String fruitType) {
	if(fruitType != null&& !fruitType.isEmpty())
		this.fruitType = fruitType;
		System.out.println("setting fruit type to " + this.fruitType);
}
public String getFruitType(){
	return fruitType;
			}
public Boolean pickFruit(){
	if(piecesLeft > 0){
		piecesLeft--;
		System.out.println("This is true");
		return true;
		
	}
	else{
		System.out.println("This is false");
		return false;
		
	}
		
}
}

