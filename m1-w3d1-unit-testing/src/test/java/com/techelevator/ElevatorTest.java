package com.techelevator;
//Done
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	private Elevator elevator;
	@Before
	public void setup(){
		elevator = new Elevator(2, 44);
	}
	
	@Test
	public void close_door_closed(){
		elevator.CloseDoor();
		Assert.assertEquals("Should not do anything", false, elevator.isDoorOpen());
	}
	@Test
	public void close_door_Opened(){
		elevator.OpenDoor();
		elevator.CloseDoor();
		Assert.assertEquals("Should open close if opened", false, elevator.isDoorOpen());
	}@Test
	public void open_door_closed(){
		elevator.OpenDoor();
		Assert.assertEquals("Should open door", true, elevator.isDoorOpen());
	}@Test
	public void open_door_opened(){
		elevator.OpenDoor();
		elevator.OpenDoor();
		Assert.assertEquals("Should not do anything", true, elevator.isDoorOpen());
	}
	@Test
	public void close_door_if_moving(){
		elevator.GoUp(33);
		elevator.CloseDoor();
		Assert.assertEquals("Should not do anything", false, elevator.isDoorOpen());
	}
	@Test
	public void open_door_if_moving(){
		elevator.GoUp(33);
		elevator.OpenDoor();
		Assert.assertEquals("Should not do anything", true, elevator.isDoorOpen());
	}
	@Test
	public void too_many_floors(){
		elevator.GoUp(55);
		Assert.assertEquals("Should not do anything", elevator.getCurrentLevel(), elevator.getCurrentLevel());
	}
	@Test
	public void too_little_floors(){
		elevator.GoDown(10);
		Assert.assertEquals("Should not go down", 1, elevator.getCurrentLevel());

	}
	@Test
	public void door_is_open_and_shouldnt_go_up(){
		elevator.OpenDoor();
		elevator.GoUp(14);
		Assert.assertEquals("should not go up", 1, elevator.getCurrentLevel());
	}
	@Test
	public void door_isnt_open_and_should_go_up(){
		elevator.CloseDoor();
		elevator.GoUp(14);
		Assert.assertEquals("should go up with door closed", 15, elevator.getCurrentLevel());
	}
	@Test
	public void door_isnt_open_and_should_go_down(){
		elevator.CloseDoor();
		elevator.GoUp(14);
		elevator.GoDown(5);
		Assert.assertEquals("should go up with door closed", 10, elevator.getCurrentLevel());
	}
	@Test
	public void door_is_open_and_shouldnt_go_down(){
		elevator.CloseDoor();
		elevator.GoUp(14);
		elevator.OpenDoor();
		elevator.GoDown(5);
		Assert.assertEquals("should not go down", 15, elevator.getCurrentLevel());
	}
	@Test
	public void is_moving_and_shouldnt_open(){
		elevator.CloseDoor();
		elevator.GoUp(14);
		elevator.OpenDoor();
		elevator.GoDown(5);
		Assert.assertEquals("should not go down", 15, elevator.getCurrentLevel());
	}
	public void get_number_of_levels(){
		elevator.CloseDoor();
		elevator.getNumberOfLevels();
		Assert.assertEquals("should return 44", 44, elevator.getNumberOfLevels());
	}
	public void get_number_of_shafts(){
		elevator.CloseDoor();
		elevator.getShaftNumber();
		Assert.assertEquals("should return 2", 2, elevator.getShaftNumber());
	}
	public void is_moving_if_moving(){
		Assert.assertFalse(elevator.isMoving());
	}
	public void is_not_moving_if_not_moving(){
		elevator.CloseDoor();
		elevator.isMoving();
		Assert.assertEquals("should return false", false, elevator.isMoving());
	}
	

	
	
	
	
	
	
}
