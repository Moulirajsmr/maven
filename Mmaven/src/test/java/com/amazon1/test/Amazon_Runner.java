package com.amazon1.test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.Base_Class;

public class Amazon_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DR\\eclipse-workspace\\Mmaven\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		maximize(driver);
		
		url(driver, "https://www.amazon.in/");
		
		Amazon_Login log = new Amazon_Login(driver);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(log.getAccount()).build().perform();
		
		a.click(log.getSignin()).build().perform();
		
		send_keys(log.getUsername(),"+918056367469");
		
		click(log.getConti());
		
		send_keys(log.getPwd(), "mouliSMR@07");
		
		click(log.getSubmit());
		
		Amazon_Search sh = new Amazon_Search(driver);
		
		click(sh.getMobile());
		
		click(sh.getPhones());
		
		click(sh.getOs());
		
		click(sh.getBrand());
		
		click(sh.getSortby());
		
		click(sh.getHigh_to_low());
		
		Thread.sleep(10000);
		
		click(sh.getIphone());
		
String parent_Id = driver.getWindowHandle();
		
		Set<String> all_id = driver.getWindowHandles();
		
		for (String id : all_id) {
			
			System.out.println("id"+ id);
			
			if (id.equals(parent_Id)) {
				continue;				
			}else {
				driver.switchTo().window(id);
				Thread.sleep(5000);				
			}
			
		}
		
		click(sh.getCart());
		
		Thread.sleep(50000);
		
		click(sh.getBuy());
	
				
	}

}
