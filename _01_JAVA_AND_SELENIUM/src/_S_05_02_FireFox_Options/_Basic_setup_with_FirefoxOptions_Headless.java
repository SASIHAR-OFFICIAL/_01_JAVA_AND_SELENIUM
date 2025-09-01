package _S_05_02_FireFox_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class _Basic_setup_with_FirefoxOptions_Headless {

	public static void main(String[] args) {
		 // Set path to geckodriver
        //System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");

        // Create FirefoxOptions instance
        FirefoxOptions options = new FirefoxOptions();

        // Example: run in headless mode
        options.addArguments("--headless");

        // Example: set binary path if custom Firefox is installed
        // options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        // Launch Firefox with options
        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}