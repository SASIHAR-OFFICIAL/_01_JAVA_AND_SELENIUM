package _S_05_12_Frame;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_01_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exee");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/frame.html");*/

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/frame.html");
		
		//1. Switch to First frame box (I am inside a frame ) and click
		d.switchTo().frame(0);
		WebElement clikMe1 = d.findElement(By.id("Click"));
		String ClickMeBox1 = clikMe1.getText();
		System.out.println("Click Me Box 1 = " +ClickMeBox1);
		clikMe1.click();
		String afterClikMe1 = d.findElement(By.id("Click")).getText();
		System.out.println("After Clicking Click Me Box 1 = " +afterClikMe1);

		//2. Switching to Default page we get first
		d.switchTo().defaultContent();  
		//3. Switch to Second frame box (I am inside a nested frame)
		d.switchTo().frame(1);
		d.switchTo().frame("frame2");

		WebElement clikMe2 = d.findElement(By.id("Click1"));
		String ClickMeBox2 = clikMe2.getText();
		System.out.println("Click Me Box 2 = " +ClickMeBox2);
		clikMe2.click();
		String afterClikMe2 = d.findElement(By.id("Click1")).getText();
		System.out.println("After Clicking Click Me Box 2 = " +afterClikMe2);

		//4. Switching to Default page we get first

		d.switchTo().defaultContent();  
		List<WebElement> howManyFrame = d.findElements(By.tagName("iframe"));
		int size = howManyFrame.size();
		System.out.println("No. of Frames are : "+size);
		d.quit();
		
	
}
}
