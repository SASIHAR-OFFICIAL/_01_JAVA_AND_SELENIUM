package _S_05_18_Upload_File;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_Robot_14_APRIL_25 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.navigate().to("https://practice.expandtesting.com/upload");
		Thread.sleep(5000);


		WebElement Upload_button = d.findElement(By.xpath("//input[@id='fileInput'][@class='form-control']"));
		Thread.sleep(3000);
		Upload_button.click();
		
//		Actions Action_click  = new Actions(d);
//		Action_click.clickAndHold(Upload_button);
		
//		Robot Robot_obj1 = new Robot();
//		Robot_obj1.keyPress(KeyEvent.VK_ENTER);
//		Robot_obj1.keyRelease(KeyEvent.VK_ENTER);
		
		

//		String File_Upload = "D:\\sele\\JavaFileWrite2.txt";
//		StringSelection File_name = new StringSelection(File_Upload);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(File_name, null);
//
//		Robot Robot_obj = new Robot();
//		Robot_obj.keyPress(KeyEvent.VK_CONTROL);
//		Robot_obj.keyPress(KeyEvent.VK_C);
//		Robot_obj.keyPress(KeyEvent.VK_CONTROL);
//		Robot_obj.keyPress(KeyEvent.VK_V);
//		Robot_obj.keyRelease(KeyEvent.VK_V);
//		Robot_obj.keyRelease(KeyEvent.VK_CONTROL);
//		Robot_obj.keyRelease(KeyEvent.VK_C);
//		Robot_obj.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(3000);
//		Robot_obj.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		System.out.println("Uploaded");

		//		Virtual_Keyboard.keyPress(KeyEvent.VK_CONTROL);
	}

}
