package com.rediff.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.rediff.pages.MainHomePageTest;

public class PageObjectModel {
	 private static WebDriver driver = null;

	 public static void main(String[] args) {
		 driver = new FirefoxDriver();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.get("http://www.rediff.com/");
		 MainHomePageTest.clickOnSignIN();
		 MainHomePageTest.RediffAccountCreation();
		 
	 }

}
