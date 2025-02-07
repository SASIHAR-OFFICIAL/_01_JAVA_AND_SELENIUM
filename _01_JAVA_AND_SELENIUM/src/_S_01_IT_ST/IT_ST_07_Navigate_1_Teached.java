package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_07_Navigate_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.facebook.com");
		Thread.sleep(5000);
		d.get("http://www.india.com");
	    d.navigate().back();
		Thread.sleep(5000);
	    d.navigate().forward(); 
	    d.navigate().refresh();				
			}

}
