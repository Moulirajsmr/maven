package com.testng.demo;

import org.testng.annotations.Test;

public class ExpectedException_Test {
	
	@Test
	private void one() {
		System.out.println("first test");
	}
	
	@Test
	private void two() {
		System.out.println("second test");
	}
	
	@Test(expectedExceptions = StringIndexOutOfBoundsException.class )
	private void three()  {
		throw new StringIndexOutOfBoundsException();
	}

}
