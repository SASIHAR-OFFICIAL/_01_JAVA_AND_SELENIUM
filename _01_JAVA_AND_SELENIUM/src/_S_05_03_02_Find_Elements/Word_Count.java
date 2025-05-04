package _S_05_03_02_Find_Elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Word_Count {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.navigate().to("https://www.google.com/");
		Thread.sleep(2000);

		WebElement Search_Bar = d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		Search_Bar.sendKeys("cricket"+Keys.ENTER);
		Thread.sleep(30000);

		List<WebElement> Crickets_in_Result = d.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		int size = Crickets_in_Result.size();
		System.out.println("Crickets_in_Result Size ="+size);
		d.quit();
	}}
