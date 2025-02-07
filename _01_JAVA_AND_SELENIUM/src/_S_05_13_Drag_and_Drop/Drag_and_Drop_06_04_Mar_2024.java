package _S_05_13_Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_06_04_Mar_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");

WebElement A_box = d.findElement(By.xpath("//*[@id=\"column-a\"]"));
WebElement B_box = d.findElement(By.xpath("//*[@id=\"column-b\"]"));

Actions Mouse_Drag = new Actions(d);

Mouse_Drag.clickAndHold(A_box).moveToElement(B_box).release(B_box).build().perform();
Thread.sleep(3000);
d.close();
	}

}
