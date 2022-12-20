package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclas.Basecllass;
import com.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rajaram\\eclipse-workspace\\Cucumber2\\src\\test\\java\\com\\feature\\Hotel.feature"
,glue="com.stepDefinition",plugin={"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner {
	public static WebDriver driver;
@BeforeClass
public static void setup() throws IOException {
	String browser = FileReaderManager.getinstance().getinstance2().getbrowser();
	driver=Basecllass.browser(browser);

}

	
	
}




