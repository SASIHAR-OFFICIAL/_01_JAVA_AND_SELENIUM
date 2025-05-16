package _S_05_11_02_03_Windows_Handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows_Handle_01_14_May_25 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.docker.com/");
		
		WebElement Accept_cookies = driver.findElement(By.xpath("//*[contains(text(),'Accept')]"));
		Accept_cookies.click();
		
		String CTR_Enter = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		WebElement SignIN = driver.findElement(By.cssSelector("[class=\"wp-block-ponyo-button button-style__secondary button-size__small \"]"));
		SignIN.sendKeys(CTR_Enter);
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator_obj = windowHandles.iterator();
		String iterator__Window_1 = iterator_obj.next();
		String iterator__Window_2 = iterator_obj.next();
		
		driver.switchTo().window(iterator__Window_2);
		
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_1);
		Thread.sleep(1000);driver.switchTo().window(iterator__Window_2);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_1);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_2);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_1);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_2);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_1);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_2);
		Thread.sleep(1000);
		driver.switchTo().window(iterator__Window_1);
		Thread.sleep(1000);
		driver.quit();
	}

}
