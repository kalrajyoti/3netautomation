package com.livehealtier.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.livehealtier.configration.BasicConf;

public class Login {
	WebDriver driver;
	
 public Login(WebDriver driver)
 {
	 this.driver = driver;
 }
 
 public void LoginToPortal()
 {
	 System.out.println("value of driver in  login page"+driver);
	 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	 System.out.println("hello j");
	 driver.findElement(By.id("ctl00_ContentPlaceHolder1_UserName")).sendKeys(BasicConf.getPropertyValue("Username"));
	 System.out.println("test");
	 driver.findElement(By.id("ctl00_ContentPlaceHolder1_Password")).sendKeys(BasicConf.getPropertyValue("Password"));
	 driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkLogin")).click();
	 
	 
 }
}
