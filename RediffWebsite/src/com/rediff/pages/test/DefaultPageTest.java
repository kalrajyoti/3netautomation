package com.rediff.pages.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.redif.pages.DefaultPage;

public class DefaultPageTest {
	
	private WebDriver driver;
	@BeforeClass
	public void intialiseDriver(){
		driver = new FirefoxDriver();
		
	}
	@Test
	
	public void verifyDefaultPage()
	{
		DefaultPage defaultPage = new DefaultPage(driver);
		defaultPage.verifyDefaultPage();
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
