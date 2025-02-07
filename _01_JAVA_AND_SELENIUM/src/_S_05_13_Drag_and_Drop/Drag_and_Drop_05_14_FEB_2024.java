package _S_05_13_Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_05_14_FEB_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement Amount_4 = d.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
		WebElement Credit_Amount = d.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
		
		Actions Mouse_Action = new Actions(d);
		
		Mouse_Action.clickAndHold(Amount_4).moveToElement(Credit_Amount).release(Credit_Amount).build().perform();
		Thread.sleep(10000);
		
		
		WebElement Bank_1 = d.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
		WebElement Bank_Holder = d.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
		Mouse_Action.clickAndHold(Bank_1).moveToElement(Bank_Holder).release(Bank_Holder).build().perform();
		d.close();
		
	}

}
