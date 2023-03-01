package com.adac.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pojo.Book_Hotel;
import com.adactin.pojo.Login_Page;
import com.adactin.pojo.Search_Page;
import com.adactin.pojo.Select_Hotel;
import com.base.Base_Class;
import com.cucu.runner.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	
		
	public static WebDriver driver =Runner_Class.driver;
		
	@Given("User Launch The Adactin Url")
	public void user_launch_the_adactin_url() {	
	driver.get("https://adactinhotelapp.com/");	
	}
	
	public static Login_Page login = new Login_Page(driver);
	
	@Given("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
	    send_keys(login.getUser_name(), "Mouliraj07");
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
	   send_keys(login.getPwd(), "MOULI@07sn");
	}
	@Then("user Click The Login button and It Navigate To Search Hotel Page")
	public void user_click_the_login_button_and_it_navigate_to_search_hotel_page() {
	   click(login.getLogin_btn());
	}
	
	public static Search_Page search = new Search_Page(driver);
	
	@When("user Select The Location In the Location Dropdown")
	public void user_select_the_location_in_the_location_dropdown() {
	    select_vtext(search.getLocation(), "Sydney");
	}
	@When("user Select The Hotel In the Hotels Dropdown")
	public void user_select_the_hotel_in_the_hotels_dropdown() {
	    select_vtext(search.getHotels(), "Hotel Hervey");
	}
	@When("user Select The Roomtype In the Roomtype Dropdown")
	public void user_select_the_roomtype_in_the_roomtype_dropdown() {
	    select_vtext(search.getRoomtype(), "Deluxe");
	}
	@When("user Select The No Of Rooms In the No Of Rooms Dropdown")
	public void user_select_the_no_of_rooms_in_the_no_of_rooms_dropdown() {
	    select_value(search.getNo_of_room(), "2");
	}
	@When("user Enter The Check In Date In The Check In Date Field")
	public void user_enter_the_check_in_date_in_the_check_in_date_field() {
		search.getCheck_in().clear();
		send_keys(search.getCheck_in(), "22/11/2022");
	}
	@When("user Enter The Check Out Date In The Check Out Date Field")
	public void user_enter_the_check_out_date_in_the_check_out_date_field() {
		search.getCheck_out().clear();
		send_keys(search.getCheck_out(), "24/11/2022");
	}
	@When("user Select The Adults Per Rooms In The Adults Per Rooms Dropdown")
	public void user_select_the_adults_per_rooms_in_the_adults_per_rooms_dropdown() {
		select_value(search.getAdult_room(), "4");
	}
	@When("user Select The Childrens Per Rooms In The Childrens Per Room Dropdown")
	public void user_select_the_childrens_per_rooms_in_the_childrens_per_room_dropdown() {
		select_value(search.getChild_room(), "4");
	}
	@Then("user Click The Search button And It Navigate To Select Hotel Page")
	public void user_click_the_search_button_and_it_navigate_to_select_hotel_page() {
		click(search.getSearch_btn());
	}
	
	public static Select_Hotel hotel = new Select_Hotel(driver);
	
	@When("user Click The Select In The Select Radio button")
	public void user_click_the_select_in_the_select_radio_button() {
		click(hotel.getSlect_btn());
	}
	@Then("user Click The Continue button an It Navigate Book A Hotel Page")
	public void user_click_the_continue_button_an_it_navigate_book_a_hotel_page() {
		click(hotel.getConfirm_btn());
	}
	
	public static Book_Hotel book = new Book_Hotel(driver);
	
	@When("user Enter The Firstname In The Firstname Field")
	public void user_enter_the_firstname_in_the_firstname_field() {
		send_keys(book.getFirstname(), "Mouliraj");
	}
	@When("user Enter The Lastname In The Lastname Field")
	public void user_enter_the_lastname_in_the_lastname_field() {
		send_keys(book.getLastname(), "nagarajan");
	}
	@When("user Enter The Billing Address In The Billing Address Field")
	public void user_enter_the_billing_address_in_the_billing_address_field() {
		send_keys(book.getAddress(), "11/5-80A,Mel Vellaler street, Mecheri");
	}
	@When("user Enter The Credit Card No In The Credit Card No Field")
	public void user_enter_the_credit_card_no_in_the_credit_card_no_field() {
		send_keys(book.getCredit_card(), "8635975396218634");
	}
	@When("user Select The Credit Card Type In The Credit Card Type Dropdown")
	public void user_select_the_credit_card_type_in_the_credit_card_type_dropdown() {
		select_vtext(book.getCard_type(), "VISA");
	}
	@When("user Select The Expriy Date Month In The select Month Dropdown")
	public void user_select_the_expriy_date_month_in_the_select_month_dropdown() {
		select_value(book.getExpiry_month(), "12");
	}
	@When("user Select The Expriy Date Year In The Select Year Dropdown")
	public void user_select_the_expriy_date_year_in_the_select_year_dropdown() {
		select_vtext(book.getExpiry_year(), "2022");
	}
	@When("user Enter The Cvv Number In The Cvv Number Field")
	public void user_enter_the_cvv_number_in_the_cvv_number_field() {
		send_keys(book.getCvv_number(), "500");
	}
	@Then("User Click The Book Now button And It Navigate To Booking Confirmation Page")
	public void user_click_the_book_now_button_and_it_navigate_to_booking_confirmation_page() {
		click(book.getBook_btn());
	}
}
