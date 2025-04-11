package _S_05_13_Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_11_April_25 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop.html");
		
		WebElement Drag_box = d.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Drop_box = d.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions Mouse_action1 = new Actions(d);
		Mouse_action1.clickAndHold(Drag_box).moveToElement(Drop_box).release().build().perform();
		Thread.sleep(5000);

		Actions Mouse_action2 = new Actions(d);
		Mouse_action2.dragAndDrop(Drop_box, Drag_box).build().perform();
		Thread.sleep(10000);
		d.quit();
		}}
