package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class HomeWorkTest {
private HomeworkAssignment hw;

@Before
public void hw(){
	hw = new HomeworkAssignment(15,15, "Devin");
}

@Test
public void get_details_happy_path(){
	Assert.assertEquals(15, hw.getPossibleMarks());
	Assert.assertEquals("Devin", hw.getSubmitterName());
	Assert.assertEquals(15, hw.getTotalMarks());
}
@Test
public void get_details_sad_path(){
	HomeworkAssignment hwt = new HomeworkAssignment(16,15, "Devin");
	Assert.assertEquals(0, hwt.getPossibleMarks());
	Assert.assertEquals(null, hwt.getSubmitterName());
	Assert.assertEquals(0, hwt.getTotalMarks());
}
@Test
public void hw_letter_grade_f(){
	HomeworkAssignment hwt = new HomeworkAssignment(40,100, "Devin");
	Assert.assertEquals("F", hwt.getLetterGrade());
	
	
}
@Test
public void hw_letter_grade_d(){
	HomeworkAssignment hwt = new HomeworkAssignment(40, 50, "Devin");
	
	Assert.assertEquals("D", hwt.getLetterGrade());
	
	
}
@Test
public void hw_letter_grade_a(){
	
	Assert.assertEquals("A", hw.getLetterGrade());
	
	
}




}
