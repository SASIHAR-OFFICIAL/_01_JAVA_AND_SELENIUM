package _S_05_02_Headless_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser3 {

    public static void main(String[] args) {

    	 ChromeOptions options = new ChromeOptions();
         options.addArguments("--headless=new"); // headless mode
         options.addArguments("--disable-gpu");
         options.addArguments("--window-size=1920,1080");

         WebDriver driver = new ChromeDriver(options);

         driver.get("https://www.google.co.in");
         System.out.println("Title = " + driver.getTitle());

         driver.quit();
     }
 }

