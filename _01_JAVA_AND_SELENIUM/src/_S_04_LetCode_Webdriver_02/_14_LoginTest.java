package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_LoginTest {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		// load the URL
		driver.get("https://letcode.in/");
		
		// click login btn
		driver.findElement(By.linkText("Log in")).click();
		// enter email id
		driver.findElement(By.name("email"))
		.sendKeys("koushik350@gmail.com");
		// enter password
		driver.findElement(By.name("password"))
		.sendKeys("Pass123$");
		// click login btn
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();

	}

}
