package _S_05_10_02_Mouse_Hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Gecko.DSriver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");

//		WebElement Login_Close = d.findElement(By.xpath("/html/body/div[3]/div/span"));
//		Login_Close.click();
		Thread.sleep(2000);	
		
		
		WebElement Electronics_logo = d.findElement(By.xpath("//*[.='Electronics']"));
		Actions builder = new Actions(d);
		builder.moveToElement(Electronics_logo).click().perform();
		Thread.sleep(5000);	


		WebElement Electronics_logo2 = d.findElement(By.xpath("//*[.='Electronics']"));
		builder.moveToElement(Electronics_logo2).perform();
		Thread.sleep(2000);	
		
		WebElement Samsung = d.findElement(By.xpath("//*[text() = 'Samsung']"));
		builder.moveToElement(Samsung).click().perform();
		Thread.sleep(2000);
	}

}
