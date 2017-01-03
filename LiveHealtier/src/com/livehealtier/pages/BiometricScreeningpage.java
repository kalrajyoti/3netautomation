package com.livehealtier.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.livehealtier.configration.BasicConf;

public class BiometricScreeningpage {
	WebDriver driver;
	public BiometricScreeningpage(WebDriver driver)
	{
		this.driver = driver;
	}


	public void shuduleBiometricScreening()
	{
		System.out.println("screening value in page class" +driver);
		WebElement rootelement = driver.findElement(By.xpath(BasicConf.getPropertyValue("Menuxpath")));
		WebElement subelement = driver.findElement(By.xpath(BasicConf.getPropertyValue("submenuxpath")));
		System.out.println("the value of submenu"+subelement);
		Actions act = new Actions(driver);
		act.moveToElement(rootelement).build().perform();
		subelement.click();
		WebElement scheduleButton = driver.findElement(By.id("scheduleButton2_0"));

		scheduleButton.click();


		Set<String> handle= driver.getWindowHandles();//Return a set of window handle
		for(String h1:handle){
			System.out.println("Handle : " + h1);
			driver.switchTo().window(h1);
		}
		WebElement inspect = driver.findElement(By.id("ui-id-2"));
		System.out.println("the message displayed in popup window" +inspect.getText());
		WebElement location=driver.findElement(By.id("locationDropdownList"));
		WebElement sublocation=driver.findElement(By.id("sublocationDropdownList"));
		
		Select selocation=new Select(location);
		selocation.selectByValue(BasicConf.getPropertyValue("locationvalue"));
				
		Select sesublocation=new Select(sublocation);
		sesublocation.selectByValue(BasicConf.getPropertyValue("subocation"));		
		
		WebElement datepicker=driver.findElement(By.xpath(BasicConf.getPropertyValue("Datepicker")));
		datepicker.click();
		WebElement timepicker=driver.findElement(By.xpath(BasicConf.getPropertyValue("Timepicker")));
		timepicker.click();
		WebElement submitbutton=driver.findElement(By.xpath(BasicConf.getPropertyValue("Submit")));
		System.out.println(submitbutton);
		submitbutton.click();
		WebElement confirmbutton =driver.findElement(By.id("confirmButton"));
		confirmbutton.click();
		
		
		
		
		//Selection sel = new 
		

		//act.moveToElement(scheduleButton).build().perform();

	}

}
