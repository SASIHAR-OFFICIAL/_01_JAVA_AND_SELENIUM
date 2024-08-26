package _S_05_18_Upload_File;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_Robot_Sasi_Home {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.get("https://www.foundit.in/");

		String Window_0 = D.getWindowHandle();

		WebElement  Upload_resume = D.findElement(By.xpath("/html/body/div[5]/section[1]/div/div[3]/div[2]/div[1]/i"));
		Upload_resume.click();

		Set<String> Window_All = D.getWindowHandles();
		for (String  Window_2:Window_All ) {
			D.switchTo().window(Window_2);
		}
		//Thread.sleep(4000);
		Actions builder = new Actions(D);

		builder.moveToElement(D.findElement(By.xpath("//input[@id='file-upload']"))).click().build().perform();

		//D.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(Keys.ENTER); 		NOT WORKING
		//D.findElement(By.xpath("//*[@id='file-upload']")).sendKeys("D:\\RESUME.DOCX"); 		NOT WORKING
		
		String File_Name_Location = "D:\\RESUME.DOCX";
		StringSelection Uplading_file = new StringSelection(File_Name_Location);
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
		
		String currentUrl = D.getCurrentUrl();
		System.out.println("currentUrl = "+currentUrl);	
		//String pageSource = D.getPageSource();
		//System.out.println("pageSource = "+pageSource);
	}
}
