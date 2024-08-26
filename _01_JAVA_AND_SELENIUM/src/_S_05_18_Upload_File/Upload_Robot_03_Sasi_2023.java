package _S_05_18_Upload_File;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_Robot_03_Sasi_2023 {

	
		public static void main(String[] args) throws AWTException, InterruptedException {
			// TODO Auto-generated method stub
//	System.setProperty("WebDriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
//	WebDriver D = new ChromeDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
			WebDriver D = new FirefoxDriver();
	
	D.get("https://testpages.eviltester.com/styled/file-upload-test.html");

	WebElement Choose_a_file = D.findElement(By.id("fileinput"));
	//													
	Choose_a_file.sendKeys("C:\\Users\\ADMIN\\Downloads\\sampleFile.jpeg");
//	Thread.sleep(1500);
//	String FileName_and_Location = "C:\\Users\\ADMIN\\Downloads\\sampleFile.jpeg";
//	StringSelection Uplading_file = new StringSelection(FileName_and_Location);
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Uplading_file, null);
//	Thread.sleep(1500);
//	Robot Virtual_keyboard = new Robot();
//	Virtual_keyboard.keyPress(KeyEvent.VK_CONTROL);
//	Virtual_keyboard.keyPress(KeyEvent.VK_V);
//	Virtual_keyboard.keyRelease(KeyEvent.VK_V);
//	Virtual_keyboard.keyRelease(KeyEvent.VK_CONTROL);
//	Thread.sleep(1500);
//	Virtual_keyboard.keyPress(KeyEvent.VK_ENTER);
//	Virtual_keyboard.keyRelease(KeyEvent.VK_ENTER);

	
	}

}
