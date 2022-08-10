package com.lti.demos;

public class Calculator {

	public String sayHello()
	{
		return "hello world";
	}
	
	public int addNo(int x, int y)
	{
		int result = x+y;
		return result;
	}
	public int subNo(int x, int y)
	{
		int result = x-y;
		return result;
	}
	int empid = 0;
	public void searchEmp(int empId)
	{
		if(empid==0)
		{
			throw new ArithmeticException("u entered zero");
			
		}
		else
		{
			System.out.println("do something");
		}
	}
}
