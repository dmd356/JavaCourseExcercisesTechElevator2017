package com.techelevator;

public class Airplane {
	private int planeNumber;
	private int bookedFirst;
	private int totalFirst;
	private int bookedCoach;
	private int totalCoach;
//	private int ticket;
	
	public Airplane(){
		planeNumber = 0;
		bookedFirst = 0;
		totalFirst = 0;
		bookedCoach = 0;
		totalCoach = 0;
//		ticket = 0;
		
		
	}
	
	public int getPlaneNumber() {
		return planeNumber;
	}
	
	public void setPlaneNumber(int planeNumber) {
		if(planeNumber > 100){
		System.out.println("you entered " + planeNumber);
		this.planeNumber = planeNumber;
		}else{
			System.out.println("Note: three digit flight number");
		}
	}
	
	public int getTotalFirst() {
		System.out.println("Total First: " + totalFirst);

		return totalFirst;
	}
	
	public void setTotalFirst(int totalFirst) {
		if (totalFirst >= 4 && totalFirst <= 12){
			System.out.println("Changing First Class seats to " + totalFirst);
		this.totalFirst = totalFirst;
		}else {
			System.out.println("Note: 4-12 on a plane");
		}
	}
	
	public int getTotalCoach() {
		System.out.println("Total Coach: " + totalCoach);

		return totalCoach;
	}
	
	public void setTotalCoach(int totalCoach) {
		if(totalCoach >= 10 && totalCoach <= 30){
			this.totalCoach = totalCoach;
			System.out.println("Changing Coach Class seats to " + totalCoach);
		}else{
			System.out.println("Note:seats 1-30!");
		}
	}
	
	public boolean reserveSeats(boolean firstClass, int totalNumberOfSeats) {
		if(firstClass) {
			if(bookedFirst < totalNumberOfSeats) {
				System.out.println("Note:first is Available!");
				bookedFirst+=(totalNumberOfSeats - 1);
				return firstClass = true;
			} 
			else if(firstClass == false){
				if(totalNumberOfSeats < bookedCoach){
					if(bookedCoach < totalCoach){
				bookedCoach+=totalNumberOfSeats - 1;
				System.out.println("Note:Coach is Available!");

				return firstClass = true;
			}
			else {
				System.out.println("Coach is unAvailable!");

				return firstClass = false;
			}
		}
			}
		}
		return firstClass = false;
	}
	
//	public boolean isFirstAvailable(){
//		int isFirst = (int)(Math.random() * totalFirst + 1);
//		boolean isFirstF = isFirst >= totalFirst;
//		if(isFirstF){
//			System.out.println("Note:First Class Unavailable!");
//			return bookedFirst = false;
//			}
//		else{
//			if(bookedFirst == false && bookedCoach == false){
//			System.out.println("Note:First Class Available!");
//			totalFirst--;
//			this.ticket++;
//			int x = isFirst;
//			System.out.println(x);
//			return bookedFirst = true;
//			}
//			else {
//				return bookedFirst = false;
//			}
//		}
//	}
//	public int getTicket() {
//		System.out.println(ticket);
//		return ticket;
//	}
//
//	public boolean isCoachAvailable(){
//		int isCoach = (int)Math.random() * totalCoach+1;
//		boolean isCoachF = totalCoach == isCoach;
//		if(isCoachF){
//			System.out.println("Note:Coach is Unavailable!");
//			return bookedCoach = false;
//			}
//		else{
//			if(bookedFirst == false && bookedCoach == false){
//			System.out.println("Note:Coach is Available!");
//			totalCoach--;
//			this.ticket++;
//			return bookedCoach = true;
//		}
//			else{
//				return bookedCoach = false;
//			}
//		}
//	}
	
	
}
