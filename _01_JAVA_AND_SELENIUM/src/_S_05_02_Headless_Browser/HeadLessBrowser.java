package _S_05_02_Headless_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessBrowser {
 WebDriver driver;
 
 @Test
 public void googleSearch() throws InterruptedException{
  driver = new HtmlUnitDriver();
  driver.get("http://google.co.in");
  
  System.out.println("Title of page is: " + driver.getTitle());
  
  driver.get("http://facebook.com");
  
  System.out.println("Title of page is: " + driver.getTitle());
 }
}