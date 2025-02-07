package _S_05_01_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _03_Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Starts a new instance of Google Chrome 
		
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	
		 
		// Open a webpage (method will return after the page is fully loaded) 
		driver.navigate().to("http://selenium.academy"); 
		 
		// Refresh the page 
		driver.navigate().refresh(); 
		 
		// Closes the running Google Chrome instance 
		driver.quit(); 
	}

}
