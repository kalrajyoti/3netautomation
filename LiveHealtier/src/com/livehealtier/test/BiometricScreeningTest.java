package com.livehealtier.test;



import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.livehealtier.configration.BaseLH;
import com.livehealtier.pages.BiometricScreeningpage;
import com.livehealtier.pages.Login;

public class BiometricScreeningTest  extends BaseLH
{
	
	@Test
	public void verfiyBiometricScreening()
	{
		Login logintest = new Login(driver);
		logintest.LoginToPortal();
		BiometricScreeningpage biometricscreening = new BiometricScreeningpage(driver);
		System.out.println("jk" +driver);
		biometricscreening.shuduleBiometricScreening();
		//System.out.println("the driver is screening" +driver);
		//Login logintest = new Login(driver);
	   // return new Login(driver);
	 
	}
	//@AfterTest
	//public BiometricScreeningpage verfiy()
	//{
	//	BiometricScreeningpage biometricscreening = new BiometricScreeningpage(driver);
	//	System.out.println("jk" +driver);
	//	biometricscreening.shuduleBiometricScreening();
	//	return new BiometricScreeningpage(driver);
		
	//}

}
