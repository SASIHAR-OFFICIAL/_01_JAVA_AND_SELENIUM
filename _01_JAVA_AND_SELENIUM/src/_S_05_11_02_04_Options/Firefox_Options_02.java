package _S_05_11_02_04_Options;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Options_02 {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxOptions FirefoxOptions_Obj = new FirefoxOptions();
		FirefoxOptions_Obj.addArguments("start-maximized");
		
		FirefoxOptions_Obj.addArguments("Incognito");
		//FirefoxOptions_Obj.set
		//.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		WebDriver driver = new FirefoxDriver(FirefoxOptions_Obj);
		driver.navigate().to("https://www.google.com");
	}

}
