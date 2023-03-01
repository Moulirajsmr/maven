package com.testng.demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test
	private void one() {
		System.out.println("first test");
	}
	
	@Ignore
	@Test
	private void two() {
		System.out.println("second test");
	}
	
	@Test(enabled = false)
	private void three() {
		System.out.println("third test");
	}

}
