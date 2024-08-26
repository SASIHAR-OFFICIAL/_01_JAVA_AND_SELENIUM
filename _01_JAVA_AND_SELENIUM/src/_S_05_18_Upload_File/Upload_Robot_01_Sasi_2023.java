package _S_05_18_Upload_File;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_Robot_01_Sasi_2023 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		//WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/upload/");
//		Thread.sleep(10000);
//		
		driver.get("https://demo.guru99.com/test/upload/");
//		WebElement Button = driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
//														
//		Button.click();
driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\ADMIN\\Downloads\\sampleFile.jpeg");


//		Thread.sleep(1500);
//
//		String File_Name_and_Loaction = "C:\\Users\\ADMIN\\Downloads\\TestLeaf Logo.png";
//		StringSelection File_Upload = new StringSelection(File_Name_and_Loaction);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(File_Upload,null);
//		
//		Thread.sleep(1500);
//
//		Robot Virtual_Keyboard = new Robot();
//		Virtual_Keyboard.keyPress(KeyEvent.VK_CONTROL);
//		Virtual_Keyboard.keyPress(KeyEvent.VK_V);
//		Virtual_Keyboard.keyRelease(KeyEvent.VK_V);
//		Virtual_Keyboard.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(1500);
//		Virtual_Keyboard.keyPress(KeyEvent.VK_ENTER);
//		Virtual_Keyboard.keyRelease(KeyEvent.VK_ENTER);

	}

}
