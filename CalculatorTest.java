package com.cts.main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	 Calculator calc;
	@Before
	public void init() {
		 calc = new Calculator();
		System.out.println("class object created");
		
	}
	@After
	public void destroy()
	{
		calc = null;
		System.out.println("class object destroyed");
		
	}
	@Test
	public void testAddnumber()
	{
		assertEquals(5,calc.add(2,3));
		
	}

}
