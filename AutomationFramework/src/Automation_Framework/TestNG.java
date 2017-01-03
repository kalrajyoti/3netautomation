package Automation_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("Email")).sendKeys("jyoti.kalra@3pillarglobal.com");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys("3Pillar@1satnam");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("signIn")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
		driver.get("http://gmail.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
}
