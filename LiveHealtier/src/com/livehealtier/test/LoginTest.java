package com.livehealtier.test;

import org.testng.annotations.Test;

import com.livehealtier.configration.BaseLH;
import com.livehealtier.pages.Login;

public class LoginTest extends BaseLH {
	
	
	public void verifyUserCredtials()
	{
		System.out.println("value of driver"+driver);
		Login login = new Login(driver);
		login.LoginToPortal();
	}
	

}
