package _S_04_LetCode_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_SetProperty {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		// email pass
		String email = "koushik350@gmail.com";
		String pass = "Pass123$";
		WebElement signIn = driver.findElement(By.linkText("Log in"));
		signIn.click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		// driver.close();
		driver.quit();
	}
}
