package com.techelevator;
//FINISHED
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AirplaneTest {
	private Airplane airplane;
	
	@Before
	public void setup(){
		airplane = new Airplane(12, 30, "245194");
	}
	
	@Test
	public void number_first_seats(){
		Assert.assertEquals("expected 12", 12, airplane.getTotalFirstClassSeats());
	}
	@Test
	public void number_coach_seats(){
		Assert.assertEquals("expected 30", 30, airplane.getTotalCoachSeats());
	}
	@Test
	public void get_plane_functions(){
		airplane = new Airplane(12, 30, "3040000");
		Assert.assertEquals("expected nothing", null, airplane.getPlaneNumber());	}
	@Test
	public void negative_airplane(){
		airplane = new Airplane( -10, -10, "100");
		Assert.assertEquals("expected 0", 0, airplane.getTotalFirstClassSeats());
		Assert.assertEquals("expected nothing", 0, airplane.getTotalCoachSeats());
		Assert.assertEquals("expected nothing", null, airplane.getPlaneNumber());
	}
	
	@Test
	public void get_to_many_first_seat_plane(){
		airplane.Reserve(true, 14);
		Assert.assertEquals("expected 0", 0, airplane.getBookedFirstClassSeats());
	}
	@Test
	public void get_first_seat_plane(){
		airplane.Reserve(true, 12);
		Assert.assertEquals("expected 12", 12, airplane.getBookedFirstClassSeats());
	}
	@Test
	public void get_negative_first_seat_plane(){
		airplane.Reserve(true, -14);
		Assert.assertEquals("expected 0", 0, airplane.getBookedFirstClassSeats());
	}
	@Test
	public void get_coach_seat_plane(){
		airplane.Reserve(false, 12);
		
		Assert.assertEquals(12, airplane.getBookedCoachSeats());
	}
	@Test
	public void get_too_many_coach_seat_plane(){
		airplane.Reserve(false, 31);
		Assert.assertEquals(0, airplane.getBookedCoachSeats());
	}
	@Test
	public void get_negative_coach_seat_plane(){
		airplane.Reserve(false, -31);
		Assert.assertEquals(0, airplane.getBookedCoachSeats());
	}
	@Test
	public void get_first_booked_numbers(){
		Assert.assertEquals(12, airplane.getAvailableFirstClassSeats());
	}
	@Test
	public void get_coach_booked_numbers(){
		Assert.assertEquals(30, airplane.getAvailableCoachSeats());
	}
	

	
	
	
	
	
}
