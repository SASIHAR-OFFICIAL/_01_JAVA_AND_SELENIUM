package _S_05_10_00_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ETRAIN_SendText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://etrain.info/in");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.navigate().refresh();
		Thread.sleep(1000);
		WebElement from = d.findElement(By.xpath("//*[@id=\"tbsfi1\"]"));
		from.sendKeys("C");
		Thread.sleep(1000);
		from.sendKeys("B");
		Thread.sleep(1000);
		from.sendKeys("E");
		Thread.sleep(3000);
		
		WebElement cbe = d.findElement(By.xpath("/html/body/div[2]/div/a/b"));
		Actions Action_click = new Actions(d);
		Action_click.moveToElement(cbe).click();
		Thread.sleep(3000);
		
		
		WebElement To = d.findElement(By.xpath("//*[@id=\"tbsfi3\"]"));
		Thread.sleep(1000);
		To.sendKeys("K");
		Thread.sleep(1000);
		To.sendKeys("M");
		Thread.sleep(1000);
		To.sendKeys("D");
		Thread.sleep(3000);
		
		WebElement kmd = d.findElement(By.xpath("/html/body/div[2]/div[1]/a/b"));
		kmd.click();							
		Thread.sleep(1000);										

		//Action_click.moveToElement(kmd).click();
		
		WebElement Get_Trains = d.findElement(By.xpath("//*[@id=\"tbssbmtbtn\"]"));
		Get_Trains.click();
	}

}
