package com.automation.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	
	
	
	@FindBy(xpath ="//a[@title='Log in to your customer account']" )
	private WebElement sign_btn;
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement email;

	private WebDriver driver;
	
	public Sign_In(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public void setSign_btn(WebElement sign_btn) {
		this.sign_btn = sign_btn;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

	
	}
	
	


