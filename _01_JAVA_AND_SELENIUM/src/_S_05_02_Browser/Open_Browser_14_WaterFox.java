package _S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Open_Browser_14_WaterFox {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");

	        // Configure Waterfox binary
	        FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("C:\\Program Files\\Waterfox\\waterfox.exe");

	        // Launch Waterfox
	        WebDriver driver = new FirefoxDriver(options);
	        driver.get("https://www.google.com");

	        System.out.println("Page Title: " + driver.getTitle());

	        driver.quit();
	    }
	}