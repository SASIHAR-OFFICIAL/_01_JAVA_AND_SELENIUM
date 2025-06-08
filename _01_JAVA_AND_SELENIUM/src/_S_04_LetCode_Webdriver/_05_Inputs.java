package _S_04_LetCode_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Inputs {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		// TC001
		driver.findElement(By.id("fullName")).sendKeys("koushik Chatterjee");
		// TC002
		driver.findElement(By.id("join")).sendKeys(" Youtuber", Keys.TAB);
		// TC003
		String attribute = driver.switchTo()
				.activeElement().getAttribute("value");
		System.out.println(attribute);
		// TC004
		driver.findElement(By.id("clearMe")).clear();
		boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enabled);
		String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		
		System.out.println(isReadOnly);
		
		driver.quit();

	}
}
