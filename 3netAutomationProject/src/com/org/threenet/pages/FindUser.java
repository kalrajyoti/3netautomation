package com.org.threenet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.org.Utilty.ApplicationValues;

public class FindUser {
	public WebDriver driver;
	
	public FindUser(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void findUserOn3Net()
	{
		
		System.out.println("find user");
		driver.findElement(By.id("submit"));//.sendKeys(ApplicationValues.getPropertyValue("FindUser"));
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/form/span/input[2]")).click();
	}

}
