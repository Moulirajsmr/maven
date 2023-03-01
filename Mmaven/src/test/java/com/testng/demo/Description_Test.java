package com.testng.demo;

import org.testng.annotations.Test;

public class Description_Test {
	
	@Test(description = "prior update")
	private void one() {
		System.out.println("first test");
	}
	
	@Test(description = "New Update")
	private void two() {
		System.out.println("second test");
	}
	
	@Test(description = "future update")
	private void three() {
		System.out.println("third test");
	}

}
