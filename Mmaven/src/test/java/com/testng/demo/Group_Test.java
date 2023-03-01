package com.testng.demo;

import org.testng.annotations.Test;

public class Group_Test {
	

	@Test(groups = "odd")
	private void one() {
		System.out.println("first test");
	}
	
	@Test(groups = "even")
	private void two() {
		System.out.println("seond test");
	}
	
	@Test(groups = "decimal")
	private void point1() {
		System.out.println("0.01");
	}
	
	@Test(groups = "decimal")
	private void point2() {
		System.out.println("0.02");
	}
	
	@Test(groups = "odd")
	private void three() {
		System.out.println("third test");
	}
	
	@Test(groups = "even")
	private void four() {
		System.out.println("fourth test");
	}

}
