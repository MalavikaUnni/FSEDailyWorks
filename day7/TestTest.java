package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTest {
	static Calculator calculator;
    @BeforeClass
	      public static void init() {
		  calculator = new Calculator();
		 System.out.println("class object created");
		
	   }
	   @AfterClass
	      public static void destroy()
	      {
		  calculator = null;
		  System.out.println("class object destroyed");
		
	   }

	@Test
	public void test() {
		{
	   	assertEquals(5,calculator.add(2,3));
	   		
	    }
	}
		
	@Test
	   	public void testDiffnumber()
	   	{
	    assertEquals(-1,calculator.diff(2,3));
	    }
	}


