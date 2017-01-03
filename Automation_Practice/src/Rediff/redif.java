package Rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redif {
	WebDriver driver;
  @Test
  public void callBrowser() throws InterruptedException {
	  driver.findElement(By.xpath("html/body/div[2]/div[4]/span[4]/span/a[1]")).click();
	  driver.findElement(By.name("proceed")).click();
	  Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000L);
	  String alText = a1.getText();
	  System.out.println("The text captured us :" +alText);
	  a1.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
	 driver.get("http://www.rediff.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}


/*explicit wait*/
  //WebDriverWait wait = new WebDriverWait(driver,10);
  //wait.untill(ExpectedCondtions.)
 


