package _S_04_LetCode_Webdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15_LoginTest {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		String email = "koushik350@gmail.com";
		String pass = "Pass123$";
		WebElement signIn = driver.findElement(By.linkText("Log in"));
		signIn.click();
		driver.findElement(By.name("email1")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	}

}




