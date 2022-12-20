package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hb2page {
public static WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement country;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotelName;
	
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomTypes ;

	@FindBy(xpath ="//select[@name='room_nos']" )
	private WebElement roomNumbers  ;
	
	
	@FindBy(xpath ="//input[@id='datepick_in']" )
	private WebElement checkIn  ;
	
	
	@FindBy(xpath ="//input[@id='datepick_out']" )
	private WebElement checkOut   ;
	
	
	@FindBy(xpath ="//select[@name='adult_room']" )
	private WebElement adult  ;
	
	
	public Hb2page(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements( driver,this); 
			
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomTypes() {
		return roomTypes;
	}

	public WebElement getRoomNumbers() {
		return roomNumbers;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChilderns() {
		return childerns;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath ="//select[@name='child_room']" )
	private WebElement  childerns ;
	
	@FindBy(xpath ="//input[@type='submit']" )
	private WebElement search  ;
}
