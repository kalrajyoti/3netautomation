package com.org.threenet.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.org.config.main.ThreeNetWebsite;
import com.org.threenet.pages.UtilsMenu;

public class UtilsMenuTest extends ThreeNetWebsite {
	
	
	@Test
	
	public void displayUtilMenu()
	{ 
		
		UtilsMenu utilmenu = new UtilsMenu(driver);
		
		System.out.println("utillclass driver" + utilmenu.driver);
		
		
		//Assert.assertEquals(dailyattendancemenuobj.viewDailyAttendanceReport(),false);
		
	}

	

}
