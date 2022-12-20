package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configuration_reader {
	public static Properties pro;
	public configuration_reader() throws IOException {
		
	
	File b=new File("C:\\Users\\rajaram\\eclipse-workspace\\Cucumber2\\src\\test\\java\\com\\helper\\hotel.property");
	FileInputStream n=new FileInputStream(b);
	 pro =new Properties();
	pro.load(n);
	
	}	
	public String getbrowser() {
		String browser = pro.getProperty("browser");
return browser;
	}
	public String geturl() {
		String url = pro.getProperty("url");
return url;
	}
}