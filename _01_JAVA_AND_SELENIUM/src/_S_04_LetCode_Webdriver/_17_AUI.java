package _S_04_LetCode_Webdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _17_AUI {
	
	static ChromeDriver  driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		droppable();
	}
	
	static void draggable() {
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		Point location = src.getLocation();
		builder.dragAndDropBy(src, location.getX()+20, location.getY()+2000)
		.perform();
	}
	static void droppable() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		Point location = src.getLocation();
		builder.dragAndDrop(src, target).build().perform();
	}
}






