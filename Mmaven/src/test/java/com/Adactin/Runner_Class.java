package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.pojo.Book_Hotel;
import com.adactin.pojo.Login_Page;
import com.adactin.pojo.Search_Page;
import com.adactin.pojo.Select_Hotel;
import com.base.Base_Class;

public class Runner_Class extends Base_Class{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
		maximize(driver);		
		
		send_keys(driver, "https://adactinhotelapp.com/");
		
		Login_Page login = new Login_Page(driver);
		
		//url(login., null);
		
		send_keys(login.getUser_name(), "Mouliraj07");
		
		send_keys(login.getPwd(), "MOULI@07sn");
		
		click(login.getLogin_btn());
		
		Search_Page search = new Search_Page(driver);
		
				
		select_vtext(search.getLocation(), "Sydney");
		
		select_vtext(search.getHotels(), "Hotel Hervey");
		
		select_vtext(search.getRoomtype(), "Deluxe");
		
		select_value(search.getNo_of_room(), "1");
		
		search.getCheck_in().clear();
		
		search.getCheck_out().clear();
		
		send_keys(search.getCheck_in(), "22/10/2022");
		
		send_keys(search.getCheck_out(), "24/10/2022");
		
		select_value(search.getAdult_room(), "2");
		
		select_value(search.getChild_room(), "2");
		
		click(search.getSearch_btn());
		
		Select_Hotel hotel = new Select_Hotel(driver);
		
		click(hotel.getSlect_btn());
		
		click(hotel.getConfirm_btn());
		
		Book_Hotel book =new Book_Hotel(driver);
		
		send_keys(book.getFirstname(), "Mouliraj");
		
		send_keys(book.getLastname(), "nagarajan");
		
		send_keys(book.getAddress(), "11/5-80A,Mel Vellaler street, Mecheri");
		
		send_keys(book.getCredit_card(), "8635975396218634");
		
		select_vtext(book.getCard_type(), "VISA");
		
		select_value(book.getExpiry_month(), "12");
		
		select_vtext(book.getExpiry_year(), "2022");
		
		send_keys(book.getCvv_number(), "500");
		
		click(book.getBook_btn());
				
	}

}
