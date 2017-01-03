package Rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CreateAccount {
	WebDriver driver;

  @Test
  public void createAccount()  throws InterruptedException
  {
	  
	  //driver.findElement(By.xpath(".//*[@id='signin_info']/a[2]")).click();
	  //driver.findElement(By.name("chk_altemaile823e67e")).click();
	 // driver.findElement(By.name("hintqe823e67e")).click();
	//  driver.findElement(By.name("gendere823e67e")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 
		  
		  driver = new FirefoxDriver();
		  
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
     }
   
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
	  
  }

}
