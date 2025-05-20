package _S_05_23_2_Advanced_All;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BSNL {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://cymn.bsnl.co.in/cymnportal/Home.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Andhra
		driver.findElement(By.xpath("//*[contains(text(),'ANDHRA')]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"choosenum\"]"));
		Select select_obj = new Select(element);
		select_obj.selectByVisibleText("Search with start number");
		driver.findElement(By.xpath("//input[@placeholder='search with start number']")).sendKeys("96266");
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		//Andhra 2
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://cymn.bsnl.co.in/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[contains(text(),'ANDHRA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fancy Numbers(Fixed Price)')]")).click();
		//Thread.sleep(1500);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"fancy_blk\"]"));
		Select select_obj2 = new Select(element2);
		select_obj2.selectByVisibleText("Search with start number");
		//Thread.sleep(3000);                                   
		driver.findElement(By.xpath("//input[@id='start_fancy']")).sendKeys("96266");
		//Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"searchID\"]")).click();
	
		//KERALA
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://cymn.bsnl.co.in/");
		driver.findElement(By.xpath("//*[contains(text(),'KERALA')]")).click();
		WebElement elementK1 = driver.findElement(By.xpath("//*[@id=\"choosenum\"]"));
		Select select_objK1 = new Select(elementK1);
		select_objK1.selectByVisibleText("Search with start number");
		driver.findElement(By.xpath("//input[@placeholder='search with start number']")).sendKeys("96266");
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		//KERALA2 2
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://cymn.bsnl.co.in/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[contains(text(),'KERALA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fancy Numbers(Fixed Price)')]")).click();
		//Thread.sleep(1500);
		WebElement elementK2 = driver.findElement(By.xpath("//select[@id=\"fancy_blk\"]"));
		Thread.sleep(1500);
		Select select_objK2 = new Select(elementK2);
		Thread.sleep(10000);
		//select_objK2.selectByValue("1");
		//Thread.sleep(3000);                                   
		driver.findElement(By.xpath("//input[@id='start_fancy']")).sendKeys("96266");
		//Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"searchID\"]")).click();
		}
}