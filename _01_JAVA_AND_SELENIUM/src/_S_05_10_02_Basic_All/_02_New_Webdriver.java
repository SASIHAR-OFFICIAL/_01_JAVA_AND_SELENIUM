package _S_05_10_02_Basic_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_New_Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions chromeOptions = new ChromeOptions();
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver(chromeOptions);

// Navigate to the demoqa website
driver.get("https://www.google.com");
	}

}
