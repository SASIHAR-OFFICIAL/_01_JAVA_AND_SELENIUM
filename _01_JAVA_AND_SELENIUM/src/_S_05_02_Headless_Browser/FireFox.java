package _S_05_02_Headless_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFox {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(options);
	        // Open website
	        driver.get("https://www.facebook.com");

	        // Print title
	        System.out.println("Page Title: " + driver.getTitle());

	        // Close browser
	        driver.quit();
	    }
	}