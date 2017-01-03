zzpackage com.org.threenet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Utilty.ApplicationValues;
import com.org.config.main.ThreeNetWebsite;

public class LoginPage {

	public WebDriver driver;
	public String username;
	public String password;


	public LoginPage(WebDriver driver )
	{
	
		this.driver = driver;
		System.out.println(" LoginPage driver : " + this.driver);
	}

	public boolean logInTo3Net () 
	{
		
		System.out.println(" logInTo3Net driver : " + this.driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Email")).sendKeys(ApplicationValues.getPropertyValue("loginPage.username"));
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys(ApplicationValues.getPropertyValue("loginPage.password"));

		driver.findElement(By.id("signIn")).click();
		
		WebElement errormessage = null;
		try{
		
			errormessage = driver.findElement(By.id("errormsg_0_Passwd"));
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Error msg not found :" + e.getMessage());
		}

		System.out.println("Errormessage" + errormessage);
		if(errormessage==null)
		{
			
			return true;
		}
		return false;

	}

	public UtilsMenu enableAccess() 

	{
		WebElement allowbutton= driver.findElement(By.id("submit_approve_access"));
		System.out.println("Submit approve access button found : " +  allowbutton.getText());
		
		while(!allowbutton.isEnabled())
		{
			System.out.println("Not enable");
		}
		
		
		allowbutton.click();
		return new UtilsMenu(driver);
		
		
}
	

}