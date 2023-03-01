package com.testng.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@Test
	public static void main(String[] args) {
		System.out.println("test -1");
	}

	@Test
	private void vijay() {
		System.out.println("test-2");
	}

	@BeforeMethod
	private void surya() {
		System.out.println("test-3");
	}

	@AfterMethod
	private void simbu() {
		System.out.println("test-4");
	}
	
	@BeforeClass
	private void vikram() {
		System.out.println("test-5");
	}
	
	@AfterClass
	private void dhanush() {
		System.out.println("test-6");
	}
	
	@BeforeTest
	private void karthi() {
		System.out.println("test-7");
	}
	
	@AfterTest
	private void ravi() {
		System.out.println("test-8");
	}
	
	@BeforeSuite
	private void kamal() {
		System.out.println("test-9");
	}
	
	@AfterSuite
	private void rajini() {
		System.out.println("test-10");
	}

}
