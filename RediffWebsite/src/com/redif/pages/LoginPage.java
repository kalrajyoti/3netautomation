package com.redif.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LoginForm()
	{
		DefaultPage obj = new DefaultPage(driver);
		obj.getURL();
		obj.clickSignIn();
		
	}
	public void fillLoginForm()
	{
		driver.findElement(By.id("login1")).sendKeys("jyoti.kalra3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit")).click();
	}

}
