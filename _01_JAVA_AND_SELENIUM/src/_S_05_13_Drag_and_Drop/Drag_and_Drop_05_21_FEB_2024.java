package _S_05_13_Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_05_21_FEB_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://jqueryui.com/droppable/");
		
		//Finding Elements
		
		WebElement iframe_box = d.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
		d.switchTo().frame(iframe_box);
		
		WebElement Sele_logo = d.findElement(By.id("draggable"));
												
		WebElement Drop_location = d.findElement(By.id("droppable"));
		
		Actions Mouse_Action = new Actions(d);
		Mouse_Action.clickAndHold(Sele_logo).moveToElement(Drop_location).release(Drop_location).build().perform();
		Thread.sleep(10000);
		d.close();
		
	}

}
