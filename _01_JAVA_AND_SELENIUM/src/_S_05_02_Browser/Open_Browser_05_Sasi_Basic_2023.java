package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Open_Browser_05_Sasi_Basic_2023 {

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
