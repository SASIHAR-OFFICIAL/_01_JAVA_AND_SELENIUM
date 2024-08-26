package _S_02_LAO_BASIC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class _01_OPEN_BROWSER_LAO_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.google.com");
		F.findElement(By.name("q")).sendKeys("Kovai"+Keys.ENTER);
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver C = new ChromeDriver();
		C.get("https://www.google.com");
		C.findElement(By.name("q")).sendKeys("Kovai"+Keys.ENTER);
						
	}

}
