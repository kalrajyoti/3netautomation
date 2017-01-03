package com.redif.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DefaultPage {
	
	private WebDriver driver;
	
	public DefaultPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	public void clickSignIn()
	{
		getURL();
		driver.findElement(By.linkText("Sign in")).click();
		
	}

	public void clickOnAccountCreation()
	
	{
		getURL();
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
	}
	
	public void verifyDefaultPage()
	{
		clickSignIn();
		clickOnAccountCreation();
		
		
	}
	

	public void getURL()
	{
		
		driver.get("http://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
	}
	
	
	
	


}
