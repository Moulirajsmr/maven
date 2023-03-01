package com.testng.demo;

import org.testng.annotations.Test;

public class Retry_Test {
	
	@Test(retryAnalyzer = Retry1_Test.class)
	private void one() {
		System.out.println(10/2);
	}
	
	@Test(retryAnalyzer = Retry1_Test.class )
	private void two() {
		System.out.println(10/0);

	}

}
