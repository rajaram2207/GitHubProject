package com.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
public static WebDriver driver;
	private Hbpage a;
	private Hb2page b;
	private Hb3page c;
	private Hb4page d;
	
	

public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
}

public Hbpage getinstanceHbpage() {
	a=new Hbpage(driver);
	return a;
}

public Hb2page getinstanceHb2page() {
	b=new Hb2page(driver);
	return b;
}

public Hb3page getinstanceHb3page() {
	c=new Hb3page(driver);
	return c;
}

public Hb4page getinstanceHb4page() {
	d=new Hb4page(driver);
	return d;
}
}