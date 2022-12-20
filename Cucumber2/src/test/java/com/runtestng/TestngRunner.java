package com.runtestng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.baseclas.Basecllass;
import com.helper.FileReaderManager;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="C:\\Users\\rajaram\\eclipse-workspace\\Cucumber2\\src\\test\\java\\com\\feature\\Hotel.feature"
,glue="com.stepDefinition",plugin={"html:target/cucumber.html"})	
public class TestngRunner extends AbstractTestNGCucumberTests{
	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws IOException {
		String browser = FileReaderManager.getinstance().getinstance2().getbrowser();
		driver=Basecllass.browser(browser);

	}
	
	
}
