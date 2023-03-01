package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Test {
	
	@Test
	private  void hard_assert1() {
		Assert.assertEquals("java", "java");
	}
	
	@Test
	private void hard_assert2() {
		Assert.assertNotEquals("java", "java");
	}
	
	@Test
	private void soft_assert1() {
		SoftAssert s = new SoftAssert();
		s.assertEquals("java", "phython");	
	}
	
	@Test
	private void soft_assert2() {
		SoftAssert m = new SoftAssert();
		m.assertNotEquals("java", "java");
	}

}
