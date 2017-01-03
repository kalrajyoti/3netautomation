package com.rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainHomePageTest {
	
	
	static WebDriver driver=null;
	static WebElement element;
	
	
	
	public static WebElement clickOnSignIN()
	{
		element = driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]"));
		element.click();
		return element;
	}
	
	public static WebElement RediffAccountCreation()
	{
		 element = driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]"));
		 element.click();
		 return element;
	}
}
	
	
	
	
	
	
	
	
	
	
	/*private static WebElement element = null;
	
	public static WebElement clickOnSignIN(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]"));
		return element;
	}
	public static WebElement RediffAccountCreation(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='signin_info']/a[2]"));
		return element;
	}
	

}*/
