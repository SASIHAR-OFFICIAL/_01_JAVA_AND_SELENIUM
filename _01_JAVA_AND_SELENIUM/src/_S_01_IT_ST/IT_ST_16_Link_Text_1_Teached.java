package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_16_Link_Text_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			String baseUrl = "http://demo.guru99.com/test/link.html";		        		
	        d.get(baseUrl);					
	        d.findElement(By.linkText("click here")).click();					
	        System.out.println("title of page is: " + d.getTitle());							
	        //driver.quit();			

	}

}
