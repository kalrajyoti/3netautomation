package Automation_Framework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://3net.3pillarglobal.com/");
		driver.findElement(By.id("Email")).sendKeys("jyoti.kalra@3pillarglobal.com");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.name("Passwd")).sendKeys("3Pillar@1satnam");
		driver.findElement(By.id("signIn")).click();

		  WebElement d = driver.findElement(By.id("errormsg_0_Passwd"));
       
      if(d!=null)
      {
    	
    	  System.out.println("the error message is :"+d.getText());
      }
      else
      {
    	  System.out.println("user is successfully login:");
      }

		// String	Tiltle = driver.getTitle();
		//System.out.println(Tiltle);
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		// String pageSource = driver.getPageSource();
		// System.out.println(pageSource);
		//driver.close();
		}
		

	}











