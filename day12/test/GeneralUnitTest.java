package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GeneralUnitTest {

      GeneralAPI2 api;
	@Before //it will execute before every test cases
	public void start()
	{
		api=new GeneralAPI2();
		System.out.println("General API object created");
	}
	@After
	public  void display()
	{
		api=null;
		System.out.println("API Object destroyed");
	}
	

	@Ignore
	@Test
	public void testAddNumbers() {
		assertEquals(12, api.add(4, 8));
	}
    @Test
	public void testCheckForEven()
	{
		assertEquals(true, api.checkEven(12));
	}
    @Test
	public void testFactorial()
	{
		assertEquals(24, api.getFactorial(4));
	}
    @Test
    public void testPrime()
    {
    	assertEquals(true, api.prime(3));
    }
}
