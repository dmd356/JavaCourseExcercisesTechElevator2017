package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class TankTest {
	// its dones
@Test
public void init_test(){
	Tank tank = new Tank();
	Assert.assertEquals(0, tank.calculateToll(100), 1);
}
}
