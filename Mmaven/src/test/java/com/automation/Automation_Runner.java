package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.pojo.Sign_In;
import com.base.Base_Class;

public class Automation_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	driver = new ChromeDriver();
	
	maximize(driver);
	
	send_keys(driver, "http://automationpractice.com/index.php");
	
	Sign_In signin = new Sign_In(driver);
	
	}

}
