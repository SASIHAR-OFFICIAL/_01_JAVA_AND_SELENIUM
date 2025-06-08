package _S_04_LetCode_Webdriver_02;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_LearnImplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("ema"))
		.sendKeys("koushik350@gmail.com");
		driver.findElement(By.tagName("password"))
		.sendKeys("Pass123$");
	}

}
