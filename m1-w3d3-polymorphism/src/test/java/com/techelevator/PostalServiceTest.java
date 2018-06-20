package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class PostalServiceTest {
public PostalService post;

@Before
public void setup()
{
	post = new PostalService();
}
	
@Test
public void initialize_properly()
{
	post.calculateRate(1, 2);
	post.getWeight(true);
	Assert.assertEquals(2, post.getWeight(true));
	Assert.assertEquals(.035, post.getFirstClass(), .0000001);
	Assert.assertEquals(.0035, post.getSecondClass(), .1);
	Assert.assertEquals(.00035, post.getSecondClass(), .001);

}
}
