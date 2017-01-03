package Automation_Framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class accountCreation {
	WebDriver driver;
	
	@BeforeMethod
	  public void openbrowser() {
	   driver= new FirefoxDriver();
	  driver.get("http://www.rediff.com/");
	  driver.manage().window().maximize();
	  }
	
  @Test
  public void Createaccount()
  {
   //driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
   driver.findElement(By.xpath(".//*[@id='signin_info']/a[2]")).click();
   //driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
   driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
   Select Sel = new Select(driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select")));
   Sel.selectByIndex(2);
   System.out.println(driver.findElements(By.name("gender3a302639")));
   List<WebElement> allRadio = driver.findElements(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[26]/td[3]"));
   System.out.println(allRadio);
  
   allRadio.get(1).click();
 
  
   }
  
 
}


