package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	private KataRomanNumerals rnum;
	
	@Before
	public void setup(){
		 rnum = new KataRomanNumerals();
	}
	
	@Test
	public void one_to_I(){
		Assert.assertEquals("I", rnum.makeRomanNum(1) );
	}
	
	
	
	@Test
	public void two_to_II(){
		Assert.assertEquals("II", rnum.makeRomanNum(2));
		
	}
	@Test
	public void three_through_ten(){
		Assert.assertEquals("III", rnum.makeRomanNum(3));
		Assert.assertEquals("IV", rnum.makeRomanNum(4));
		Assert.assertEquals("V", rnum.makeRomanNum(5));
		Assert.assertEquals("VI", rnum.makeRomanNum(6));
		Assert.assertEquals("VII", rnum.makeRomanNum(7));
		Assert.assertEquals("VIII", rnum.makeRomanNum(8));
		Assert.assertEquals("IX", rnum.makeRomanNum(9));
		Assert.assertEquals("X", rnum.makeRomanNum(10));
	}
	
	@Test
	public void ten_through_ninety_nine(){
		Assert.assertEquals("XIII", rnum.makeRomanNum(13));
		Assert.assertEquals("XXII", rnum.makeRomanNum(22));
		Assert.assertEquals("XL", rnum.makeRomanNum(40));
		Assert.assertEquals("L", rnum.makeRomanNum(50));
		Assert.assertEquals("LXX", rnum.makeRomanNum(70));
		Assert.assertEquals("LXXXIX", rnum.makeRomanNum(89));
		Assert.assertEquals("XCIX", rnum.makeRomanNum(99));	
	
}

@Test
public void one_hundred_through_nine_ninety_nine(){
	Assert.assertEquals("CC", rnum.makeRomanNum(200));
	Assert.assertEquals("CCXXII", rnum.makeRomanNum(222));
	Assert.assertEquals("XL", rnum.makeRomanNum(40));
	Assert.assertEquals("L", rnum.makeRomanNum(50));
	Assert.assertEquals("LXX", rnum.makeRomanNum(70));
	Assert.assertEquals("LXXXIX", rnum.makeRomanNum(89));
	Assert.assertEquals("XCIX", rnum.makeRomanNum(99));	
}



}
