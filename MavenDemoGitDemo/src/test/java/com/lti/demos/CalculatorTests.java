package com.lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	Calculator c = new Calculator();
	@Test
	public void testCalcSayHello()
	{
		Assertions.assertEquals("hello world",c.sayHello());
	}
	@Test
	@Disabled
	public void testAddMethod()
	{
		int result = c.addNo(20,30);
		Assertions.assertEquals(50, result);
	}
	@Test
	public void testSubMethod()
	{
		int result = c.subNo(100,30);
		Assertions.assertEquals(70, result,"manual testing message to be displayed here");
	}
	@Test
	public void testAssertNulls()
	{
		String s1 = null;
		String s2 = "Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	public void testAssertFalse()
	{
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller");
	}
	
	@Test
	public void testArrays()
	{
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(45);
		myList.add(290);
		Assertions.assertEquals(2, myList.size());
	}
}
