package _S_05_18_Upload_File;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_Robot_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/upload.html");

		Thread.sleep(2000);
		Actions click = new Actions(d);
		WebElement uploadbutton = d.findElement(By.name("filename"));
		click.moveToElement(uploadbutton).click().build().perform();
		
		Thread.sleep(2000);
		// StringSelection class is used to convert java string to plain text
		StringSelection selectedFile = new StringSelection("H:\\SELENIUM\\selenium 4.txt");
		//to send file location to 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectedFile, null);

		Robot CursorAction = new Robot();
		CursorAction.keyPress(KeyEvent.VK_CONTROL);
		CursorAction.keyPress(KeyEvent.VK_V);
		CursorAction.keyRelease(KeyEvent.VK_V);		
		CursorAction.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		CursorAction.keyPress(KeyEvent.VK_ENTER);
		CursorAction.keyRelease(KeyEvent.VK_ENTER);
	}

}
