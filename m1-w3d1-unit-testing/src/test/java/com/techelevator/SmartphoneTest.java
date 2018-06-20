package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class SmartphoneTest {
	private SmartPhone sm;
	@Before
	public void setup() {
		sm = new SmartPhone("6144046875", "Samsung");
	}
	
	
@Test
public void initialize() {
	Assert.assertEquals("6144046875", sm.getPhoneNumber());
	Assert.assertEquals("Samsung", sm.getCarrier() );
}

@Test
public void charge_one_hundred() {
	Assert.assertEquals(100, sm.getBatteryCharge());
}
@Test
public void set_operating_oh_one(){
	sm.setOperatingSystem("01");
	Assert.assertEquals("01", sm.getOperatingSystem());

}
@Test
public void get_charge_on_call_phone(){
	sm.Call("1234567890", 20);
	Assert.assertEquals(true, sm.isOnCall());
	Assert.assertEquals(80, sm.getBatteryCharge());
	

}
@Test
public void answer(){
	sm.AnswerPhone();
	
	Assert.assertEquals(true, sm.isOnCall());	

}
@Test
public void phon(){
	sm.Call("1234567890", 20);
	sm.HangUp();
	Assert.assertEquals(false, sm.isOnCall());	

}
@Test
public void recharge(){
	sm.Call("1234567890", 99);
	sm.RechargeBattery();
	Assert.assertEquals(100, sm.getBatteryCharge());	

}
}
