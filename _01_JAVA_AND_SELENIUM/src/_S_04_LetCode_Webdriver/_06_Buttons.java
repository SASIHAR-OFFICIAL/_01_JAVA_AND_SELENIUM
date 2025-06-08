package _S_04_LetCode_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_Buttons {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		// location
		WebElement btn1 = driver.findElement(By.id("position"));
		Point location = btn1.getLocation();
		System.out.println(location);
		// color
		WebElement btn2 = driver.findElement(By.id("color"));
		String color = btn2.getCssValue("background-color");
		System.out.println(color);
		// width & height
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println("Tall "+ height + " Fat "+width);
		
		boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}
}
