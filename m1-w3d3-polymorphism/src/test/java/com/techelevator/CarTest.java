package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CarTest {
// its done
@Test
public void init_test_no_trailer(){
	Car car = new Car(false);
	Assert.assertEquals(2, car.calculateToll(100), 001);
	Assert.assertEquals(false, car.HasTrailer());

}
@Test
public void init_test_has_trailer(){
	Car car = new Car(true);
	Assert.assertEquals(5, car.calculateToll(200), 001);
	Assert.assertEquals(true, car.HasTrailer());

}



}
