package com.testng.demo;

import org.testng.annotations.Test;

public class Dependency_Test {
	
	@Test(dependsOnMethods = "three")
	private void one() {
	System.out.println("first test");
	}
	
	@Test (dependsOnMethods = "four")
	private void two() {
		System.out.println("second test");
	}
	
	@Test
	private void three() {
		System.out.println("third test");
	}
	
	@Test
	private void four() {
		System.out.println("fourth test");
	}

}
