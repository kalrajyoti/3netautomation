package com.org.threenet.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.config.main.ThreeNetWebsite;
import com.org.threenet.pages.FindUser;
import com.org.threenet.pages.LoginPage;
import com.org.threenet.pages.UtilsMenu;

public class LoginPageTest  extends ThreeNetWebsite{

	@BeforeMethod
	public void testBeforeClass()
	{
		System.out.println("test the before class method");
	}
	
	
	/* @Test
	public void verifyLoginForm()
	{
		System.out.println("test the verify login Form");
		
		LoginPage loginobj = new LoginPage(driver);
		System.out.println(" loginobj driver : " + loginobj.driver);
		
		Assert.assertEquals(loginobj.logInTo3Net(), true);
		
		UtilsMenu utilsmenu =loginobj.enableAccess();
		
		utilsmenu.clickOnUtils();
		utilsmenu.checkEmployeeAvailabity();
		FindUser finduser = utilsmenu.checkEmployeeAvailabity();
		finduser.findUserOn3Net();
		driver.close();
		 
	}
	
*/
}