package _S_03_LAO_ADVANCED;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _18_Upload_Robot_11_LAO_Advanced {

	
		public static void main(String[] args) throws AWTException, InterruptedException {
			// TODO Auto-generated method stub
	System.setProperty("WebDriver.Gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
	FirefoxDriver firefoxDriver = new FirefoxDriver();
	firefoxDriver.get("https://www.leafground.com/file.xhtml");

	WebElement Choose_a_file = firefoxDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div[1]/form/span/span[1]"));
	Choose_a_file.click();
	Thread.sleep(1500);
	String FileName_and_Location = "C:\\Users\\SASIHAR\\Downloads\\sample.xlsx";
	StringSelection Uplading_file = new StringSelection(FileName_and_Location);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Uplading_file, null);
	Thread.sleep(1500);
	Robot Virtual_keyboard = new Robot();
	Virtual_keyboard.keyPress(KeyEvent.VK_CONTROL);
	Virtual_keyboard.keyPress(KeyEvent.VK_V);
	Virtual_keyboard.keyRelease(KeyEvent.VK_V);
	Virtual_keyboard.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1500);
	Virtual_keyboard.keyPress(KeyEvent.VK_ENTER);
	Virtual_keyboard.keyRelease(KeyEvent.VK_ENTER);

	
	}

}
