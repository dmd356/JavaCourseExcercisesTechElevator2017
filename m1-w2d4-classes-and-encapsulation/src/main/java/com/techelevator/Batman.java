package com.techelevator;


public class Batman {
	 private int experience;
	 private int maxHealth;
	 private int maxStamina;
	 private int fightsWon;
	 private int fightsLost;
	 private int punkCount;
	 private boolean fightingCriminals;
	 private boolean isTraining;
	 private int health;
	 private int respect;
	 private int stamina;
	 private float money;
	 
	 public Batman(){
		 experience = 0;
		 maxHealth = 100;
		 fightsWon = 0;
		 fightsLost = 0;
		 fightingCriminals = false;
		 isTraining = false;
		 punkCount = 0;
		 health = 100;
		 respect = 0;
		 stamina = 100;
		 maxStamina = 100;
	 }
	 
	 public void fightCriminals(){
		 
		 int criminalsFought = (int)(Math.random() * 20+1);
			System.out.println("Criminals Fighting Me : " + criminalsFought);
	 		System.out.println("");
		 if(isTraining == false && health > 25 && stamina > 40){
			 if(criminalsFought > 3 ){
				 health -= (criminalsFought *2);
				 stamina -= ((int)Math.random() * criminalsFought +10);
				 fightingCriminals = true;
				 
			 	if(health > 0){
				System.out.println("Your Health : " + health);
			 	System.out.println("your Stamina : " + stamina);
		 		System.out.println("Added Experience + " + experience + criminalsFought);
		 		experience += criminalsFought;
		 		System.out.println("Added Respect + " + respect + criminalsFought*stamina);
		 		respect += criminalsFought * criminalsFought;
		 		System.out.println("Added Money + " + money);
		 		money += criminalsFought + criminalsFought;
		 		System.out.println("Criminals Locked Up + " + criminalsFought);
		 		punkCount += criminalsFought;
		 		System.out.println("Fights Won = " + fightsWon +1);
				fightsWon +=1;
		 		fightingCriminals = false;
		 		System.out.println("Fighting Criminals = " + fightingCriminals);
		 		System.out.println("You are the dark, you are the night, you are the BATMAN!");
		 		System.out.println("");
		 		System.out.println("");

			 	}
			 	else if(health < 1 ){
			 		fightsLost += 1; 
			 		System.out.println("You are dead, you lose!");
			 		System.out.println("Fights Lost = " + fightsWon +1);
			 		health +=50;
			 		System.out.println("");
			 		System.out.println("");



					 fightingCriminals = false;

			 	}
			 }
		 else if(criminalsFought <= 3){
			 health -= ((int)Math.random() * criminalsFought +10);
			 stamina -= ((int)Math.random() * criminalsFought +10);
			 
			 	if(health > 0){
			 		System.out.println("Your Health : " + health);
				 	System.out.println("your Stamina " + stamina);
			 		System.out.println("Added Experience + " + experience + criminalsFought);
			 		experience += criminalsFought;
			 		System.out.println("Added Respect + " + respect + criminalsFought*stamina);
			 		respect += criminalsFought * criminalsFought;
			 		System.out.println("Added Money + " + money);
			 		money += 10;
			 		System.out.println("Criminals Locked Up + " + criminalsFought);
			 		punkCount += criminalsFought;
			 		System.out.println("Fights Won = " + fightsWon +1);
					fightsWon +=1;
			 		fightingCriminals = false;
			 		System.out.println("Fighting Criminals = " + fightingCriminals);
			 		System.out.println("You are the dark, you are the night, you are the BATMAN!");
			 		System.out.println("");
			 		System.out.println("");


			 }
			 	else{
			 		fightsLost += 1; 
			 		System.out.println("You are dead, you lose!");
			 		System.out.println("Fights Lost = " + fightsWon +1);
			 		health +=50;
			 		System.out.println("");
			 		System.out.println("");
					fightingCriminals = false;

			 	}
		 }
	 }
	 }
	 
	 
	 public void training(int intensity){
		
		System.out.println("My Training Intensity : " + intensity);

		 if(fightingCriminals == false && stamina >= 30 && intensity > 0 && intensity < 11){
			 if(health > 20){
			 isTraining = true;
			 experience += intensity;
			 stamina = health - ((int)Math.random() * intensity +1);
			 maxHealth += intensity;
			System.out.println("youre max health has gone up! Its now : " + maxHealth);
			 stamina -= intensity + intensity;
			System.out.println("youre max Stamina has gone up! Its now : " + maxStamina);
			 maxStamina += intensity;
			System.out.println("youre max Stamina has gone up! Its now : " + maxStamina);
			 health += intensity;
			System.out.println("Health is at " + health);
			experience += intensity;
			System.out.println("Experience at " + experience);
	 		System.out.println("");
	 		System.out.println("");

			 }
		 }else{
			 isTraining = false;
		 }
	 }
	 
	 public int healthRecharge(int amount){
		 if(amount < 0 && health+amount > maxHealth){
				System.out.println("Invalid: amount needs to be greater than $0.00" + amount );
				return health;
		 }else{
				money -= amount;
				System.out.println("Money now at " + money);
				health += amount;
				System.out.println("Health now at " + health);
				return amount;

		 }
		 
	 }
	 
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getCriminalsFought() {
		return punkCount;
	}
	public boolean isFightingCriminals() {
		System.out.println("Am I Fighting Criminals? : " + fightingCriminals);
		return fightingCriminals;
	}
	public boolean isTraining() {
		System.out.println("Am I Training? : " + isTraining);
 		System.out.println("");
 		System.out.println("");
		return isTraining;
	}
	public int getHealth() {
		System.out.println("My Health : " + health);
 		System.out.println("");
 		System.out.println("");
		return health;
	}
	public int getRespect() {
		System.out.println("How much do they respect you? " + respect);
 		System.out.println("");
 		System.out.println("");
		return respect;
	}
	public int getStamina() {
		System.out.println("My Stamina : " + stamina);
 		System.out.println("");
 		System.out.println("");
		return stamina;
	}
	public float getMoney() {
		System.out.println("My account : " + money);
 		System.out.println("");
 		System.out.println("");
		return money;
	}


}




