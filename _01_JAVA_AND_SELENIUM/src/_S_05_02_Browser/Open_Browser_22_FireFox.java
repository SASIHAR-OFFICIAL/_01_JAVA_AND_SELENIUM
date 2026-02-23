package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_Browser_22_FireFox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://etrain.info");
		Thread.sleep(3000);
		WebElement from = d.findElement(By.xpath("//*[@id=\"tbsfi1\"]"));
		from.sendKeys("CBE");
		
		Thread.sleep(1500);
//		Actions Mouse_Action = new Actions(d);
		WebElement CBE = d.findElement(By.xpath("/html/body/div[2]/div/a/b"));
		CBE.click();
		

	}

}
