package Automation_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		String rootelement = ".//*[@id='nav_grp']/li[1]/a";
		String subElement = ".//*[@id='nav_grp']/li[1]/div[2]/ul/li[3]/a";
		WebElement rootelement1 = driver.findElement(By.xpath(rootelement));
		WebElement sub = driver.findElement(By.xpath(subElement));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(rootelement1).build().perform();
		sub.click();
		

	}

}
