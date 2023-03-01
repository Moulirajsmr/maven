package com.testng.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "data")
	private void facebook(String username, String password) {
		System.out.println("Gmail" + username);
		System.out.println("pwd" + password);
	}
	
	@DataProvider
	private Object[][] data(){
		
		return new Object[][] {
			{"abc@gmail.com", "qwert89"},
			{"xyz@gmail.com", "asdfg56"},
			{"mno@gmail.com", "zxcvb23"}
		};
		
		
	}
	

}
