package com.techelevator;

public class Exercises {
	public static void main(String[] args){
		HomeworkAssignment assignment = new HomeworkAssignment();
				assignment.setSubmitter("Devin");
				assignment.setPossibleMarks(15);
				assignment.setTotalMarks(15);
				
				System.out.println("My grade is " + assignment.getLettergrade());
				
				FruitTree tree = new FruitTree();
				tree.setFruitType("Peaches");
				tree.setPiecesLeft(1);
				tree.pickFruit();
				tree.pickFruit();
				
				Wage myWage = new Wage();
				myWage.setDepartment("TechElevator");
				myWage.setEmployeeId(2301);
				myWage.setName("Devin Distelhorst");
				myWage.setSalary(40.13);
				myWage.raiseSalary(25.00);
				System.out.println("Now i make " + myWage.getSalary());
				
				System.out.println("Airplane Time");
				Airplane flight = new Airplane();
				flight.setPlaneNumber(208);
				flight.setTotalFirst(12);
				flight.setTotalCoach(30);
				flight.reserveSeats(true, 30);
				flight.getTotalCoach();
				flight.getTotalFirst();
				System.out.println("");

				System.out.println("SmartPhone");
				SmartPhone iphone  = new SmartPhone();
				iphone.setPhoneNumber(6144046875l);
				iphone.setBattery(100);
				iphone.setCarrier("Sprint");
				iphone.setOperatingSystem("iPhone 5s");
				iphone.getCarrier();
				iphone.calling(false, "192393249");
				iphone.hangUp();
				iphone.calling(false, "192393249");
				iphone.hangUp();
				iphone.answer();
				iphone.hangUp();
				iphone.hangUp();
				iphone.answer();
				iphone.hangUp();
				iphone.getBattery();
				
				
				System.out.println("");
				System.out.println("Television");
				System.out.println("");
				Television mac = new Television();
				mac.setCurrentVolume(0);
				mac.setOn(true);
				mac.setSelectChannel(1);
				mac.raiseVolume(6);
				mac.getCurrentVolume();
				mac.lowerVolume(3);
				mac.getCurrentVolume();
				
				
				
				System.out.println("");
				System.out.println("Elevator");
				System.out.println("");
				Elevator me = new Elevator();
				me.setFloor(12);
				me.getTotalFloor();
				me.goingUp(10);
				me.getCurrentLevel();
				me.openDoor();
				me.getDoorOpen();
				me.closeDoor();
				me.getDoorOpen();
				me.getIsMoving();
				me.goingDown(6);
				me.getCurrentLevel();
				me.openDoor();
				me.goingDown(1);
				me.getCurrentLevel();
				me.getIsMoving();

				System.out.println("");
				System.out.println("The Batman");
				System.out.println("");
				Batman bats = new Batman();
				bats.getHealth();
				bats.fightCriminals();
				bats.fightCriminals();
				bats.training(8);
				bats.getExperience();
				bats.getCriminalsFought();
				bats.getMoney();
				bats.getRespect();
				bats.healthRecharge(10);
				bats.fightCriminals();
				bats.fightCriminals();
				bats.training(7);
				
				
//				System.out.println("");
//				System.out.println("Pizza");
//				System.out.println("");
//				Pizza pizza = new Pizza();
//				pizza.setTemp();
//				pizza.getOvenTemp();
//				pizza.pizzaInOven();
//				pizza.makePizza();
//				pizza.isPizzaMade();
//				pizza.pizzaInOven();
//				pizza.openDoor();
//				pizza.isDoor();
//				pizza.pizzaInOven();
//				pizza.isInOven();
//				pizza.passTime();
//				pizza.passTime();
//				pizza.passTime();
//				pizza.getTimer();
//				pizza.passTime();
//				pizza.passTime();
//				pizza.removePizza();
//				
//				System.out.println("");
//				System.out.println("Dragon");
//				System.out.println("");
//				Dragon dragon = new Dragon();
//				dragon.pickDragon();
//				dragon.getName();
//				dragon.getHealth();
//				dragon.isFlying();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//				dragon.terrorizeTheVillage();
//
//				
//				
//				
//				
			
				
				
				
				
				
	}	
	
	
	
	
	
	
	
}
