package _S_05_22_Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement First_Date = d.findElement(By.xpath("//*[@id=\"first_date_picker\"]"));
		First_Date.click();
		Thread.sleep(10000);
		WebElement first_click = d.findElement(By.xpath("//span[text()='Prev']"));
		Thread.sleep(10000);
		first_click.click();
		Thread.sleep(10000);
		first_click.click();
		Thread.sleep(10000);
		first_click.click();
	

	}

}
