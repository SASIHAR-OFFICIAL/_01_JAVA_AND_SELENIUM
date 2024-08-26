package _S_04_Parthasarathy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_2_Parthasarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String baseUrl = "http://demo.guru99.com/test/link.html";					
		 System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver driver  = new ChromeDriver();				
	        		
	        driver.get(baseUrl);					
	        driver.findElement(By.linkText("click here")).click();					
	        System.out.println("title of page is: " + driver.getTitle());							
	        //driver.quit();			

	}

}
