package _S_05_07_03_Page_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_Page_Down_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.album.alexflueras.ro/index.php");
		Thread.sleep(1000);
		
		 
	       //It will wait for maximum of 10sec for each object
	       d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    
	       JavascriptExecutor js = (JavascriptExecutor) d;
	     
	       js.executeScript("window.scrollBy(5000,40)","");
	       d.close();
	}

}
