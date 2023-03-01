Feature: Validate A Booking Functionality In Adactin Hotel Booking Application

Scenario: Login Page
Given User Launch The Adactin Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login button and It Navigate To Search Hotel Page


Scenario: Searh Hotel
When user Select The Location In the Location Dropdown
And user Select The Hotel In the Hotels Dropdown
And user Select The Roomtype In the Roomtype Dropdown
And user Select The No Of Rooms In the No Of Rooms Dropdown
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field
And user Select The Adults Per Rooms In The Adults Per Rooms Dropdown
And user Select The Childrens Per Rooms In The Childrens Per Room Dropdown
Then user Click The Search button And It Navigate To Select Hotel Page


Scenario: Select Hotel
When user Click The Select In The Select Radio button
Then user Click The Continue button an It Navigate Book A Hotel Page


Scenario: Book A Hotel
When user Enter The Firstname In The Firstname Field
And user Enter The Lastname In The Lastname Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card No In The Credit Card No Field
And user Select The Credit Card Type In The Credit Card Type Dropdown
And user Select The Expriy Date Month In The select Month Dropdown
And user Select The Expriy Date Year In The Select Year Dropdown
And user Enter The Cvv Number In The Cvv Number Field
Then User Click The Book Now button And It Navigate To Booking Confirmation Page