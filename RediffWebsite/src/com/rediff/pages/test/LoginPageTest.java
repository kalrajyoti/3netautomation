package com.rediff.pages.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.redif.pages.LoginPage;

public class LoginPageTest {
	private WebDriver driver;
  @Test
  public void callFirefoxDriver() {
	  LoginPage login = new LoginPage(driver);
	  login.LoginForm();
	  login.fillLoginForm();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
