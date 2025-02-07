package _S_05_13_Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_01_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from = d.findElement(By.id("draggable"));
		WebElement to = d.findElement(By.id("droppable"));
				//wrapper outside screen
		Actions actions = new Actions(d);
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform(); // OPtion 1
		actions.dragAndDrop(from, to).build().perform(); // OPtion 2
		
	}

}
