package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hb3page {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement select ;
	
	
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continu ;



	public Hb3page(WebDriver driver2) {
		this.driver=driver;
		PageFactory.initElements(driver2, this);
	}



	public WebElement getSelect() {
		return select;
	}



	public WebElement getContinu() {
		return continu;
	}

}
