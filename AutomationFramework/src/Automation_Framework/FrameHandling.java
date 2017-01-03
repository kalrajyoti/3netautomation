package Automation_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import org.openqa.selenium.WebElement;

public class FrameHandling {
	WebDriver driver;
  @Test (priority=1)
  public void f() {
	  driver = new FirefoxDriver();
	  driver.get("https://paytm.com/");
	  noOfFrame();
	  driver.switchTo().frame(0);
	  
	 
	  driver.findElement(By.xpath(".//*[@id='user-detail']/div/div[4]/div[3]/div/div[1]/a[1]")).click();
  }
  @Test(priority=2)
	  public  void noOfFrame()
	  {
	  List<WebElement> noOfFrames= driver.findElements(By.tagName("iframe"));
		 System.out.println("no of frame" +noOfFrames.size());
		 for(int i=0;i<noOfFrames.size();i++)
		 {
			 driver.switchTo().frame(i);
			 int s= driver.findElements(By.id("input_0")).size();
			 System.out.println(s);
			 driver.switchTo().defaultContent();
		 }
	}
  
  //@BeforeMethod
 // public void beforeMethod() {
	 
 // }
 
  //@AfterMethod
  //public void afterMethod() {
	//  driver.close();
  //}

}
