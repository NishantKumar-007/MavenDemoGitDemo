package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c = new Calculator();
	int sum=0;
	
	@BeforeAll
	public static void testStartDBConn()
	{
		System.out.println("DB connection is up - only once");
	}
	@BeforeEach
	public void testStartup()
	{
		sum=0;
		System.out.println("sum is zero"+sum);
	}
	@Test
	public void testAddMethod()
	{
		System.out.println("test case 1 executed");
		int result = c.addNo(20,30);
		Assertions.assertEquals(50, result);
	}
	@Test
	public void testSubMethod()
	{
		System.out.println("test case 2 executed");
		int result = c.subNo(100,30);
		Assertions.assertEquals(70, result,"manual testing message to be displayed here");
	}
	 
	@AfterEach
	public void testShutDown()
	{
		System.out.println("some object null");
	}
	
	@AfterAll //runs only once
	public static void testStopDBConn()
	{
		System.out.println("DB connection is shut down");
	}
		
}
