package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hb4page {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;
	
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billing;
	
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditCard ;
	
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditCardType;
	
	
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryYear ;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumbers ;
	
	
	public Hb4page(WebDriver driver2) {
		this.driver=driver;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getBilling() {
		return billing;
	}


	public WebElement getCreditCard() {
		return creditCard;
	}


	public WebElement getCreditCardType() {
		return creditCardType;
	}


	public WebElement getExpiryMonth() {
		return expiryMonth;
	}


	public WebElement getExpiryYear() {
		return expiryYear;
	}


	public WebElement getCvvNumbers() {
		return cvvNumbers;
	}


	public WebElement getBookNow() {
		return bookNow;
	}


	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNow;
}
