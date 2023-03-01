package com.testng.demo;

import org.testng.annotations.Test;

public class Invocation_Test {
	
	@Test
	private void one() {
		System.out.println("first test");
	}
	
	@Test(invocationCount = 3)
	private void two() {
		System.out.println("second test");
	}
	
	@Test(invocationCount = 2)
	private void third() {
		System.out.println("third test");
	}

}
