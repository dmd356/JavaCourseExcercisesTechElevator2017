package com.techelevator;

public class Television {
	private boolean isOn;
	private int selectChannel;
	private int currentVolume;
	
	public Television() {
		isOn = false;
		selectChannel = 0;
		currentVolume = 0;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public int getSelectChannel() {
		System.out.println("Channel :" + selectChannel);

		return selectChannel;
	}

	public void setSelectChannel(int selectChannel) {
		System.out.println("Set channel :" + selectChannel);
		this.selectChannel = selectChannel;
	}

	public int getCurrentVolume() {
		System.out.println("Current Volume :" + currentVolume);
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		System.out.println("Set current Volume :" + selectChannel);
		this.currentVolume = currentVolume;
	}
	public boolean turnOn(){
		if(isOn == false){
			isOn = true;
			return true;
		}
		return false;
		}
	
	public boolean turnOff(){
		if(isOn == true){
			isOn = false;
			return true;
		}
		return false;
		}
	
	
	
	
	public int changeChannel(int newChannel){
		if(newChannel > 3){
			System.out.println("Invalid Length(0-3); Resetting to Zero :" + newChannel);
			return 0;	
		}return newChannel;
		
	}
	
	
	
	public void raiseVolume(int raise){
		if(raise > 60 || raise < currentVolume){
	System.out.println("Invalid Length" + raise);
		}
		System.out.println(currentVolume + raise);
		 this.currentVolume+=raise;
	}
	
	public void lowerVolume(int lower){
		if(lower > 60 || lower > currentVolume){
			System.out.println("Invalid Length " + lower);
			
				}
		this.currentVolume-=lower;
	}
	
	
//	while (isOn == true){
//		
//	}


}
