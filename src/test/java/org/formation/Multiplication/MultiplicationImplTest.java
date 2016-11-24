package org.formation.Multiplication;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplicationImplTest {

	@Test
	public void multiply() {
		Multiplication mult = new MultiplicationImpl();
		Assert.assertEquals(8, mult.multiply(4, 2));
		
	}

}
