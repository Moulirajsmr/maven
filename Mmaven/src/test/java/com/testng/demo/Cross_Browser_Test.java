package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Cross_Browser_Test {
	
	@Test
	private void facebook() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void amazon() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");

	}

}
