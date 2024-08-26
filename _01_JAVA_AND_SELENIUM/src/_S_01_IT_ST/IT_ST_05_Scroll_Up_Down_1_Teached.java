package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IT_ST_05_Scroll_Up_Down_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(8000);
		d.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,3250)", "");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-1250)", "");
     

	
			
			}

}

