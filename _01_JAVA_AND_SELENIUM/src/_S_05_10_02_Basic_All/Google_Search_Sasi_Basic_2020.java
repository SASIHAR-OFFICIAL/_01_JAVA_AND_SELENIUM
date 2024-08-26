package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Search_Sasi_Basic_2020 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https:\\www.google.co.in");
d.findElement(By.name("q")).sendKeys("COIMBATORE"+Keys.ENTER);

System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d2 = new FirefoxDriver();
d2.get("https:\\www.google.co.in");
d2.findElement(By.name("q")).sendKeys("COIMBATORE"+Keys.ENTER);

	}

}
