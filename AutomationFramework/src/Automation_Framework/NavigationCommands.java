package Automation_Framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationCommands {
	
	
	void displayNavigationCommands()
	{
		
		WebDriver driver = new FirefoxDriver();
		 driver.navigate().to("https://3net.3pillarglobal.com/");
		driver.navigate().forward();
		driver.navigate().back();
		
		
		
	}

}
