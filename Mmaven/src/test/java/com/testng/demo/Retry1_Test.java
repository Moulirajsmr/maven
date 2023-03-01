package com.testng.demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry1_Test implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		return true;
	}

}
