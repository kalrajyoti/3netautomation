package Automation_Framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PopupHandling {
	WebDriver driver;
  @Test
  public void performPopuphandling() {
	  Set<String> winIds = driver.getWindowHandles();
		 System.out.println("Size of window are :" +winIds.size());
		 Iterator<String> ite = winIds.iterator();
		 String parentwindow = ite.next();
		 String childWindow = ite.next();
		 System.out.println(parentwindow);
		 System.out.println(childWindow);
		 driver.switchTo().window(childWindow);
		 driver.close();
		 driver.switchTo().window(parentwindow);
		 driver.findElement(By.name("srchword"));
		 
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.rediff.com/");
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
