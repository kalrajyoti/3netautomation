package com.org.config.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.Utilty.ApplicationValues;
import com.org.threenet.pages.LoginPage;

public class ThreeNetWebsite {
	protected WebDriver driver;
	
 @BeforeTest
	public  void getUrl() {
	  //  ProfilesIni profile = new ProfilesIni();
	   // FirefoxProfile myprofile = profile.getProfile("default-1462771403761");
		driver = new FirefoxDriver();
		ApplicationValues appObje = new ApplicationValues();
		String s =appObje.getPropertyValue("ThreeNetWebsite.BaseURL");
		System.out.println("The base url is :" +s);
		driver.get(s);
		
		driver.manage().window().maximize();
		//String home = driver.getWindowHandle();
		System.out.println(" ThreeNetWebsite driver : " + driver);
	

	}
 
 
 

}