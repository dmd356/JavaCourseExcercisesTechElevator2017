package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	private FruitTree tree;
	@Before 
	public void setup(){
		tree = new FruitTree("Apple", 10);
	}
	
	@Test
	public void get_type_of_fruit_return_apple() {
	//Act
	String typeOfFruit = tree.getTypeOfFruit();
	//Assert
	Assert.assertEquals("Tree should contain apples", "Apple", typeOfFruit);
	}
	@Test
	public void get_number_of_fruit_return_ten() {
	//Act
	int piecesLeft = tree.getPiecesOfFruitLeft();
	//Assert
	Assert.assertEquals("Tree should contain 10, but was ", 10 , piecesLeft);
	}
	@Test
	public void picking_of_fruit_return_ten() {
		//Act
		boolean success = tree.PickFruit(5);
		//Assert
		Assert.assertTrue("Tree should contain 10, but was ", success);
		Assert.assertEquals("we should have 5 pieces", 5, tree.getPiecesOfFruitLeft());
		}
	@Test
	public void should_not_be_able_to_pick_more_fruit_than_available(){
		tree.PickFruit(7);
		boolean success = tree.PickFruit(5);
		//Assert false
		Assert.assertFalse("we should not be able to pick more fruit than the tree!", success);
		Assert.assertEquals("failed to pic fruit should not adjust number left", 3, tree.getPiecesOfFruitLeft());
	}
	
}
