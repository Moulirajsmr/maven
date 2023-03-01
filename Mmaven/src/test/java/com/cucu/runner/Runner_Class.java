package com.cucu.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucu\\testing\\Adactin.feature",
glue= "com.adac.stepdefinition",
monochrome = true,
dryRun = false,
publish = true,
plugin= {"html:Report/rep.html",
		"pretty"}
)

public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		
		driver = Base_Class.browser_launch("chrome");
	}
	
	//@AfterClass	
	//public static void end() {
		
	//	driver.close();
	//}

}
