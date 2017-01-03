package Automation_Framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://money.rediff.com/losers/bse/daily/groupa");
	 String companyname = "HDIL"; 
	 List<WebElement> companies =driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
	 List<WebElement> currentPrices =driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
	 System.out.println(companies.size());
	 System.out.println(currentPrices.size());
	 
	 for(int i=0;i<companies.size();i++)
	 {
		 if(companyname.equals(companies.get(i).getText()))
		 {
			 System.out.println(companies.get(i).getText() + "" +currentPrices.get(i).getText() );
			 break;
		 }
	 }
	 
	 

}
