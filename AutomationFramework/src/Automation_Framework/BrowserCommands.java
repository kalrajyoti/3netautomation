package Automation_Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {
	
	void displayBrowserCommands()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://3net.3pillarglobal.com/");
		String title =driver.getTitle();
		System.out.println("The title is :" +title);
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println("The current url is :" +getCurrentUrl);
		String getPagetSource = driver.getPageSource();
		System.out.println("The PagetSource is :" +getPagetSource);
		driver.quit();
		
		
	
	}

}
