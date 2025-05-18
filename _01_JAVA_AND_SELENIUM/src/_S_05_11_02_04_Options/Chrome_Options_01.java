package _S_05_11_02_04_Options;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ChromeOptions_Obj = new ChromeOptions();
		ChromeOptions_Obj.addArguments("start-maximized");
		
		ChromeOptions_Obj.addArguments("Incognito");
		ChromeOptions_Obj.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(ChromeOptions_Obj);
		driver.navigate().to("https://www.google.com");
	}

}
