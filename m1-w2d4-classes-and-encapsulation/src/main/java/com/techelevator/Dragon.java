package com.techelevator;

public class Dragon {
	private boolean isFlying;
	private boolean breath;
	private int health;
	private int stamina;
	private int attack;
	private boolean dead;
	private String name;
	private int randomEvent;
	
	public Dragon(){
		isFlying = false;
		breath = false;
		health = 0;
		stamina = 0;
		name = new String();
		dead = false;
		attack = 0;
		randomEvent = 0;
	}
	
	public void pickDragon(){
		int random = (int)(Math.random() * 4)+1;
		if(random == 1){
			name = "Viesaeres the Mighty!";
			System.out.println("You have recieved the fierce water dragon : " + name);
			health += 250;
			System.out.println("Health : " + health);
			stamina += 300;
			System.out.println("Stamina : " + stamina);
			breath = false;
			System.out.println("Unfortunatly he does not Breath Fire : " + breath);
			attack += 10;
			System.out.println("Attack +: " + attack);
			isFlying = true;
			System.out.println("You can fly fortunately : " + isFlying);
		}else if(random == 2){
			name = "Volvagia the Serpent!";
			System.out.println("You have recieved the fire breather : " + name);
			health += 200;
			System.out.println("Health : " + health);
			stamina += 350;
			System.out.println("Stamina : " + stamina);
			breath = true;
			System.out.println("Fortunatly he does Breath Fire : " + breath);
			attack += 15;
			System.out.println("Attack +: " + attack);
			isFlying = true;
			System.out.println("You can fly fortunately : " + isFlying);
		}else if(random == 3){
			name = "Kanosauras the Destroyer";
			System.out.println("You have recieved a giant dinosaur : " + name);
			health += 200;
			System.out.println("Health : " + health);
			stamina += 250;
			System.out.println("Stamina : " + stamina);
			breath = false;
			System.out.println("Unfortunatly he does not Breath Fire : " + breath);
			attack += 25;
			System.out.println("Attack +: " + attack);
			isFlying = false;
			System.out.println("You cannot fly unfortunately : " + isFlying);
		}else if(random == 4){
			name = "Halowedd the Destroyer";
			System.out.println("You have recieved the fire breather : " + name);
			health += 200;
			System.out.println("Health : " + health);
			stamina += 250;
			System.out.println("Stamina : " + stamina);
			breath = true;
			System.out.println("Unfortunatly he does not Breath Fire : " + breath);
			attack += 25;
			System.out.println("Attack +: " + attack);
			isFlying = false;
			System.out.println("You cannot fly unfortunately : " + isFlying);
		}
	}
	
	boolean nameCalc = name == "Viesaeres the Mighty!" || name == "Volvagia the Serpent!";

	
	public void fly(){
		if(nameCalc && isFlying == false && stamina > 50){
			isFlying = true;
			attack += 8;
			stamina -= 10;
			System.out.println("Attack + ");
			System.out.println("You are flying!");
		}else if(nameCalc == false){
			System.out.println("You cant fly! :" + isFlying);

		}
		else{
			System.out.println("Stamina must be over 50 : " + stamina);
		}
	}
	
	public void terrorizeTheVillage(){
		if(dead = true){
			System.out.println("You're dead!");

		}
		if(health > 0 && stamina > 0){
			int randomSelect = (int)(Math.random() * 10) + 1;
			System.out.println("You attack the village nearby!");
			if(randomSelect > 5){
				if(randomEvent == randomSelect){
					System.out.println("Armys Gather to your Destruction");
					health -= randomSelect * 10;
					stamina -= randomSelect * 10;
					if(health < 1){
						System.out.println("The Army has defeated you!!!");
						dead = true;
					}else {
						System.out.println("The Army has defeated you!!!");
						health += randomSelect * 10;
						stamina += randomSelect * 10;
					}
				}
				

				health -= randomSelect * 5;
				stamina -= randomSelect * 2;
				System.out.println("Final Health Left : " + health);						
				System.out.println("Final Stamina Left : " + stamina);

				if(health < 1){
					System.out.println("The Army has defeated you!!!");
					dead = true;
				}
				randomEvent++;
				if(breath == true && isFlying == false ) {
					System.out.println("You burn them with fire!");
					health += randomSelect;
					stamina -= randomSelect;
					System.out.println("Final Health Left : " + health);						
					System.out.println("Final Stamina Left : " + stamina);
				}else if(isFlying == true && breath == false){
						System.out.println("You swoop down at them from above");
						health += 25 ;
						stamina -= randomSelect * 2;
						randomEvent++;
						System.out.println("Final Health Left : " + health);						
						System.out.println("Final Stamina Left : " + stamina);
						

				} else if(isFlying == false && breath == false){
					health += 25 + (randomSelect *2);
					stamina -= randomSelect * 2;
					randomEvent++;
					System.out.println("Final Health Left : " + health);					
					System.out.println("Final Stamina Left : " + stamina);
				
			}
			
		}else if(randomSelect < 6){
			health -= randomSelect;
			stamina -= randomSelect;
			randomEvent++;
			if(isFlying == true && breath == true) {
				health += randomSelect *2;
				stamina -= randomSelect * 5;
			}else if(breath == true && isFlying == false){
				health += randomSelect *4;
				stamina -= randomSelect;
			}else{
				health += randomSelect *6;
				stamina -= randomSelect *6;
			}
			
	}
	}
	}

	public boolean isFlying() {
		System.out.println("Is Flying : " + isFlying);						

		return isFlying;
	}

	public int getHealth() {
		System.out.println("Health Left : " + health);	
		return health;
	}

	public String getName() {
		System.out.println("You're Name is : " + name);	

		return name;
	}
	
	
	
	
	
}
