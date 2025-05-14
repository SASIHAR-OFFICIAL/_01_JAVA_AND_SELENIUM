package _S_05_11_02_01_Windows_Handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _19_Window_Handle_Close_Reopen_Sasi_14_May_25 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String window_null = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.co.in/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.bbc.com/tamil");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://tamil.oneindia.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://tamil.webdunia.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://m.dailyhunt.in/news/india/tamil");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.bbc.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.thehindu.com/");

		Set<String> windowHandles = driver.getWindowHandles();

		for (String All_windowHandles :windowHandles) {
			driver.switchTo().window(All_windowHandles);
			if (!All_windowHandles.equals(window_null)) {
				Thread.sleep(1000);
				driver.close();
			}
			
		}
		driver.switchTo().window(window_null);
		
//		if (String i=window_null; ) {
//			
//		}
		 Robot robot = new Robot();

	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		driver.quit();
	}}
