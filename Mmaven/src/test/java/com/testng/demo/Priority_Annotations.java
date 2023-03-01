package com.testng.demo;

import org.testng.annotations.Test;

public class Priority_Annotations {
	
	@Test(priority = 1)
	private void one() {
		System.out.println("one test");
	}
	
	@Test(priority = 0)
	private void Two() {
		System.out.println("second test");
	}
	
	@Test(priority = -1)
	private void three() {
		System.out.println("third test");
	}
	
	@Test
	private void four() {
		System.out.println("fourth test");
	}

}
