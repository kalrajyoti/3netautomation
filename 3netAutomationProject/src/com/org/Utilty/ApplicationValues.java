package com.org.Utilty;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ApplicationValues {
	private static Properties propertyobj = new Properties(); 
	public ApplicationValues()
	{
		 try{
		FileInputStream objfile = new FileInputStream("C:/JyotiDev/3netAutomationProject/Configuration/objects.properties");
		
		propertyobj.load(objfile);
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println("The error message of file is: "+ e.getMessage());
		 }
		catch(IOException io)
		 {
			System.out.println("input output exception is :" + io.getMessage());
		 }
	}
	
	public static String getPropertyValue(String propertyname)
	{
		String value = propertyobj.getProperty(propertyname);
		return value;
	}

}
