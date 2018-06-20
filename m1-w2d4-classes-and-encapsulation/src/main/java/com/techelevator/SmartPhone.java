package com.techelevator;

public class SmartPhone {
private long phoneNumber;
private String carrier;
private String operatingSystem;
private int battery;
private boolean onCall;

public SmartPhone(){
	phoneNumber = 9999999999l;
	carrier = new String();
	operatingSystem = new String();
	battery = 100;
	onCall = false;
}

public boolean isOnCall() {
	return onCall;
}

public void setOnCall(boolean onCall) {
	this.onCall = onCall;
}

public long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) {
	if(battery > 0){
	if(phoneNumber <= 9999999999l && phoneNumber > 999999999){
		battery-=5;
		String number = Long.toString(phoneNumber);
		
		System.out.println("You're phone number is: " + number.substring(0, 3) +"-" +number.substring(3, 6) +"-" + number.substring(6, 10));
		this.phoneNumber = phoneNumber;
		}else{
			System.out.println("You're phone number to many digits");
			
		}
	}
	
}

public String getCarrier() {
	System.out.println("You're Carrier Set to: " + carrier);

	return carrier;
	
}

public void setCarrier(String carrier) {
	System.out.println("You're Carrier is: " + carrier);

	this.carrier = carrier;
}

public String getOperatingSystem() {
	System.out.println("You're Operating System Set to: " + operatingSystem);

	return operatingSystem;
}

public void setOperatingSystem(String operatingSystem) {
	System.out.println("You're Operating System is: " + operatingSystem);

	this.operatingSystem = operatingSystem;
}

public int getBattery() {
	System.out.println("You're battery: " + battery + "%");

		return battery;
	
	
}

public void setBattery(int battery) {
	System.out.println("You're battery: " + battery + "%");

	this.battery = battery;
}


public boolean calling(boolean fal, String call){
	if(onCall == false){
		if(call.length() <= 10){
		System.out.println("You answer the phone.");
		battery-=5;
		return true;
		}
		else{
		System.out.println("Only Ten Digits baby...");
		battery-=5;
		onCall = false;
		return fal = false;
		}
	}
	return false;
}

public void answer(){
	if(onCall == false){
	battery-=5;
	System.out.println("You answer the incoming call.");{
	onCall = true;
	}
	}
}

public boolean hangUp(){
	System.out.println("You hung up.");
	return onCall = false;
}

}
