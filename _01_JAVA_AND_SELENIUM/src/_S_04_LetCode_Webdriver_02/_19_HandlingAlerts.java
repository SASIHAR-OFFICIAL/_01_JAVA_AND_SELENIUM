package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//Notes:
//Exception: 
//1. UnhandledAlertException
//2. NoAlertPresentException
public class _19_HandlingAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/alert");
		// accept
		driver.switchTo().alert().accept();
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert text "+text);
		alert.accept();
		// prompt
		driver.findElement(By.id("prompt")).click();
		//		System.out.println(driver.getCurrentUrl());
		driver.switchTo().alert();
		alert.sendKeys("koushik");
		System.out.println(alert.getText());
		alert.accept();
		String name = driver.findElement(By.id("myName")).getText();
		System.out.println(name);		
	}

}








