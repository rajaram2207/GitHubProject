package com.stepDefinition;

import java.io.IOException;

import com.baseclas.Basecllass;
import com.helper.FileReaderManager;
import com.pom.Hb2page;
import com.pom.Hb3page;
import com.pom.Hb4page;
import com.pom.Hbpage;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefintion extends Basecllass{
	PageObjectManager n=new PageObjectManager(driver);
	@Given("User open chromeband enter a url")
	public void user_open_chromeband_enter_a_url() throws IOException {
		
		String url = FileReaderManager.getinstance().getinstance2().geturl();
		getUrl(url);
	}
	@When("User enter username")
	public void user_enter_username() {
	   sendkeys(n.getinstanceHbpage().getUserName(), "rajarams");
	}
	@When("User enter password")
	public void user_enter_password() {
	   sendkeys(n.getinstanceHbpage().getPassword(), "123456789");
	}
	@Then("User click the login")
	public void user_click_the_login() {
	    clickOnElement(n.getinstanceHbpage().getLogin());
	}
	

	@Given("User Enter The Details")
	public void user_enter_the_details() {
	   System.out.println("Enter The Details");
	}
	@When("User Enter The Location")
	public void user_enter_the_location() {
		sendkeys(n.getinstanceHb2page().getCountry(),"New York");
	}
	@When("User Enter The HotelName")
	public void user_enter_the_hotel_name() {
	    sendkeys(n.getinstanceHb2page().getHotelName(), "Hotel Creek");
	}
	@When("User Enter The Room Type")
	public void user_enter_the_room_type() {
		sendkeys(n.getinstanceHb2page().getRoomTypes(), "Delux");
	}  
	@When("User Enter The Number Of Room")
	public void user_enter_the_number_of_room() {
	    sendkeys(n.getinstanceHb2page().getRoomNumbers(), "1");
	}
	@When("User Enter The Check In Date")
	public void user_enter_the_check_in_date() {
	   sendkeys(n.getinstanceHb2page().getCheckIn(), "30/08/2022"); 
	}
	@When("User Enter The Check Out Date")
	public void user_enter_the_check_out_date() {
		sendkeys(n.getinstanceHb2page().getCheckOut(),"01/09/2022");
	}
	@When("User Enter The Number Of Adult")
	public void user_enter_the_number_of_adult() {
		sendkeys(n.getinstanceHb2page().getAdult(),"2");
	}
	@When("User Enter The Number Of Children")
	public void user_enter_the_number_of_children() {
		sendkeys(n.getinstanceHb2page().getChilderns(),"2");
	}
	@Then("User Click The Search")
	public void user_click_the_search() {
	    clickOnElement(n.getinstanceHb2page().getSearch());
	}

	

	@Given("User Select The Room")
	public void user_select_the_room() {
	    System.out.println("Select Room");
	}
	@When("User Click The Select")
	public void user_click_the_select() {
	   clickOnElement(n.getinstanceHb3page().getSelect());
	}
	@Then("User Click The Contiune")
	public void user_click_the_contiune() {
	   clickOnElement(n.getinstanceHb3page().getContinu());
	}

	

	@Given("User Enter The details")
	public void user_enter_the_details1() {
	   System.out.println("Enter The Details");
	}
	@When("User Enter The First Name")
	public void user_enter_the_first_name() {
	   sendkeys(n.getinstanceHb4page().getFirstName(), "Raja"); 
	}
	@When("User Enter The Last Name")
	public void user_enter_the_last_name() {
	    sendkeys(n.getinstanceHb4page().getLastName(), "Ram");
	}
	@When("User Enter The Address")
	public void user_enter_the_address() {
	   sendkeys(n.getinstanceHb4page().getBilling(),"12345678902333sygiufdsuygiyfoiuhb usa"); 
	}
	@When("User Enter The Card Number")
	public void user_enter_the_card_number() {
	    sendkeys(n.getinstanceHb4page().getCreditCard(), "3222155243231220339");
	}
	@When("User Enter The Card Type")
	public void user_enter_the_card_type() {
	  sendkeys(n.getinstanceHb4page().getCreditCardType(), "visa");
	}
	@When("User Enter The Expiry Month")
	public void user_enter_the_expiry_month() {
	    sendkeys(n.getinstanceHb4page().getExpiryMonth(), "August");
	}
	@When("User Enter The Expiry Year")
	public void user_enter_the_expiry_year() {
	   sendkeys(n.getinstanceHb4page().getExpiryYear(), "2022");
	}
	@When("User Enter The Ccv Number")
	public void user_enter_the_ccv_number() {
	   sendkeys(n.getinstanceHb4page().getCvvNumbers(), "435");
	}
	@Then("User Click The Book Now")
	public void user_click_the_book_now() {
	   clickOnElement(n.getinstanceHb4page().getBookNow());
	}




	





}
