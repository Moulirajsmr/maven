package com.testng.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	
	@Test
	@Parameters({"username", "password"})
	private void login(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}

}
