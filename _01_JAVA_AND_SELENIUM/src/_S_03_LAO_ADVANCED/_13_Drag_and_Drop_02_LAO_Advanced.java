package _S_03_LAO_ADVANCED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _13_Drag_and_Drop_02_LAO_Advanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F =new FirefoxDriver();
		F.get("https://demoqa.com/droppable");
		
		WebElement Box_Now = F.findElement(By.id("draggable"));
		WebElement Fixed_Box = F.findElement(By.id("droppable"));
		WebElement Third_box = F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]"));
		
		Actions Draging = new Actions(F);
		Draging.clickAndHold(Box_Now).moveToElement(Third_box).release(Third_box).build().perform();
		
		Thread.sleep(1500);
		Draging.dragAndDrop(Third_box, Fixed_Box).build().perform();
		
	}

}
