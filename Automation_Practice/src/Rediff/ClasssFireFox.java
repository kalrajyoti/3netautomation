package Rediff;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClasssFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("jyoti.kalra@3pillarglobal.com");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys("3Pillar@1satnam");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("signIn")).click();
		
		
		//driver.findElement(By.linkText("need-help")).click();
		//driver.findElement(By.className("rc-button rc-button-submit")).click();
		//driver.findElement(By.xpath("//*input[@id='next'")).click();
		//List<WebElement> inputTag =driver.findElements(By.tagName("a"));
				

	}

}