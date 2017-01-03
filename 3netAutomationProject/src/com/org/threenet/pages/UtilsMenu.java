package com.org.threenet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.org.Utilty.ApplicationValues;

public class UtilsMenu {
	
	public WebDriver driver;
	
	public UtilsMenu(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("Utilmenu driver" + this.driver);
		
	}
	
	
    public void clickOnUtils()
    {
    	System.out.println("hello jyoti");
    	System.out.println(" logInTo utilmenu driver : " + this.driver);
  
    	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/ul/li[5]/a")).click();
    	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    	driver.findElement(By.linkText("Check")).click();
    	
    }
    
    public FindUser checkEmployeeAvailabity()
    {
    	driver.findElement(By.name("empname")).sendKeys(ApplicationValues.getPropertyValue("Empname"));
    	driver.findElement(By.id("submit")).click();
    	return new FindUser(driver);
    }
   


}
