package com.livehealtier.configration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class BaseLH {
	protected WebDriver driver;
	@BeforeTest
	public void getURL()
	{
	 driver = new FirefoxDriver();
	 BasicConf basicconfig = new BasicConf();
	 String s = basicconfig.getPropertyValue("BaseURL");
	  driver.get(s);
	  driver.manage().window().maximize();

     }
}
