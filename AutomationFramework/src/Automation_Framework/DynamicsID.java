
package Automation_Framework;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicsID {

 public static void main(String[] args) {
  WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
    driver.get("https://in.yahoo.com/");
    driver.findElement(By.id("UHSearchBox")).sendKeys("Hello");
    driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
    List<WebElement> list= driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_12_0_1')]/a"));
    list.get(3).click();
   
 }
}