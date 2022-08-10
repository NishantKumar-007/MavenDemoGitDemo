package com.lti.demos;

public class TestCalc {

	public static void main(String[] args) {
		{
			Calculator c = new Calculator();
			String msg  = c.sayHello();
			System.out.println(msg);
			
			System.out.println(c.addNo(20, 30));
			System.out.println(c.subNo(100, 40));
		}
	}
}
