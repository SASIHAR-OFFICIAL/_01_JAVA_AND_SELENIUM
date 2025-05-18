package _S_05_10_05_Screen_Shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.bbc.com/tamil");
		
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:/17may25.png"));

	}

}
