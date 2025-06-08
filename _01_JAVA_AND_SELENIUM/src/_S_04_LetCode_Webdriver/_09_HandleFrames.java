package _S_04_LetCode_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_HandleFrames {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("koushik");
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("mail@mail.com");
		driver.switchTo().defaultContent(); 
		driver.findElement(By.tagName("button")).click();
		
//		driver.quit();
				
	}
}
