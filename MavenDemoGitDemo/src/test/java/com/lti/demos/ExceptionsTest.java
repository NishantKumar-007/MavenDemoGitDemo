package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void testException() {
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("One");});
		Integer.parseInt("100");
		}
	
	@Test
	public void testmethodExp()
	{
		Calculator c = new Calculator();
		final Exception e = assertThrows(ArithmeticException.class, ()->{c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero", e.getMessage());
	}
}