package com.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_MyClass {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testDiv() {
		
		MyClass obj = new MyClass();
		double actual = obj.div(10, 5);
		assertEquals(2, actual);
		
	}
	
	@Test
	public void testDiv_negative() {

		MyClass obj = new MyClass();
		double actual = obj.div(10, 3);
		assertEquals(3.333D, actual, 0.001);
		
	}

}
