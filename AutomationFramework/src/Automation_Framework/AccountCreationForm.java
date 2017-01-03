package Automation_Framework;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AccountCreationForm {
	WebDriver driver;
  @Test
  public void fillForm() {
	  driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("jyoti kalra");
	  driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("jyoti.kalra3");
	  driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[2]")).click();
	  driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("Test1234");
	  driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("Test1234");
	  driver.findElement(By.xpath(".//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("jyoti.kalra@3pillarglobal.com");
	  driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
	  Select Sel3 = new Select(driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select")));
	   Sel3.selectByIndex(2);
	   driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("kalra");
	   driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input")).sendKeys("S kalra");
	  driver.findElement(By.xpath(".//*[@id='mobno']")).sendKeys("8095137240");
	  Select Sel = new Select(driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[1]")));
	   Sel.selectByIndex(2);
	   Select Sel1 = new Select(driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[2]")));
	   Sel1.selectByIndex(2);
	   Select Sel2 = new Select(driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[3]")));
	   Sel2.selectByIndex(2);
	   
	   List<WebElement> allRadio = driver.findElements(By.name("gender41de42ad"));
	   System.out.println(allRadio);
	   System.out.println(allRadio.size());
	  // boolean bValue = false;
	  // bValue = allRadio.get(0).isSelected();
	 // if(bValue = true){
		//   allRadio.get(1).click();
		   //+
	  // }
	  // else{
		   
			// If the first radio button is not selected by default, the first will be selected
		 
		 //  allRadio.get(0).click();
		 
		 //}
	   }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
 
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
